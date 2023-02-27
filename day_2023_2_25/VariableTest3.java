/*
强制类型转换：
1.需要使用强制类型转换:()
2.注意：强制类型转换，可能导致精度损失。





*/
class VariableTest3{
	public static void main(String[] args){
		double d1 = 12.3;
		int i1 = (int)d1;//取整数部分
		System.out.println(i1);//12
		
		//没有精度损失
		//
		long l1= 123;
		short s1 = (short)l1;
		System.out.println(s1);

		//精度损失举例2
		int i2 = 128;
		byte b = (byte)i2;
		System.out.println(b);//-128
		

	}
}



































