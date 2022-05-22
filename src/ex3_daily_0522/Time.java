package ex3_daily_0522;

public class Time {
	
	//����������(Access Modifier)�� ����
	
	//private : ���� Ŭ���� �������� ���� ������. (���� ������ ���� ����.)
	//private�� ��������� ���δ� ���� ĸ��ȭ(��ȣȭ)�� ��Ų�ٶ�� ��
	//�ڹٴ� ���ȿ� ���ϰ� �̽ļ��� ���� ������ ��������� ���������� ���ΰ�
	//�о �� �ְԲ� �޼��带 ����, �װ��� ���Ͷ�� �ϰ�
	//������ �� �ְ� �ϴ� ���� ���Ͷ�� ��
	//��� Ŭ������ ���� ���� ��������� private�� ���ΰ� ���ͳ� ���� �� �ʿ��� ���� ����
	
	//protected : ���� ��Ű��, �ڼ�Ŭ���������� ���� ������.
	//default : ���� ��Ű�������� ���� ������. 
	//���� �տ� �ƹ��͵� ���� ������ ����Ʈ�� �⺻��. �׷��ٰ� ������ ������
	//public : ������ �� ���ٰ�����.
	
	//�츮�� �����̺��� �ۺ��� �����ܺ���
	//��������� �����̺����� ���ΰ� �������� �� �ۺ����� ������
	
	//���α׷����� �� ��, ��������� �����ϸ� private���������ڷ�
	//�����ְ�(ĸ��ȭ), �� ��������� �ش��ϴ� getter()�� �������ִ�
	//������� Ŭ������ �ۼ��ϴ� ����� �ùٸ���.
	private int hour;
	private int minute;
	private int second;
	
	
	//getter() �̷��� ������ ����⿣ ���ŷӴ�
//	public int getHour() {
//		return this.hour;
//	}
	
	//Source�� -> Generate Getters and Setter�� Ŭ�� ��
	//���ϴ� ��������� üũ�� �ϼż� getter, setter�޼��带
	//�ڵ� �ϼ��� �ϸ� �ȴ�.
	
	//���ʹ� ���� �о�ͼ� �Ű������� ���� �ʿ䰡 ������ ���ʹ� ���� �����ؾ��ϱ� ������ �Ű����� �ʿ�
	//select all, generate �ϸ� �� �������
	
	
	//getter() : ��������� ���� �о�� �޼���
	//setter() : ��������� ���� �����ϴ� �޼���
	
	//�׷��� ��������� �����̺��� �ɰ� ���� ���ʹ� �� �־����� �ʴ´�.
	public int getHour() {
		return this.hour;//���Ϳ��� this.�� �ٿ��ִ� �� ����
		//�׷��� ���� �о�� ������ �׳� ����. this�� �п�����
		//this�� ��ü �ڱ� �ڽ��� �ּҸ� ������ �ִ�.
		//new��� �����ڰ� ���� Time Ŭ������ (��?)�Ҵ����� �� ��μ� Ȱ��ȭ
		//�ݴ�Ǵ� ������ ����, super
	}
	public void setHour(int hour) {
		//�ÿ� ���� ����ó�� �ڵ带 �ۼ�
		if(hour < 0 || hour > 23) {
			System.out.println("�ø� �߸� �Է��ϼ̽��ϴ�.");
			return; //void�̱� ������ ���ϰ��� �ƹ��͵� ���� ����
			//�׳� ���Ḧ ���Ѿ� �ϱ� ������ ������ �ִ� ��
		}
		this.hour = hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		//�п� ���� ����ó�� �ڵ带 �ۼ�
		if(minute < 0 || minute > 59) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		//�ʿ� ���� ����ó�� �ڵ带 �ۼ�
		if(second < 0 || second > 59) {
			System.out.println("�ʸ� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour() + "�� " + this.getMinute() + "�� " +
	           this.getSecond() + "��";
	}
	

}
