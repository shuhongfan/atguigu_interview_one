package com.shf.step;

/**
 * 编程题：有n步台阶，一次只能上1步或2步。共有多少种走法？
 */

/**
 * 方法调用自身称为递归，利用变量的原值推出新值称为迭代。
 *  递归
 *      优点：大问题转化为小问题，可以减少代码量，同时代码精简，可读性好；
 *      缺点：递归调用浪费了空间，而且递归太深容易造成堆栈的溢出。
 *  迭代
 *      优点：代码运行效率好，因为时间只因循环次数增加而增加，而且没有额外的空间开销；
 *      缺点：代码不如递归简洁，可读性好
 */
public class TestStep {

    /**
     * 递归
     * n=1  一步
     * n=2  一步一步 / 直接两步
     * n=3  ->(1)先到达f(1)，然后从f(1)直接跨2步
     *          (2)先到达f(2)，然后从f(2)跨1步
     * @param n
     * @return
     */
    public static int f(int n){
        if (n<1){
            throw new IllegalArgumentException(n+"不能小于1");
        }
        if (n==1||n==2){
            return n;
        }
        return f(n-2)+f(n-1);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(f(40));
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
