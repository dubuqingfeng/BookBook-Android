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

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import android.app.Activity;

/**
 * Finishes an activity after a period of inactivity.
 * 当activity一定时间后如果还没有分析出二维码，就结束activity，因为长时间不断获取图片消耗的资源有可能使机器奔溃
 */
public final class InactivityTimer
{

    /**
     * 设置最长等待时间，如果该时间内没有分析好二维码，结束activity
     */
    private static final int INACTIVITY_DELAY_SECONDS = 60;

    /**
     * 定时服务
     */
    private final ScheduledExecutorService inactivityTimer = Executors
            .newSingleThreadScheduledExecutor(new DaemonThreadFactory());
    /**
     * 需要定时结束的activity
     */
    private final Activity activity;
    /**
     * 定时控制器
     */
    private ScheduledFuture<?> inactivityFuture = null;

    public InactivityTimer(Activity activity)
    {
        this.activity = activity;
        onActivity();
    }

    public void onActivity()
    {
        cancel();
        /**
         * 设置定时器
         */
        inactivityFuture = inactivityTimer.schedule(
                new FinishListener(activity), INACTIVITY_DELAY_SECONDS,
                TimeUnit.SECONDS);
    }

    /**
     * @Description:清空定时器
     */
    private void cancel()
    {
        if (inactivityFuture != null)
        {
            /**
             * 取消定时任务
             */
            inactivityFuture.cancel(true);
            inactivityFuture = null;
        }
    }

    /**
     * 
     * @Description:关闭定时服务和定时器，该方法在activity结束时有调用，用来结束定时服务和定时器
     */
    public void shutdown()
    {
        cancel();
        inactivityTimer.shutdown();
    }

    private static final class DaemonThreadFactory implements ThreadFactory
    {
        public Thread newThread(Runnable runnable)
        {
            /**
             * 该方法来自threadFactory接口，给一个runnable对象返回一个thread对象（包装runnbale）
             */
            Thread thread = new Thread(runnable);
            /**
             * 设置为守护线程，类似后台服务，当所有用户线程结束后，该线程会自动结束，因为当activity结束后，如果不设置该
             * 线程（这里指FinishListener）为守护线程，就会导致该线程无法结束
             */
            thread.setDaemon(true);
            return thread;
        }
    }

}
