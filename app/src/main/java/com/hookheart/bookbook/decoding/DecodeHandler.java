/*
 * Copyright (C) 2010 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hookheart.bookbook.decoding;

import java.util.Hashtable;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.hookheart.bookbook.camera.CameraManager;
import com.hookheart.bookbook.camera.PlanarYUVLuminanceSource;
import com.hookheart.bookbook.ui.CaptureActivity;

import book.hookheart.com.com.R;


/**
 * 解码handler
 */
final class DecodeHandler extends Handler
{
    private static final String TAG = DecodeHandler.class.getSimpleName();

    /**
     * 捕获activity
     */
    private final CaptureActivity activity;
    /**
     * 定义解码器
     */
    private final MultiFormatReader multiFormatReader;

    DecodeHandler(CaptureActivity activity,
            Hashtable<DecodeHintType, Object> hints)
    {
        /**
         * 初始化一个解码器
         */
        multiFormatReader = new MultiFormatReader();
        /**
         * 用在decodeThread中设置的格式设置解码器
         */
        multiFormatReader.setHints(hints);
        
        this.activity = activity;
    }

    @Override
    public void handleMessage(Message message)
    {
        switch (message.what)
        {
            case R.id.decode:
                // Log.d(TAG, "Got decode message");
                /**
                 * 处理发送过来的图片数据
                 */
                decode((byte[]) message.obj, message.arg1, message.arg2);
                break;
            case R.id.quit:
                /**
                 * 退出looper线程（解码线程）
                 */
                Looper.myLooper().quit();
                break;
        }
    }

    /**
     * Decode the data within the viewfinder rectangle, and time how long it
     * took. For efficiency, reuse the same reader objects from one decode to
     * the next.
     * 
     * @param data
     *            The YUV preview frame.
     * @param width
     *            The width of the preview frame.
     * @param height
     *            The height of the preview frame.
     */
    private void decode(byte[] data, int width, int height)
    {
        long start = System.currentTimeMillis();
        Result rawResult = null;
        /**
         * 将相机获取的图片数据转化为binaryBitmap格式
         */
        //PlanarYUVLuminanceSource source = CameraManager.get()
        //        .buildLuminanceSource(data, width, height);
        byte[] rotatedData = new byte[data.length];  
        for (int y = 0; y < height; y++) {  
            for (int x = 0; x < width; x++)  
            rotatedData[x * height + height - y - 1] = data[x + y * width];  
        }  
        int tmp = width; // Here we are swapping, that's the difference to #11  
        width = height;  
        height = tmp;  
        PlanarYUVLuminanceSource source = CameraManager.get().buildLuminanceSource(rotatedData, width, height);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        try
        {
            /**
             * 解析转化后的图片，得到结果
             */
            rawResult = multiFormatReader.decodeWithState(bitmap);
        }
        catch (ReaderException re)
        {
            // continue
        }
        finally
        {
            multiFormatReader.reset();
        }

        if (rawResult != null)
        {
            long end = System.currentTimeMillis();
            Log.d(TAG, "Found barcode (" + (end - start) + " ms):\n"
                    + rawResult.toString());
            /**
             * 如果解析结果不为空，就是解析成功了，则发送成功消息，将结果放到message中
             */
            Message message = Message.obtain(activity.getHandler(),
                    R.id.decode_succeeded, rawResult);
            Bundle bundle = new Bundle();
            bundle.putParcelable(DecodeThread.BARCODE_BITMAP,
                    source.renderCroppedGreyscaleBitmap());
            message.setData(bundle);
            // Log.d(TAG, "Sending decode succeeded message...");
            message.sendToTarget();
        }
        else
        {
            /**
             *  否则发送失败message
             */
            Message message = Message.obtain(activity.getHandler(),
                    R.id.decode_failed);
            message.sendToTarget();
        }
    }
}
