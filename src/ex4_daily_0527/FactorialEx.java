package ex4_daily_0527;

public class FactorialEx {

	public static void main(String[] args) {
		
		long result = FactorialEx.factorial(5L);
		System.out.println("5!(���丮��)�� �� :" + result);
		

	}//main
	
	public static long factorial(long n) {
		
		long result = 0L;
		//���ѹݺ��� ���������� ��
		//��μ� n�� 1�϶�, ���ȣ���� �� �̻� ���̷������. f(1) = 1�̴ϱ�.
		if(n==1) {
			result = 1;
		}
		
		else {
			System.out.println("result�� : " + result + ", n�� : " + n);
			result = n * factorial(n-1);//���ȣ���� ���������� �̷������ ��
			System.out.println("result�� : " + result + ", n�� : " + n);
		}
		
		
		return result;
	}

}
