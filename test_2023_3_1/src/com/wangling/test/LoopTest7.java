package com.wangling.test;

//导包
import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        //需求: 程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少?

        //生成一个1 ~ 100的随机数
        //创建对象
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        //生成随机数
        //在小括号中，书写的是生成随机数的范围
        //这个范围一定是从0开始的。
        //到这个数-1结束 比如100 其实是0~99
        //口诀：包头不包围，包左不包右

        //生成一个1~100之间的数 公式：(b - a + 1) + a);
        int num = r.nextInt(100) + 1;

        //生成一个计数器 到多少提示猜中了
        int count = 0;
        while(true){
            System.out.println("猜数字，请输入一个数：");
            int guess = scan.nextInt();

            //保底机制
            if( count == 3 ){
                System.out.println("恭喜你！猜中了");
                break;
            }
            count++;
            //提示玩家
            if(guess > num){
                System.out.println("猜大了，在小一点！");
            }else if(guess < num){
                System.out.println("猜小了，在大一点！");
            }else{
                System.out.println("恭喜你，猜中了！");
                break;
            }
        }
    }
}
