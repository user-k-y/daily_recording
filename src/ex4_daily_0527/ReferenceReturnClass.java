package ex4_daily_0527;

class Data{
	
	int data;
}

public class ReferenceReturnClass {

	public static void main(String[] args) {
		
		Data ori = new Data();
		ori.data = 100;
		System.out.println(ori);
		Data cloned = copy(ori);
		System.out.println(cloned);
		
		System.out.println(cloned.data);
		

	}//main
	
	public static Data copy(Data d) {
		System.out.println(d);
		Data cloned = new Data();//cloned�� ���ּҺο�
		cloned.data = d.data;//������ ���� �Ѱܹ���
		System.out.println(cloned);
		
		return cloned; //DataŬ������ �ּҸ� ���ϰ����� �ѱ�� �ִ�.
	}

}
