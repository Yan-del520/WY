import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
//		String name = "����";
//		int ages = 21;
//		String hobby = "����";
//		System.out.println("�ҵ�������" + name + "\n�ҵ�������" + "21" + "\n�ҵİ�����" + hobby);
//		
		Scanner in = new Scanner(System.in);
		System.out.println("���û�����һ����λ����");
		int a = in.nextInt();
		int b = a/10000;
		int c = a/1000%10;
		int d = a/100%10;
		int e = a/10%10;
		int f = a%10;
		int num = f + d ;
		int num1 = c + b;
		System.out.println(num % e == 0 && num1 % num == 0 ? "�н�" : "δ�н�");
		}
}
