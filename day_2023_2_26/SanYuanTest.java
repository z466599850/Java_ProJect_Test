/*
运算符之五：(三元运算符)
1.结构（条件表达式）?表达式1：表达式2;
2.说明
	1.条件表达式的结果为boolean类型
	2.根据条件表达式真或假，决定执行表达式1，还是表达式2.
		如果表达式为true则执行表达式1 .
		如果表达式为false，则执行表达式2.
	3.表达式1 和表达式2 要求是一致的
	4.三元运算符可以嵌套使用

3.凡是可以使用三元运算符的地方，都可以改写为if-else
4.如果程序既可以使用三元运算符，又可以使用if-else结构，
  那么优先选择三元运算符。原因:简洁、执行效率高



*/
class SanYuanTest{
	public static void main(String[] args){
		int m = 2;
		int n = 5;
		int i = 10;
		//int max = (n > m)? n : m;
		//System.out.println(max);
	
		//n = 1;
		//String maxStr = (n > m)? "n大" : (n == m)? "m和n相等" : "m大";
		//System.out.println(maxStr);
		
		//获取三个数的最大值
		int n1 = 12;
		int n2 = 30;
		int n3 = -43;
		int max1 = (n1 > n2)? n1 : n2;
		int max2 = (max1 > n3)? max1 : n3;
		System.out.println("三个数的最大值是：" + max2);
		
		//改写if-else
		if(m>n)
		{
			System.out.println(m);
		}
		else
		{
			System.out.println(n);
		}
	}
}