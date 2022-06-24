package com.shf.singleton;

public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.instance;
        System.out.println(s);
    }
}
