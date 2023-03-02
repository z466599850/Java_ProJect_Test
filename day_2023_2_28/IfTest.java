/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺:

如果:
成绩为100分时，奖励一辆BMW;
成绩为(80，99]时，奖励一台iphone xs max;
当成绩为[60,80]时，奖励一个iPad;
其它时，什么奖励也没有
请从键盘输入岳小鹏的期末成绩，并加以判断




*/

import java.util.Scanner;
public class IfTest{
		
	public static void main(String[] args){
		//调用
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入岳小鹏期末的成绩：");
		int scores = scan.nextInt();
		System.out.println(scores);
		if(scores == 100)
		{
			System.out.println("奖励一辆RMW");
		}
		else if(scores >= 80 && scores <= 99)
		{
			System.out.println("奖励一台iphone xs max");
		}
		else if(scores >= 60 && scores <= 80)
		{
			System.out.println("奖励一个iPad");
		}
		else
		{
			System.out.println("下次努力");
		}
	} 
}