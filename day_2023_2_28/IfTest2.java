/*
编写程序:由键盘输入三个整数分别存入变量num1、num2、num3
对它们进行排序(使用 if-else if-else)并且从小到大输出。



*/

//导包
import java.util.Scanner;
public class IfTest2{
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		

		System.out.println("num1：");
		int num1 = scan.nextInt();

		System.out.println("num2：");
		int num2 = scan.nextInt();
		

		System.out.println("num3：");
		int num3 = scan.nextInt();
		
		if(num1 >= num2){
			if(num3 >= num1)
				System.out.println(num2 + "," + num1 + "," + num3);
			else if(num3 <= num2)
				System.out.println(num3 + "," + num2 + "," + num1);
			else
				System.out.println(num2 + "," + num3 + "," + num1);
		}else{
			if(num3 >= num2)
				System.out.println(num1 + "," + num2 + "," + num3);
			else if(num3 <= num1)
				System.out.println(num3 + "," + num3 + "," + num2);
			else
				System.out.println(num1 + "," + num3 + "n" + num2);
		}
		
	} 
}