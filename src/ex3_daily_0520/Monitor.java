package ex3_daily_0520;

public class Monitor {
	
	//�������(�ʵ�)
	String color; //������� ����
	int channel; //ä��
	boolean power; //����(on/off)
	
	//����޼���
	//Monitor�� �Ѱų� ���� ����� �ϴ� �޼���
	public void power() {
		if(!this.power) {
			System.out.println("����Ͱ� �������ϴ�!");
		}
		else {
			System.out.println("����Ͱ� �������ϴ�!");
		}
	}

}
