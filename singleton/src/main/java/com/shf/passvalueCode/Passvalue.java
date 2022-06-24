package com.shf.passvalueCode;

import java.util.Arrays;

/**
 * 方法的参数传递机制：
 * 1.形参是基本数据类型
 *      传递数据值
 * 2.实参是引用数据类型
 *      传递地址值
 *      特殊的类型：String、包装类等对象不可变性
 */
public class Passvalue {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = new int[]{1, 2, 3, 4, 5};
        MyData my = new MyData();
        change(i, str, num, arr, my);
        System.out.println("i = " + i);
        System.out.println("str = " + str);
        System.out.println("num = " + num);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("my.a = " + my.a);
    }

    public static void change(int j, String s, Integer n, int[] a, MyData m) {
        ++j;
        s = s + "world";
        n = n + 1;
        int var10002 = a[0]++;
        ++m.a;
    }
}
