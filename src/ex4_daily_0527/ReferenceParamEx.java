package ex4_daily_0527;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("�޼��� ȣ�� �� main()���� �� : " +  a.data);
		//�������� "�ð谡 �����?'��� ����� ���¶� ���� �а�
		//������ �� �� �ִ�.
		//Call by reference(�ּҿ� ���� ȣ��)
		ReferenceParamEx.dataChange(a);
		System.out.println("dataChange()ȣ��");
		System.out.println("�޼��� ȣ�� �� main()���� �� : " + a.data);
		
		
		
	}//main
	//int[], double[], String --> ������������ ȣ��
	public static void dataChange(A a) {
		//a��� �ּҰ��� �Ű������� �Ѿ�Ա� ������ �ּҸ� �����Ѵ�.
		//a��� �ּҸ� ������ �ϰ� �Ǹ� ȣ���� ������ ������ ������ �޴´�.
		a.data = 44;
		System.out.println("dataChange()���� �� : " + a.data);
		return;
		
	}

}
