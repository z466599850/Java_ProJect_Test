package com.wangling.test;

public class ArrTest3 {
    public static void main(String[] args) {
        /*
            定义个数组
            存储1,2,3,4,5,6,7,8,9,10
            遍历数组得到每一个元素。
            要求:
            1，如果是奇数，则将当前数字扩大两倍
            2，如果是偶数，则将当前数字变成二分之-
         */
        //定义数组
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            //判断
            if(arr[i] % 2 == 0){
                //得到偶数
                arr[i] = arr[i] / 2;
            }else{
                //得到奇数
                arr[i] = arr[i] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            //打印数组
            System.out.println(arr[i]);
        }
    }
}
