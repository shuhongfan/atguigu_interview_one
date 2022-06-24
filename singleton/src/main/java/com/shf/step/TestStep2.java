package com.shf.step;

public class TestStep2 {
    public static int loop(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }

        if (n == 1 || n == 2) {
            return n;
        }

        int one = 2; // 初始化走到第二级台阶的走法
        int two = 1; // 初始化走到第一级台阶的走法
        int sum = 0;  // 总步数

        for (int i = 3; i <= n; i++) {
//        最后跨2步+最后跨1步的走法
            sum = two + one;
            two = one;  // two保存最后走两步
            one = sum;  //one保存最后走一步
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(loop(40));
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
