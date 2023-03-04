package com.wangling.test;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
        /*练习
        运动计划
        需求：键盘录入星期数，显示今天的减肥活动。
        周一:跑步
        周二:游泳
        周三:慢走
        周四:动感单车
        周五:拳击
        周六: 爬山
        周日: 好好吃一顿*/

        Scanner scan = new Scanner(System.in);

        //录入星期数
        System.out.print("输入周几，显示今天的减肥活动：");
        String week = scan.next();

        switch(week){
            case "周一":
                System.out.println("周一：跑步");
                break;
            case "周二":
                System.out.println("周二：游泳");
                break;
            case "周三":
                System.out.println("周三：慢走");
                break;
            case "周四":
                System.out.println("周四：动感单车");
                break;
            case "周五":
                System.out.println("周五：拳击");
                break;
            case "周六":
                System.out.println("周六：爬山");
                break;
            case "周日":
                System.out.println("周日：好好吃一顿");
                break;
            default:
                System.out.println("输入错误，请重新输入");
                break;
        }
    }
}
