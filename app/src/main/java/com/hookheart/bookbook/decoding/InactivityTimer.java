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
 * ��activityһ��ʱ��������û�з�������ά�룬�ͽ���activity����Ϊ��ʱ�䲻�ϻ�ȡͼƬ���ĵ���Դ�п���ʹ��������
 */
public final class InactivityTimer
{

    /**
     * ������ȴ�ʱ�䣬�����ʱ����û�з����ö�ά�룬����activity
     */
    private static final int INACTIVITY_DELAY_SECONDS = 60;

    /**
     * ��ʱ����
     */
    private final ScheduledExecutorService inactivityTimer = Executors
            .newSingleThreadScheduledExecutor(new DaemonThreadFactory());
    /**
     * ��Ҫ��ʱ������activity
     */
    private final Activity activity;
    /**
     * ��ʱ������
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
         * ���ö�ʱ��
         */
        inactivityFuture = inactivityTimer.schedule(
                new FinishListener(activity), INACTIVITY_DELAY_SECONDS,
                TimeUnit.SECONDS);
    }

    /**
     * @Description:��ն�ʱ��
     */
    private void cancel()
    {
        if (inactivityFuture != null)
        {
            /**
             * ȡ����ʱ����
             */
            inactivityFuture.cancel(true);
            inactivityFuture = null;
        }
    }

    /**
     * 
     * @Description:�رն�ʱ����Ͷ�ʱ�����÷�����activity����ʱ�е��ã�����������ʱ����Ͷ�ʱ��
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
             * �÷�������threadFactory��ڣ���һ��runnable���󷵻�һ��thread���󣨰�װrunnbale��
             */
            Thread thread = new Thread(runnable);
            /**
             * ����Ϊ�ػ��̣߳����ƺ�̨���񣬵������û��߳̽����󣬸��̻߳��Զ���������Ϊ��activity��������������ø�
             * �̣߳�����ָFinishListener��Ϊ�ػ��̣߳��ͻᵼ�¸��߳��޷�����
             */
            thread.setDaemon(true);
            return thread;
        }
    }

}
