package ex6_daily_0529;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person(50);
		Person p2 = new Person(150);
		Person p3 = new Person(250);
		//final�Ӽ��� ����̹Ƿ� ���� ���� ���� ����.
		//p.nation = "USA";
		//p.age = 100;
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		//���������� ������ �ּҰ��� �� �ٸ�, new�����ڰ� �ٸ� �ּҰ� �Ҵ�����
		
		System.out.println(Person.MAX_NUMBER);

	}//main

}
