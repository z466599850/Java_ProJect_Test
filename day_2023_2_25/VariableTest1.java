/*
Java定义的数据类型

一、变量按照数据类型来分：

	基本数据类型：
		  整形：int short byte long
		浮点型：float double
		字符型：char
		布尔型：boolean
	
	
	引用数据类型
		类：class
		接口：interface
		数组：[]
		
二、变量在类中声明的位置
		成员变量 vs 局部变量

变量类型：
类型   占用存储空间 表述范围
byte  1字节=8bit位 -128~127
short 2字节        -2^15~2^15-1
int   4字节		   -2^31~2^31-1(约21亿)
long  8字节		   -2^63~2^63-1

浮点型：
浮点型常量有两种表示形式:
	>十进制数形式:如:5.12	512.0f	.512(必须有小数点)
	>科学计数法形式:如:5.12e2  512E2  100E-2
	
float:单精度，尾数可以精确到7位有效数字。很多情况下，精度很难满足需求
double:双精度，精度是float的两倍。通常采用此类型

Java 的浮点型常量默认为double型，声明float型常量，须后加'f'或'F'
类型			占用空间	表述范围
单精度float		4字节		-3.403E38 ~ 3.403E38
双精度double	8字节		-1.798E308~1.798E308
注：E是乘的意思
*/
class VariableTest1{
	public static void main(String[] args){
		//整形：int short byte long
		byte b1 = 12;
		byte b2 = -128;
		System.out.println(b1);
		System.out.println(b2);
		// short int long 声明long型变量，必须以小写"l"或大写" L " 
		// 通常，定义整形变量时，使用int型
		short s1 = 128;
		int a1 = 1234;
		long l1 = 122441L;//long型变量，必须以小写 " l " 或大写 " L "
		
		//浮点型：float double
		//注：Java 的浮点型常量默认为double型，声明float型常量，须后加'f'或'F'
		
		 double d1 = 123.3;
		 System.out.println(d1 + 1);
		  
		  //定义float类型变量时，变量要以"f"或"F"结尾
		 float f1 = 12.3F;
		 System.out.println(f1);
		 //通常，定义浮点型变量时，使用double型
		 
		 //字符型：char
		 //定义char类型变量，通常使用一对'',内部只能写一个字符
		 char c1 = 'a';
		 System.out.println(c1);
		 
		 //表示方式：1.声明一个字符 2.转义字符 3.直接使用 Unicode 值来表示字符型常量 用的很少
		 char c5 = '\n';//换行符
		 c5 = '\t';//制表符 也就是键盘上的tab键
		 System.out.print("Hello" + c5);
		 System.out.println("World");
		 
		 char c6 = '\u0043';
		 System.out.println(c6);
		 
		 
		 //布尔型：boolean
		 //1.只能取两个值之一：true、false
		 //2.常常在条件判断、循环结构中使用
		 boolean bb1 = true;
		 System.out.println(bb1);
		 
		 boolean isMarried = true;
		 if(isMarried){
			 System.out.println("你就不能参加\"单身\"party了！\n很遗憾");
		 }
		 else{
			 System.out.println("你可以多谈谈女朋友！");
			 
			 
			 
			 
		 }
	}
	
}














