package com.wangling.switchdemo;
/*
        switch 新特性
        JDK12以上才有
 */
public class SwitchDemo2 {
    public static void main(String[] args){
        int num = 1;
        switch(num) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这个数");
            }
        }
    }
}
