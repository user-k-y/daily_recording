package ex6_daily_0529;

//A클래스는 아무런 생성자가 존재하지 않으므로,
//컴파일시에 컴파일러가 알아서 기본생성자를 추가해준다.
class A {
	int value;
}

class B {
	int value;
	
//	public B() {
//	}
	
	public B(int value) {
		this.value = value;
	}
}

//하나의 자바파일에 public은 하나만 있어야 함
public class ConstructorEx {

	public static void main(String[] args) {
		
		A a = new A();
		//컴파일 예외를 잡는 방법
		//1.B클래스에 기본생성자를 추가
		//2.B클래스 생성자 호출 시 매개변수 값으로 int값을 지정을 해줌
		
		//B b = new B(); //에러남. 기본생성자 정의가 안 됨
		//해결방안 1.해당 클래스에 기본생성자 직접생성  2.매개변수 값 넣기 call by value
		B b = new B(100);
		
	}//main

}
