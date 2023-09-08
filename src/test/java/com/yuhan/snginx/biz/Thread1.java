package com.yuhan.snginx.biz;

import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

/**
 * @author yuzhuJiao
 * @since 2023/08/28
 */
public class Thread1 extends Thread {
    private final RLock lock;

    public Thread1(RLock lock){
        this.lock = lock;
    }

    public void run() {
        boolean b = false;
        try {
            b = lock.tryLock(1L, 10, TimeUnit.SECONDS);
            System.out.printf("th1 %s", String.valueOf(b));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}