package com.shf.loading;

/**
 * 类初始化过程
 * 1. 一个类要创建实例需要先加载并初始化该类
 *      main方法所在的类需要先加载和初始化
 * 2. 一个子类要初始化需要先初始化父类
 * 3. 一个类初始化就是执行<clinit>()方法
 *      <clinit>()方法由静态类变量显示赋值代码和静态代码块组成
 *      类变量显示赋值代码和静态代码块代码从上到下顺序执行
 *      <clinit>()方法只执行一次
 */

/**
 * 实例初始化过程
 *      实例初始化就是执行<init>()方法
 * <init>()方法可能重载有多个，有几个构造器就有几个<init>方法
 * <init>()方法由非静态实例变量显示赋值代码和非静态代码块、对应构造器代码组成
 * 非静态实例变量显示赋值代码和非静态代码块代码从上到下顺序执行，而对应构造器的代码最后执行
 * 每次创建实例对象，调用对应构造器，执行的就是对应的<init>方法
 * <init>方法的首行是super()或super(实参列表)，即对应父类的<init>方法
 */

/**
 * 子类的初始化<clinit> 类初始化过程
 *     1. 静态类变量显示赋值代码 j = method()
 *     2 子类的静态代码块
 * 初始化父类：（5）、（1）
 * 初始化子类：（10）、（6）
 *
 * 子类的实例化方法：
 *      1. super()  （9）、（3）、（2）
 *      2. i = test();  （9）
 *      3. 子类的非静态代码块  （8）
 *      4. 子类的无参构造（最后）  （7）
 *
 *  因为创建了两个Son对象，因此实例<init>初始化方法执行了两次
 *
 */
public class Son extends Father{
    private int i = test();
    private static int j = method();

    static {
        System.out.println("(6)");
    }

    Son(){
//        super(); // 写或者不写都在，在子类构造器中一定会调用父类的构造器
        System.out.println("(7)");
    }

    {
        System.out.println("(8)");
    }

    public int test(){
        System.out.println("(9)");
        return 1;
    }

    public static int method(){
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}
