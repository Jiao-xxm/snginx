package com.yuhan.snginx.util.sinlgeton;

/**
 * @author yuzhuJiao
 * @since 2023/08/26
 * @link <a href="https://blog.csdn.net/weixin_42214038/article/details/109577810">...</a>
 */
public class Singleton {
    /**
     * 1. 为 instance 分配空间
     * 2. 初始化
     * 3. 将初始化后的对象指向分配的空间
     *  此处的 volatile 是防止指令重排序导致的初始化未完成而获得一个空的单例对象
     *  另外保证了多线程运行时的可见行，防止出现
     */
    private static volatile Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
