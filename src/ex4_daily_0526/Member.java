package ex4_daily_0526;

public class Member {

	//���� ��Ű�� �ȿ� ������ �� �� �־ ����� ����
	
	int iv = 100;         //�ν��Ͻ� �������
	static int cv = 200;  //static �������
	
	//�ν��Ͻ� �޼���
	public void imethod() {
		System.out.println("iv : " + this.iv);
		//System.out.println("cv : " + Member.cv); //Ŭ������.����������
	}
	//static �޼���
	public static void smethod() {
		//�ȵȴ�?? ������ ���� �ν��Ͻ��� ����������� �ƹ��� �𸣱� �����̴�.
		//System.out.println("iv : " + this.iv);
		
		//cv�� static�����̱� ������ �ν��Ͻ� �������̵� ���ٰ����ؾ��ϴµ�,
		//static�޼��� �������� �󸶵��� ���� �����ϴ�. 
		System.out.println("cv : " + Member.cv);
	}
	

}
