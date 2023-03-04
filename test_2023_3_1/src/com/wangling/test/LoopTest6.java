package com.wangling.test;

import java.util.Scanner;

public class LoopTest6 {
    /*
        案例2:求平方根
        需求:键盘录入一个大于等于2的整数X，计算并返回X的平方根结果只保留整数部分，小数部分将被舍去
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数计算平方根：");
        int num = scan.nextInt();
        int i = 0;
        for( i = 1;i < num;i++){
            if(i * i == num){
                System.out.println(i + "就是" + num + "的平方根");
                break;
            }else if(i * i > num){
                System.out.println((i - 1) + "是" + num + "平方根的整数部分");
                break;
            }
        }
    }
}
