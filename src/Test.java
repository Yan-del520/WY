import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
//		String name = "闫毅";
//		int ages = 21;
//		String hobby = "篮球";
//		System.out.println("我的名字是" + name + "\n我的年龄是" + "21" + "\n我的爱好是" + hobby);
//		
		Scanner in = new Scanner(System.in);
		System.out.println("请用户输入一个五位数：");
		int a = in.nextInt();
		int b = a/10000;
		int c = a/1000%10;
		int d = a/100%10;
		int e = a/10%10;
		int f = a%10;
		int num = f + d ;
		int num1 = c + b;
		System.out.println(num % e == 0 && num1 % num == 0 ? "中奖" : "未中奖");
		}
}
