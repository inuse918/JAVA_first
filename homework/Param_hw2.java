public class Param_hw2 {
	public static void main (String[] args) {
		//4. �� ���� ���� �Է¹޾� �� ���� ������ 3�� ����̰ų� 7�� ����� ������ �հ� ���
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int b=0,s=0,sum=0;
		float avg=0;

		if (i>=j){
			b=i;
			s=j;
		} else {
			b=j;
			s=i;
		}
		
		for (int i2=s;i2<=b;i2++){
			if (i2%3==0||i2%7==0){
				sum+=i2;
			}
		}
		avg=(float)sum/(b-s+1);
		System.out.println("�� ���� ������ 3�� ����̰ų� 7�� ����� ��\n�� : "+sum+" ��� : " + avg);
	}
}