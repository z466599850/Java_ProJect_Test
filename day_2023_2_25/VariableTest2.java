/*
基本数据类型之间的运算规则

前提：这里讨论知识7种基本数据类型变量间的运算。不包含boolean类型的。

1.自动类型提升：
	当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
	byte 、 char 、short -> int -> long -> float -> double

	特别的：当byte char short 三种类型的变量做运算时，结果为int类型

2.强制类型转换:见VariableTest3.java


注：此时的容量大小指的是，表示数的范围的大和小。比如：float容量大于long的容量
*/
class VariableTest2{
	public static void main(String[] args){
		
		byte b1 = 2;
		int i1  = 12;
		int	i2  = b1 + i1;
		System.out.println(b2);
		long l1 = b1 + i1;
		System.out.println(l1);
		
		float f = b1 + i1;
		System.out.println(f);
		
		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);
		
		//--------------------------------------
		
		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);//107
		
		short s2 = 10;
		//char  c2 = c1 + s2;//编译不通过
		
		byte b2 = 10;
		//char c3 = c1 + b2;//编译不通过
		
		//short  s5 = b1 + b2;//编译不通过
		System.out.println(i5);
	}
}