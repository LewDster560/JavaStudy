package com.ld.design.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author LiuDong
 * @date 2019-8-16
 */
public class MultiThread {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);

        for (ThreadInfo info : threadInfos) {
            System.out.println("id:" + info.getThreadId() + "/name:" + info.getThreadName());
        }
    }
}
