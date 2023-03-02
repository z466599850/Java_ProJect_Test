/*
运算符之五：位运算符(了解)
结论：
1.位运算符操作的都是整形的数据
2.<<：在一定范围内，每向左移1位，相当于 * 2 
  >>：在一定范围内，每向右1位，相当于 / 2

*/
class BitTest{
	public static void main(String[] args){
		int i = 21;
		
		System.out.println("i << 2:" + (i << 2));
		System.out.println("i << 2:" + (i << 3));
		System.out.println("i << 27:" + (i << 27));
		
		int m = 12;
		int n = 5;
		System.out.println(" m & n" + (m & n));
		System.out.println(" m | n" + (m | n));
		System.out.println(" m ^ n" + (m ^ n));
		
		//练习：交换两个变量的值
		int num1 = 10;
		int num2 = 20;
		int tmp = 0;
		//方式一：定义临时变量的方式
		//推荐方式
		//tmp = num1;
		//num1 = num2;
		//num2 = tmp;
		
		//System.out.println("num1 = " + num1 + ("num2 = ") + num2);
		
		//方式二：不创建变量的方式进行交换
		//注意：相加操作可能超出存储范围 1.有局限性：只能适用于数值类型
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		//方式三：使用位运算符
		//只能适用于数值类型
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		
		System.out.println("num1 = " + num1 + ("num2 = ") + num2);
		
	}
}




