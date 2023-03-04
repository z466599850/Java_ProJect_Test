package com.wangling.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        /*
        需求:生成10个1~100之间的随机数存入数组。
        1)求出所有数据的和
        2)求所有数据的平均数
        3)统计有多少个数据比平均值小
         */

        Random r = new Random();
        int mean = 0;
        int count = 0;
        //定义数组
        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }

        //1)求出所有数据的和
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("它们的和是：" + sum);

        //2)求所有数据的平均数
        //注：算术平均数的计算方式为所有数据的和再除以数据的个数
        for(int i=0; i < arr.length;i++){
            mean = sum / arr.length;
        }
        System.out.println("他的平均数是" + mean);

        //3)统计有多少个数据比平均值小
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < mean){
                count++;
            }
        }
        System.out.println("有" + count + "个数据比平均值小");

        //遍历数组
        System.out.print("数组的值：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
