package ex6_daily_0529;

//AŬ������ �ƹ��� �����ڰ� �������� �����Ƿ�,
//�����Ͻÿ� �����Ϸ��� �˾Ƽ� �⺻�����ڸ� �߰����ش�.
class A {
	int value;
}

class B {
	int value;
	
//	public B() {
//	}
	
	public B(int value) {
		this.value = value;
	}
}

//�ϳ��� �ڹ����Ͽ� public�� �ϳ��� �־�� ��
public class ConstructorEx {

	public static void main(String[] args) {
		
		A a = new A();
		//������ ���ܸ� ��� ���
		//1.BŬ������ �⺻�����ڸ� �߰�
		//2.BŬ���� ������ ȣ�� �� �Ű����� ������ int���� ������ ����
		
		//B b = new B(); //������. �⺻������ ���ǰ� �� ��
		//�ذ��� 1.�ش� Ŭ������ �⺻������ ��������  2.�Ű����� �� �ֱ� call by value
		B b = new B(100);
		
	}//main

}
