package ex6_daily_0529;

public class Student {
	//값들을 적는 통상 1. 멤버변수 적어주고  2. 생성자 적어주고  3. 메서드 적어주기 
	
	//인스턴스 멤버 변수를 선언함.
	private String name;
	private int age;
	
	//Ctrl+Space
	//클래스명ㅇ과 생성자명이 반드시 같아야 한다.
	//생성자는 리턴타입이 존재하지 않는다.(void라는 것을 서주지 않는다)
	//생성자가 하나도 없는 클래스는 기본적으로 컴파일시에 컴파일러가 알아서
	//기본생성자를 추가해준다.
	public Student() {
		System.out.println("기본생성자 호출");
		//return; //써줘도 되는데 안 적어주는 게 좋다.
	}

	public Student(String name) {
		System.out.println("매개변수 String만 있는 생성자 호출");
		this.name = name;
	}
	
	public Student(int age) {
		System.out.println("매개변수 int만 있는 생성자 호출");
		this.age = age;
	}
	
	//Source - Generate using field 매개변수가 있는 생성자 생성
	//하지만 우리는 기본생성자 만든 것을 복사해서 멤버변수 복사하고 붙여놓기
	//세터를 잘 제공하지 않는 이유도 생성자로 값을 지정할 수 있기 떄문
	//매개변수가 있는 생성자
	//생성자라는 것은 인스턴스 초기화 메서드라고 생각하자.
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}




	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return this.getName() + ", " + this.getAge();
	}
	
	
	
	
	
	

}
