/*
String类型变量的使用
1.String属于引用数据类型，翻译为：字符串
2.声明String类型变量时，使用一对""
3.String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
4.运算的结果仍然是String类型


*/
class StringTest{
	public static void main(String[] args){
		String s1 = "Hello World!"; 
		
		System.out.println(s1);
		
		String s2 = "a";
		String S3 = "";
		
		//char c = '';//编译不通过	
			
		//---------------------------------------
		int number = 1001;
		String numberStr = "学号：";
		String info = numberStr + number;// + :链接运算 拼一起就好了 学号：1001
		boolean b1 = true;
		String info1 = info + b1;
		System.out.println(info1);//学号：true	
		
		//-------------------------------------------------------------
		//练习1
		char c = 'a';
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);// 97+10 107+hello = 107hello
		System.out.println(c + str + num);//ahello10
		System.out.println(c + (num + str));//a + 10hello
		System.out.println((c + num) + str);//107hello
		System.out.println(str + num + c);//hello10a
		
		//练习2
		//*	*
		System.out.println("*	*");
		System.out.println('*' + '\t' + '*');//因为''代表的是char的字符 字符对应的是ASCII码值
		System.out.println('*' + "\t" + '*');//因为''对应的是ASCII码值 ""对应的是字符串String
		System.out.println('*' + 't' + "*");
		System.out.println('*' + ('\t' + "*"));
		
		//练习3
		//String str1 = 4;//判断对错: 错
		String str2 = 3.5f + "";//判断str2对错: 对 
		System.out.println(str2);//3.5
		System.out.println(3+4+"Hello!");//7Hello!
		System.out.println("Hello!" + 3 + 4);//Hello34
		System.out.println('a' + 1 + "Hello!");//98Hello
		System.out.println("Hello" + 'a' + 1);//Helloa1
		
		//练习4
		//判断是否能通过编译
		short s = 5;
		s = s-2;
		
		byte b = 3;
		b = b + 4; //判断：
		b = (byte)(b + 4);//判断：
		
		char c = 'a';
		int i = 5;
		float d = .314F;
		double result = c + i + d;//判断：
		
		byte b = 5;
		short s = 3;
		short t = s + b;//判断：
		
	}
}

















