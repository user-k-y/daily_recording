package A1_�⺻�̷�;

public class A1_�⺻�̷�7_���Ĺ��� {
	
	/*
	  # ��¹��� ����
	  (1) System.out.println();    �ٹٲ� ����
	  (2) System.out.print();      �ٹٲ� �Ұ�
	  
	  
	  (3) System.out.printf();     ��Ģ�� ���� �ִ� ��¹�
	  		1) format, ����
	  		2) %���ĺ�
	  				%d : decimal (�������� ����)
	  				%f : float  (�ε� �Ҽ���, �Ҽ��� �ִ� ��, �Ǽ�)
	  				%c : character (���� �� ��)
	  				%s : String  (���� ������) //�ڹ� ������ �빮�ڷ� ǥ�� ��Ÿ��
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(10 / 3.0);
		
		System.out.println(10);
		
		//printf�� �⺻���� System.out.printf("",); ("%d", 10);
		System.out.printf("%d", 10);
		System.out.println();
		
		
		System.out.println(3.33333333);
		System.out.printf("%f", 3.33333333);
		
		System.out.println();
		//�Ҽ��� ���ϸ� �ڸ��� ���� �� .��°�ڸ����� ��� -> �̰� �ַ� printf�� ���� ����
		//printf�� �� �� ����.
		System.out.printf("%.2f", 3.33333333);
		System.out.println();
		
		System.out.println('B');
		System.out.printf("%c", 'B');
		System.out.println();
		
		System.out.println("Java");
		System.out.printf("%s","Java");
		
		
		
	}//main

}
