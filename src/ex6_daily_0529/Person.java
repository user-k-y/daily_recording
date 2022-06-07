package ex6_daily_0529;

public class Person {
	
	//불변의 정적상수
	//무조건 선언과 동시에 초기화가 반드시
	//이루어져야 한다.
	//공용데이터로써 사용되어진다. (힙에 new가 만들어 질 때, 힙에도 주소값을 가짐)
	//클래스별로 관리되어진다.(전역변수처럼 메인메서드가 종료되면 날아감. 주소가 동일)
	static final int MAX_NUMBER = 1000;
	
	//final 초기화 방법
	//1.선언과 동시에 초기화
	//2.생성자에서 단 한번 초기화
	final String nation = "KOREA"; //상수선언
	final int age; //오류나면 초기화가 안 되서 생성자를 나타내라는 뜻
	
	//기본생성자: 인스턴스 생성할 때 마지막에 클래스명(); 
	//이게 생성자를 호출한 것. 없으면 컴파일러가 알아서 생성해줌
	public Person(int age) {
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		return "nation : " + this.nation + ", age : " + this.age;
//	}

}
