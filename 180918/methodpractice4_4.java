import java.util.*;

public class methodpractice4_4{
	public int add(int a,int b) {
		System.out.print(a+" �� "+b+" �� ����");
		int big=0;
		int small=0;
		int s=0;
		if (a>b)	{
			big=a;
			small=b;
		}
		else if (a<b)	{
			big=b;
			small=a;
		}
		for (int i=small;i<=big;i++){
			s+=i;
		}
		
		return s;
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	methodpractice4_4 t4_4=new methodpractice4_4();
	System.out.print("a ���� b ������ �� (a�� b�Է�): ");
	int c=sc.nextInt();
	int d=sc.nextInt();
	System.out.print(t4_4.add(c,d)+"�Դϴ�.");
	
}
}