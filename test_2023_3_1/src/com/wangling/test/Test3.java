package com.wangling.test;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        /*
        当我们拨打了某些服务电话时，一般都会有按键选择假设现在我们拨打了一个机票预定电话。
        电话中语音提示:
        1机票查询
        2机票预订
        3机票改签
        4退出服务
        其他按键也是退出服务。请使用swtich模拟该业务逻辑
         */
        Scanner scan = new Scanner(System.in);
        //输入电话号：
        System.out.print("请输入电话：");
        String tele = scan.next();
        //按键查询
        System.out.println("请选择需要查询的业务");
        System.out.println("按1机票查询");
        System.out.println("按2机票预订");
        System.out.println("按3机票改签");
        System.out.println("按4退出服务");
        System.out.println("按其他按键是退出服务");
        //请选择：
        System.out.print("请选择:");
        int num = scan.nextInt();

        switch(num){
            case 1 :
                System.out.println("你想查询什么呢？");
                break;
            case 2 :
                System.out.println("你想预定几点的呢？");
                break;
            case 3 :
                System.out.println("你想改到几点的呢？");
                break;
//            case 4:
//                System.out.println("已退出服务");
//                break;
            default:
                System.out.println("已退出服务");
        }

    }
}
