package com.shf.singleton;

/**
 * 懒汉式：延迟创建对象 静态内部类形式（适用于多线程）
 * 在内部类被加载和初始化时，才创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，它是单独去加载和初始化的
 * 因为是在内部类加载和初始化时，创建的，因此线程是安全的
 */
public class Singleton6 {
    private Singleton6(){

    }

    private static class Inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }
}