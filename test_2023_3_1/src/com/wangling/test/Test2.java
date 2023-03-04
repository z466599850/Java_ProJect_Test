package com.wangling.test;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        /*
            用键盘输入一个星期数 输出工作日和休息日
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("输入星期几，查看哪天是工作日和休息日:");
        String week = scan.next();
        switch(week){
            case "星期一":
            case "星期二":
            case "星期三":
            case "星期四":
            case "星期五":
                System.out.println("工作日");
                break;
            case "星期六":
            case "星期日":
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
