package com.shf.singleton;

import com.shf.single.Singleton3;

public class TestSingleton3 {
    public static void main(String[] args) {
        Singleton3 s = Singleton3.INSTANCE;
        System.out.println(s);
    }
}
