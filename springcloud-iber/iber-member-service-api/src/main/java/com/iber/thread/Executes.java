package com.iber.thread;


import com.iber.util.PropertyUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lf on 2017/3/14.
 * 线程池
 */
public class Executes {

    /**创建线程池数据*/
    private static final Integer IBER_THREAD_NUM ;// 线程池初始数量
    private static final ExecutorService EXECUTES;// 创建线程池

    static {
        IBER_THREAD_NUM = Integer.valueOf(PropertyUtil.getString("iber_thread_num"));
        EXECUTES = newFixedThreadPool(IBER_THREAD_NUM,1024);

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                EXECUTES.shutdown();
            }
        });
    }

    public static void execute(Runnable runnable){
        EXECUTES.execute(runnable);
    }

    public static ExecutorService newFixedThreadPool(int nThreads,int queueSize) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(queueSize));
    }

}
