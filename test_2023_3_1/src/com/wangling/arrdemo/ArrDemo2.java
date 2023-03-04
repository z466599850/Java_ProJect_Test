package com.wangling.arrdemo;

public class ArrDemo2 {
    public static void main(String[] args) {
        //在java中，关于数组的一个长度属性，length
        //调用方式：数组名.length
        int arr[] = {1,2,2,1,321,32,1321,321,3,123,123,123,123,12,321,312,321,321,3,213,21};
        System.out.println(arr.length);
        //使用的案例：
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        //扩展：
        //自动的快速生成数组的遍历方式
        //idea提供的
        //数组名.fori
        for (int i = 0; i < arr.length; i++) {
            //自己补全代码即可
        }
    }
}
