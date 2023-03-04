package com.wangling.test;

public class LoopTest4 {
    public static void main(String[] args){
        /*
        回力题
        需求:给你一个整数X。
        如果x是一个回文整数，打印 true ，否则，返回 false.
        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数
        例如，121 是回文，而 123 不是。
         */

        int x = 12345;
        int tmp = x;
        int num = 0;
        while(x != 0){
            //拿到从右向左的数
            int ge = x % 10;
            //拿到了1 在去找下一位
            x = x / 10;
            //放起来
            num = num * 10 + ge;
        }
        //打印num
        System.out.println(num);
        System.out.println(x);
        //比较
        System.out.println(num == tmp);
    }
}
