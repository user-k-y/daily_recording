package ex4_daily_0524;

public class CardEx {

	public static void main(String[] args) {
		
		//Card.height = 0; //�̰� ���� �� �� -> �̹� Ŭ���������� ������ �Ǿ�����
		//card1.setColor("���"); //�̰� ������ -> ���� ���� ���̶�
		
		//ctrl + pageUp : �������� �̵�
		//ctrl + pageDown : �������� �̵�
		
		Card card1 = new Card();
		card1.setColor("���");
		card1.setCompany("��������");
		
		System.out.println(card1);
		card1.show();
		//syso�� �ϸ� ������ -> show()�޼��尡 void�� ������ String type���� �Ѿ�� �Ű������� ��
		//syso���� �ʰ� �׳� ȣ���ϸ� ��
		//ctrl + page up or down�� ������ �ٷιٷ� ȭ�� ��ȯ�� ��
		
		//static������ �ݵ�� Ŭ������.static���������� �����Ͽ��� ��.
		//�����ϸ�, ���������� �м��ϴ� �ܰ迡���� �ٲ��� �ʴ°� �ٶ����� ���.
		//card1.width = 80;
		//card1.height = 150;
		Card.width = 80;
		Card.height = 150;
	
		
		Card card2 = new Card();
		card2.setColor("�Ķ�");
		card2.setCompany("����");
		
		System.out.println(card2);

	}//main

}
