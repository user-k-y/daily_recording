package ex4_daily_0527;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10,20,30,40,50};
	    System.out.println("change�޼��� ȣ�� ���� �� : " + arr[0]);
		System.out.println("main() arr�� �ּҰ� : " + arr);
		change(arr); //�迭���� �� �ּҴ�. 2�����迭������ 1���� �迭�� �ּҰ� �ȴ�.
		//change(new int[] {10,20,30});//������ ���� �ּҰ��� �Ѱܵ� �ȴ�.
		//���� ���� �ѱ� ���� �ִ�.
		//������ ���������� ��� �ּҰ��� Ȯ���ϰų� ������ �� ����.
		System.out.println("change�޼��� ȣ�� ���� �� : " + arr[0]);
		

	}
	
	public static void change(int[] arr) {
		
		System.out.println("change() arr�� �ּҰ� : " + arr);
		arr[0] = 999;
		System.out.println("change()�޼��� ���� �� : " + arr[0]);
		return;
		
	}

}
