/*
如何从键盘获取不同类型的变量: 需要使用scanner类

具体实现步骤:
1.导包: import java.util.Scanner;
2.Scanner的实例化:Scanner scan = new Scanner(System.in);
3.调用scanner类的相关方法 (next() / nextXxx())，来获取指定类型的变量

注意:需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型下匹配时
，会报异常: InputMisMatchExce导致程序终止。
*/
import java.util.Scanner;

public class ScannerTest{
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的名字：");
		String name = scan.next();
		System.out.println(name);
		
		System.out.println("请输入你的性别:");
		String sex = scan.next();
		System.out.println(sex);
		
		System.out.println("请输入你的年龄");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("请输入你的体重");
		double body = scan.nextDouble();
		System.out.println(body);
		
		System.out.println("你相中我了吗？true/false)");
		Boolean isLove = scan.nextBoolean();
		System.out.println(isLove);
		
	} 
}