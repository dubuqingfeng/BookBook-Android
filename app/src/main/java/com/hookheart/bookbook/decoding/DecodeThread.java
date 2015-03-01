/*
 * Copyright (C) 2008 ZXing authors
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
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import android.os.Handler;
import android.os.Looper;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.hookheart.bookbook.ui.CaptureActivity;

/**
 * This thread does all the heavy lifting of decoding the images.
 * 
 * @author dswitkin@google.com (Daniel Switkin)
 */
final class DecodeThread extends Thread
{

    public static final String BARCODE_BITMAP = "barcode_bitmap";

    /**
     * 捕获activity
     */
    private final CaptureActivity activity;
    /**
     * 定义一个容器，存放解码格式，字符集，结果回调类
     */
    private final Hashtable<DecodeHintType, Object> hints;
    /**
     * 定义解码handler
     */
    private Handler handler;
    /**
     * 线程安全的数数装置
     */
    private final CountDownLatch handlerInitLatch;

    DecodeThread(CaptureActivity activity, Vector<BarcodeFormat> decodeFormats,
            String characterSet, ResultPointCallback resultPointCallback)
    {

        this.activity = activity;
        /**
         * 设置计数为1
         */
        handlerInitLatch = new CountDownLatch(1);

        /**
         * 定义容器
         */
        hints = new Hashtable<DecodeHintType, Object>(3);

        /**
         * 设置解码格式，然后放到容器中
         */
        if (decodeFormats == null || decodeFormats.isEmpty())
        {
            decodeFormats = new Vector<BarcodeFormat>();
            decodeFormats.addAll(DecodeFormatManager.ONE_D_FORMATS);
            decodeFormats.addAll(DecodeFormatManager.QR_CODE_FORMATS);
            decodeFormats.addAll(DecodeFormatManager.DATA_MATRIX_FORMATS);

        }
        hints.put(DecodeHintType.POSSIBLE_FORMATS, decodeFormats);

        /**
         * 如果字符集不为空，放到容器中
         */
        if (characterSet != null)
        {
            hints.put(DecodeHintType.CHARACTER_SET, characterSet);
        }

        /**
         * 将结果回调函数放到容器中,这里的hints会被设置到解码器中，当解码器解析图片的时候会将可能是二维码的点返回到这个回调函数中
         * 就是foundPossibleResultPoint(ResultPoint point)这个方法，所以我们只要在这个方法中调用View绘制
         * 的方法，将这些可能点绘制出来，就是我们扫描看到的绿点
         */
        hints.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK,
                resultPointCallback);
    }

    Handler getHandler()
    {
        try
        {
            /**
             * 等待，当计数为0的时候继续往下执行
             */
            handlerInitLatch.await();
        }
        catch (InterruptedException ie)
        {
            // continue?
        }
        return handler;
    }

    @Override
    public void run()
    {
        Looper.prepare();
        /**
         * 定义解码handler
         */
        handler = new DecodeHandler(activity, hints);
        /**
         * 计算减1
         */
        handlerInitLatch.countDown();
        Looper.loop();
    }

}
