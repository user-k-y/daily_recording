package ex2_daily_0519;

public class Student {
	//멤버변수(필드)
	String name;
	int age;
	
	//Object클래스의 toString()오버라이딩(재정의)
	@Override
	public String toString() {

		//String str = "이름: " + this.name + ", " + "나이 : " + this.age;
		
		
		//this : (클래스 내의 지역변수) 클래스의 주소(new라는 연산자가 메모리에 할당을 해주면 비로소 사용가능해짐(활성화))
		//this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 비로소 활성화)
		//this는 static메서드나 클래스 안에 사용할 수 없다.
		//static은 외부 클래스 앞에선 못 붙는다. 그러나 내부 클래스에서는 허용한다. 멤버메서드를 스테틱으로 만들었을 때 리턴 값으로 this를 쓸 수 없다.
		return "이름: " + this.name + ", " + "나이 : " + this.age;
		
		//return str;
	}

}
