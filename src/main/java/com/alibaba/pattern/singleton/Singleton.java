package com.alibaba.pattern.singleton;

/**
 * 类Singleton.java的实现描述：TODO 单例 
 * @author tony 2015年8月11日 上午9:05:28
 * 懒汉，饿汉，双重校验锁，枚举和静态内部类。一般建议用静态内部类和枚举
 */

public class Singleton {
    //version 1.0 懒汉，调用getInstance才加载
    //问题：多个进程同时通过 (singleton== null)的条件检查，导致多个实例被创建出来。所以改进见version1.1
    private static Singleton singleton;
    private Singleton(){}//1.构造方法私有，所以不能实例；
    
    //取实例时，只需要使用Singleton.getInstance()就行了。
    public static Singleton getInstance(){//2.既然不能实例，所以需要一个静态方法让其实例；
        //3.判断是否已经实例，如果已形成则直接返回，否则创建实例。
        if(singleton == null){
            singleton = new Singleton();
        }
        //version 1.1 线程安全的懒汉（这里的synchronized也可以加在方法上）
        //问题：虽然线程安全，但本来多线程只是new的时候同步，有就不创建了，后面其他线程还可以读。
        //     但现在所有线程调用getInstance()都需要同步，效率低下。所以改进见version1.2
        /*
        synchronized (Singleton.class) {
            if (singleton== null) {
                singleton= new Singleton();
            }
         }
         */
        //version 1.2 双重校验锁的懒汉。
        //描述：加个判断条件，如果对象已经创建了，那么就不需要线程的同步了。同时考虑到原子性，需要将singleton改为volatile。
        //问题：太复杂了，且在1.5之后用volatile才可以，之前的内存模型有问题。所以改进见version1.3
        /*
        if (singleton== null)  {
            synchronized (Singleton.class) {
                if (singleton== null)  {
                    singleton= new Singleton();//这句代码不是原子性
                }
            }
        }
        */
        return singleton;
    }
    
    
    //verison 1.3 饿汉。在类装载时就实例化
    //问题：我们有时候是需要动态加载和延迟加载的，即需要的时候调用getInstance再加载，而不是将加载逻辑交给类加载器。改进见1.4
    /*
     //实例被声明成 static 变量了，在第一次加载类到内存中时就会初始化，所以创建实例本身是线程安全的.
     private volatile static Singleton singleton = new Singleton();
     private Singleton(){}
     public static Singleton getInstance()   {
        return singleton;
     }
     */
    
    //verison 1.4 饿汉改进 静态内部类。
    //描述：由于 SingletonHolder 是私有的，因此它只有在getInstance()被调用时才会真正创建；
    //同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。
    /*
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
     */
    
    //verison 1.5 枚举
    //默认枚举实例的创建是线程安全的，所以不需要担心线程安全的问题。通过Singleton.INSTANCE来访问
    /*
    public enum Singleton{
       INSTANCE;
    }
    */
    
}
