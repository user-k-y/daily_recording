package ex2_daily_0519;

public class StudentEx {
	//Ŭ���� ������ this ��밡��. �󸶵��� ��������� ���� �� ����
	//�ϳ��� �ڹ����Ͽ�  public�̶�� ���������ڴ� ������ �� ���� ������ ��(class �տ����� �� ��)
	
	
	
	
	public static void main(String[] args) {
		//�޼��� ����
		//this. -> �ȵ�
		
		
		//�Ʒ��� ���� ������ ��������� ������ �ν��Ͻ��� ���� �Ҵ��� �ȴ�.
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 42;
		s1.name = "ȫ�浿";
		
		//s1�� �ּҸ� s2���ٰ� ����
		s2 = s1;  //���� s2�� ����Ű�� �ִ� �ν��Ͻ��� ������ ��ü�� �ȴ�.
		          //gc(garbage collector)�� ������ ��ü�� �����Ͽ� �Ҹ��Ų��.
		//���� �ּҰ� ������ �Ǿ����
		
		
		s2.age = 11;
		//�׷��� s2�� �ٲ㵵 �ּҰ� ���Ƽ� �� �� �ٲ�� ��
		
		System.out.println(s1);
		System.out.println(s2);

		
		
		
		
		
		
		
		
	}//main

}
