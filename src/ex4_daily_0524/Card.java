package ex4_daily_0524;

public class Card {

	//�ν��Ͻ� ���� -- �ݵ�� �ν��Ͻ��� �����ؾ� ���� ����
	private String color;   //ī���� ����
	private String company; //ī�� ȸ���
	
	//static���� (����, Ŭ����, ���� ����) -- �ν��Ͻ� ���� ���̵� Ŭ������.static���������� ���ٰ���
	static int width = 100; //ī���� ��
	static int height = 50; //ī���� ����
	//����ƽ�� ���� ���͸� �� �ʿ䰡 ����. �����ؼ� ���� �����̺��� ���� ������.
	
	//getter, setter �ν��Ͻ� �޼���(����ƽ ���� �ʾұ� ������)
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void show() {
		//���������� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�.
		
		//�޼��� �ȿ� static������ ����� ���� ���Ѵ�. �� ������
		//static�� Ư���� �ν��Ͻ� �������̵� �󸶵��� ���� �����ؾ� �Ǵµ�,
		//���� �ν��Ͻ��� ������ �� �ƹ��� �𸣱� ������ �̷��� �ڵ带 �ۼ��ϴ� ����
		//�ùٸ� ����� �ƴϴ�.
		
		//�޼��� ��ü�� static�̶� ���������δ� static����� ���Ѵ�
		
		//static int i = 10;
		//int i = 10;//int i; �̰� �ʱ�ȭ�� �ƴ�! syso�ϸ� �ʱ�ȭ�� �� �ƴٰ� ������
		
		//�޼��尡 static�̶�� this����� ���Ѵ�. Card.show()�� ȣ���� �� ������ �ȴ�.
		//this�� new�����ڷ� �ν��Ͻ��� �������� �� Ȱ��ȭ�Ǳ� �����̴�.
		//this�� static�� �ݴ����� ����!
		
		String color = this.color;
		String company = this.company;
		System.out.println(color + ", " + company);
	}
	
	@Override
	public String toString() {
		//��������(static)�� ���� ����� �ݵ�� Ŭ������.static���������� ������ �ؾ�
		//�ùٸ� ����̴�.
//		return "card1�� ���� : " + this.color + ", card1�� ȸ�� : " + this.company + 
//				", ũ�� : (" + Card.height //this.height;�� �Ǳ� ������ �ùٸ� ����� �ƴ�.
//				+ ", " + Card.width + ")";
		
		//���͸� �����Ƿ� �̷��� ���ִ� �� �´ٰ� ��
		return "card1�� ���� : " + this.getColor() + ", card1�� ȸ�� : " + this.getCompany() + 
				", ũ�� : (" + Card.height
				+ ", " + Card.width + ")";
	}
	
}
