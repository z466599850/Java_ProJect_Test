/*
运算符之二：赋值运算符

*/
class SetValueTest{
	public static void main(String[] args){
		//赋值符号：=
		int j1 = 10;
		int j2 = 10;
		
		int j6,j8;
		//连续赋值
		int j3 = 10,j4 = 20;
		
		//-----------------------
		int num1 = 10;
		num1 += 2;//num1 = num1 + 2;
		System.out.println("num = " + num1);
	
		int num2 = 12;
		num2 %= 5;//num2 = num2 % 5
		System.out.println(num2); 
		
		short s1 = 10;
		//s1 = s1 + 2;//编译不通过 因为2是常量是int类型的
		s1 += 2;
		System.out.println(s1);
		
		//开发中，如果希望变量实现 +2 的操作，有几种方法?(前提: int num = 10;)
		//方式一：num = num + 2;
		//方式二：num += 2;(推荐)
		
		//开发中，如果希望变量实现 +1 的操作，有几种方法?(前提: int num = 10;)
		//方式一：num = num + 1;
		//方式二：num += 1;
		//方式三：num++;(推荐)
		
		n = n + (n++) + (++n)
		10  10 + 10 + 11
		
	}
}