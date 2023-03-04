package com.wangling.test;

public class ArrTest1 {
    public static void main(String[] args) {
        /*
            定义一个数组，存储1，2，3，4，5
            求数组里面所有的数据和
         */
        int sum = 0;
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        //循环结束就得到了我们想要的值
        System.out.println(sum);
    }
}
