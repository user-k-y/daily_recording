package ex2_daily_0519;

public class Student {
	//�������(�ʵ�)
	String name;
	int age;
	
	//ObjectŬ������ toString()�������̵�(������)
	@Override
	public String toString() {

		//String str = "�̸�: " + this.name + ", " + "���� : " + this.age;
		
		
		//this : (Ŭ���� ���� ��������) Ŭ������ �ּ�(new��� �����ڰ� �޸𸮿� �Ҵ��� ���ָ� ��μ� ��밡������(Ȱ��ȭ))
		//this : Ŭ������ �ּ�(new��� �����ڰ� �ν��Ͻ��� �����ϸ� ��μ� Ȱ��ȭ)
		//this�� static�޼��峪 Ŭ���� �ȿ� ����� �� ����.
		//static�� �ܺ� Ŭ���� �տ��� �� �ٴ´�. �׷��� ���� Ŭ���������� ����Ѵ�. ����޼��带 ����ƽ���� ������� �� ���� ������ this�� �� �� ����.
		return "�̸�: " + this.name + ", " + "���� : " + this.age;
		
		//return str;
	}

}
