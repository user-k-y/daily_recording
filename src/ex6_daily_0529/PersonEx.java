package ex6_daily_0529;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person(50);
		Person p2 = new Person(150);
		Person p3 = new Person(250);
		//final속성은 상수이므로 값을 변경 절대 못함.
		//p.nation = "USA";
		//p.age = 100;
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		//참조변수로 넣으면 주소값이 다 다름, new연산자가 다른 주소값 할당해줌
		
		System.out.println(Person.MAX_NUMBER);

	}//main

}
