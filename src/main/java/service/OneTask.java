package service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/9/27.
 * <p/>
 * 单个任务
 */
public class OneTask extends Thread {
    // 正在执行的线程
    private static List<Thread> runningThreads = new ArrayList<Thread>();

    @Override
    public void run() {
        // 注册线程
        regist(this);
        // 打印开始标记
        System.out.println(Thread.currentThread().getName() + "开始...");

        // 处理

        unRegist(this);// 线程结束时取消注册
        // 打印结束标记
        System.out.println(Thread.currentThread().getName() + "结束.");
    }

    public void regist(Thread thread) {
        synchronized (runningThreads) {
            runningThreads.add(thread);
        }
    }

    public void unRegist(Thread thread) {
        synchronized (runningThreads) {
            runningThreads.remove(thread);
        }
    }

    public static boolean hasThreadRunning() {
        // 通过判断runningThreads是否为空就能知道是否还有线程未执行完
        return (runningThreads.size() > 0);
    }
}
