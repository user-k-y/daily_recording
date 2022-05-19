package ex2_daily_0519;

public class StudentEx {
	//클래스 영역은 this 사용가능. 얼마든지 멤버변수를 가질 수 있음
	//하나의 자바파일엔  public이라는 접근제어자는 오로지 한 개만 쓰여야 함(class 앞에서만 인 듯)
	
	
	
	
	public static void main(String[] args) {
		//메서드 영역
		//this. -> 안됨
		
		
		//아래는 각각 독립된 저장공간을 가지는 인스턴스가 힙에 할당이 된다.
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 42;
		s1.name = "홍길동";
		
		//s1의 주소를 s2에다가 대입
		s2 = s1;  //원래 s2가 가르키고 있던 인스턴스는 쓰레기 객체가 된다.
		          //gc(garbage collector)가 쓰레기 객체를 수집하여 소멸시킨다.
		//이제 주소가 공유가 되어버림
		
		
		s2.age = 11;
		//그래서 s2만 바꿔도 주소가 같아서 둘 다 바뀌게 됨
		
		System.out.println(s1);
		System.out.println(s2);

		
		
		
		
		
		
		
		
	}//main

}
