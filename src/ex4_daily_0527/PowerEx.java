package ex4_daily_0527;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int n = 0;
		long result = 0L;
		
	    System.out.println("���������� ���� ����մϴ�!");
	    System.out.println("ex) 2�� 3�� : 2�� 1�� + 2�� 2�� + 2�� 3���� 14�Դϴ�!");
	    System.out.print("�����ϰ� ���� ���� �Է� : ");
	    x = sc.nextInt();
	    
	    System.out.print("����� ���ұ�� : ");
	    n = sc.nextInt();
	    
	    for(int i = 1; i <= n; i++) {
	    	result += power(x, i); //���� 3,2
	    }
	    System.out.printf("%d�� %d�±����� ���� %d�Դϴ�!",x,n,result);
	    
	    
		
		sc.close();

	}//main
	
	//math.power�� ������ �츰 ���� �����غ���
	public static long power(int x, int n) {
		
		//�� ����
//		if(n==0) {
//			return 1;
//		}
		
		//���� Ǭ ��
		if(n==1) {
			return x;
		}
		
		else {
			return x * power(x, n-1);
		}
		
	}
	

}
