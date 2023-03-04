package com.wangling.arrdemo;

public class ArrDemo1 {
    public static void main(String[] args) {
        //格式：
        //静态初始化
        //完整格式:
        //数据类型[] 数组名 = new 数据类型[]{元素1，元素2....};
        //简化格式: 一般都用简化格式
        //数据类型[] 数组名 = {元素1，元素2...};

/*        //需求1: 定义数组存储5个学生的年龄
        int ageArr1[] = new int[]{14,15,16,17,18};//完整格式
        int[] ageArr2 = {14,15,16,17,18};//简化格式
        //需求2: 定义数组存储3个学生的姓名
        String[] nameArr1 = new String[]{"王令","李四","张三"};//完整格式
        String[] nameArr2 = {"王令","李四","张三"};//简化格式
        //需求3: 定义数组存储4个学生的身高
        double[] heightArr1 = new double[]{1.80,1.93,1.92,1.92};//完整格式*/
        double[] heightArr2 = {1.80,1.93,1.92,1.92};//简化格式
        System.out.println(heightArr2);//[D@4eec7777 地址值

        //扩展：
        //解释一下地址值的格式含义 [D@4eec7777
        //[ : 表示当前是一个数组
        //D: 表示当前数组里面的元素都是double类型的
        //@: 表示一个间隔符号。 (固定格式)
        //4eec7777：才是数组真正的地址值， 十六进制)
        //平时我们习惯性的会把这个整体叫做数组的地址值。
    }

}
