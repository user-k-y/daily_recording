package ex5_daily_0528;

class A {
	int data1 = 10;
	int data2 = 30;
}

public class AccumulatorEx {

	public static void main(String[] args) {
		
		Accumulator ac = new Accumulator();
		int iresult = ac.add(10, 50);
		System.out.println("iresult: " + iresult);
		
		//���̻縦 �ݵ�� ���̵��� ���� long:L float:f
		long lresult = ac.add(100, 7500L);
		//L�� �������� �� ���̸� int�� ȣ����
		System.out.println("lresult: " + lresult);
		
		lresult = ac.add(1000L, 10);
		System.out.println("lresult: " + lresult);
		
		double dresult = ac.add(107.88, 11.55);
		System.out.println("dresult: " + dresult);
		//������ǥ?���� ������ �߻��Ѵ�. 119.43�ε� 119.42999999�� ����
		
		//���� �� ���� ������ �ִ°ͺ��� �ٷ� �Ű����� �ȿ��� �����ϴ� ��찡 ����
		long arrResult = ac.add(new int[] {1,2,3,4,5});
		//�迭�� �ٷ� �����ؼ� �� �ּҸ� �ѱ�� ��
		System.out.println("arrResult : " + arrResult);
		
		iresult = ac.add(new A());//��ü�� ���� ���� �ѱ�
		System.out.println("iresult: " + iresult);
		
		
		
		
	}//main

}
