/*练习2
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。格式如下:数字xxx的情况如下:
个位数:
十位数:
百位数:
例如:数字153的情况如下:
个位数:3十位数:5
百位数:1
*/
class AriExer{
	public static void main(String[] args){
		int num = 153;
		
		int hundred = num / 100;
		int ten = num / 10 % 10;
		int piece = num % 10;
		System.out.println("百位是：" + piece);
		System.out.println("十位是：" + ten);
		System.out.println("个位是：" + hundred);
	}
}