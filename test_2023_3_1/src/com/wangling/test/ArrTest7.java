package com.wangling.test;

import java.util.Random;

public class ArrTest7 {
    public static void main(String[] args) {
        /*
        需求:定义一个数组，存入1~5。要求打乱数组中所有数据的顺序
        难点：
        如何获取数组中的随即索引
        int arr[] = {1,2,3,4,5};
        //索引范围：0 1 2 3 4
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);//生成数组随机下标 相当于随机拿到一个数组里的一个值 不会超出范围
        System.out.println(randomIndex);
         */
        int arr[]= {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机值
            int num = r.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[num];
            arr[num] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
