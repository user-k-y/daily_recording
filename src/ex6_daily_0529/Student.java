package ex6_daily_0529;

public class Student {
	//������ ���� ��� 1. ������� �����ְ�  2. ������ �����ְ�  3. �޼��� �����ֱ� 
	
	//�ν��Ͻ� ��� ������ ������.
	private String name;
	private int age;
	
	//Ctrl+Space
	//Ŭ�������� �����ڸ��� �ݵ�� ���ƾ� �Ѵ�.
	//�����ڴ� ����Ÿ���� �������� �ʴ´�.(void��� ���� ������ �ʴ´�)
	//�����ڰ� �ϳ��� ���� Ŭ������ �⺻������ �����Ͻÿ� �����Ϸ��� �˾Ƽ�
	//�⺻�����ڸ� �߰����ش�.
	public Student() {
		System.out.println("�⺻������ ȣ��");
		//return; //���൵ �Ǵµ� �� �����ִ� �� ����.
	}

	public Student(String name) {
		System.out.println("�Ű����� String�� �ִ� ������ ȣ��");
		this.name = name;
	}
	
	public Student(int age) {
		System.out.println("�Ű����� int�� �ִ� ������ ȣ��");
		this.age = age;
	}
	
	//Source - Generate using field �Ű������� �ִ� ������ ����
	//������ �츮�� �⺻������ ���� ���� �����ؼ� ������� �����ϰ� �ٿ�����
	//���͸� �� �������� �ʴ� ������ �����ڷ� ���� ������ �� �ֱ� ����
	//�Ű������� �ִ� ������
	//�����ڶ�� ���� �ν��Ͻ� �ʱ�ȭ �޼����� ��������.
	public Student(String name, int age) {
		System.out.println("�Ű������� �ִ� ������ ȣ��");
		this.name = name;
		this.age = age;
	}




	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return this.getName() + ", " + this.getAge();
	}
	
	
	
	
	
	

}
