package com.powernode.designpattern.singleton.lazysingleton;

import java.io.ObjectStreamException;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/11
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getId()+":"+instance);
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getId()+":"+instance);
            }
        });
        thread.start();
        thread2.start();



    }
}
class LazySingleton{
    private volatile static LazySingleton instance;
    private LazySingleton(){

    }

    /**
     * 双重检查，这种方式比在方法上直接加锁要更高效，因为不会把所有线程都上锁
     * 只在未实例化单例时进行上锁，实例化后的再有多线程同时获取对象，都会直接return实例
     * @return
     */
    public static LazySingleton getInstance(){
        if (instance==null){
            synchronized (LazySingleton.class){
                if (instance==null){
                    instance=new LazySingleton();
                    /*
                        创建对象的过程：
                        1、分配空间
                        2、初始化
                        3、引用赋值
                        2和3可能会进行指令重排序，那么当一个线程先在执行3后执行2时，另外一个线程会获取引用，
                        但此时由于重排序的存在，instance变量未进行初始化，那么有可能会在线程2中发生空指针异常
                        所以要给实例加上volatile关键字，禁止重排序
                     */
                }
            }
        }
        return instance;
    }

    public Object readResolve() throws ObjectStreamException{
        return instance;
    }


}
