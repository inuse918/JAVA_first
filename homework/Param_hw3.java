public class Param_hw3 {
	public static void main(String[] args) {
		//5. 5���� �Ű����� �Է¹޾� �ִ밪, �ּҰ� ���
		
		int y[]=new int[5];
		
		for (int i=0;i<y.length;i++)
		{
			y[i]=Integer.parseInt(args[i]);
		}

		int big=y[0],sma=y[0];

		for (int i=0;i<y.length;i++)
		{
			if (y[i]>big)
			{
				big=y[i];
			}
			else {
				sma=y[i];
			}
		}
		System.out.println("�ִ밪 : "+big+" �ּҰ� : "+sma);
		
		
		
	}	
}