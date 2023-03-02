/*
运算符之一：算术运算符
+ - * / % ++ -- 


	
*/
class AriTest{
	public static void main(String[] args){
		//除号
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		System.out.println(result1);//2
		
		int result2 = num1 / num2 * num2;
		System.out.println(result2);//10
		
		double result3 = num1 / num2;
		System.out.println(result3);//2.0
		double result4 = num1 / (num2 + 0.00);//2.4
		double result5 = (double)num1 / num2;//2.4
		double result6 = (double)(num1 / num2);//2.0
		System.out.println(result4);
		//% 取余运算
		//结果的符号与被模数的符号相同
		//开发中，经常使用%来判断能否被除尽的情况！！！！！！！！！！！！！！
		int a1 = 12;
		int b1 = 5;
		System.out.println("a1 % b1 = " + a1 % b1);
		
		int a2 = -12;
		int b2 = 5;
		System.out.println("a2 % b2 = " + a2 % b2);
		
		int a3 = 12;
		int b3 = -5;
		System.out.println("a3 % b3 = " + a3 % b3);
		
		int a4 = -12;
		int b4 = -5;
		System.out.println("a4 % b4 = " + a4 % b4);
		
		
		//前置++：先自增1，后运算 
		//后置++：先运算，后自增1
		int c1 = 10;
		int d1 = ++c1;
		System.out.println("c1 = " + c1 + "d1 = " + d1);// 10 11
		
		int c2 = 10;
		int d2 = c2++;
		System.out.println("c2 = " + c2 + ",d2 = " + d2);//10 10 
		
		int n3 = 10;
		n3++;
		int m3 = n3;
		System.out.println("m3 = " + m3);
		
		short s1 = 10;
		//s1 = s1 + 1;//编译失败
		//s1 = (short)(s1 + 1);//正确的
		s1++;//自增1不会改变本身变量的数据类型
		System.out.println("s1 = " + s1);
		
		//问题：
		byte b5 = 127;
		b5++;
		System.out.println("b5 = " + b5);
		//前置--：先自减1，后运算 
		//后置--：先运算，后自减
		int a6 = 10;
		int b6 = --a6;
		System.out.println("a6 = " + a6 + " b6 = " + b6);
	}
}












































