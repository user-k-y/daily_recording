package ex6_daily_0529;

public class Person {
	
	//�Һ��� �������
	//������ ����� ���ÿ� �ʱ�ȭ�� �ݵ��
	//�̷������ �Ѵ�.
	//���뵥���ͷν� ���Ǿ�����. (���� new�� ����� �� ��, ������ �ּҰ��� ����)
	//Ŭ�������� �����Ǿ�����.(��������ó�� ���θ޼��尡 ����Ǹ� ���ư�. �ּҰ� ����)
	static final int MAX_NUMBER = 1000;
	
	//final �ʱ�ȭ ���
	//1.����� ���ÿ� �ʱ�ȭ
	//2.�����ڿ��� �� �ѹ� �ʱ�ȭ
	final String nation = "KOREA"; //�������
	final int age; //�������� �ʱ�ȭ�� �� �Ǽ� �����ڸ� ��Ÿ����� ��
	
	//�⺻������: �ν��Ͻ� ������ �� �������� Ŭ������(); 
	//�̰� �����ڸ� ȣ���� ��. ������ �����Ϸ��� �˾Ƽ� ��������
	public Person(int age) {
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		return "nation : " + this.nation + ", age : " + this.age;
//	}

}
