package ex3_daily_0520;

public class Monitor {
	
	//�������(�ʵ�)
	String color; //������� ����
	int channel; //ä��
	int volume;  //����
	boolean power; //����(on/off)
	
	//����޼���
	//Monitor�� �Ѱų� ���� ����� �ϴ� �޼���
	public void power() {
		if(!this.power) {
			System.out.println("����Ͱ� �������ϴ�!");
			this.power = !power;
		}
		else {
			System.out.println("����Ͱ� �������ϴ�!");
			this.power = !power;
		}
	}
	
	public void channelUp() {
		this.channel++;
		System.out.println("���� ä�� : " + this.channel);
	}
	
	public void channelDown() {
		//this.channel--;
		System.out.println("���� ä�� : " + (--this.channel));
		//--�� ���� ���̳� �ڿ� �ٷ� ���̸� ���� = ���� - 1 �� ��
	}
	
	public void volumeUp() {
		System.out.println("���� ���� : " + (++this.volume));
	}
	
	public void volumeDown() {
		System.out.println("���� ���� : " + (--this.volume));
	}
	
	@Override
	public String toString() {
		
		
		
		return "���� ä�� : " + this.channel + ", " + "���� ���� : " + this.volume;
	}
	


}
