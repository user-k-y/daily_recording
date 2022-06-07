package ex6_daily_0529;

public class StudentEx {

	public static void main(String[] args) {

		//new는 여기에 있는 멤버변수에 맞게끔 메모리 공간을 할당
		//기본생성자를 직접 만들지 않아도 호출하면 에러가 없음
		
		//기본 생성자 호출
		Student student = new Student();
		//System.out.println(student.getAge());
		System.out.println(student);
		
		//매개변수가 있는 생성자를 호출
		Student student2 = new Student("홍길동", 50);
		System.out.println(student2);
		
		Student student3 = new Student("홍길동");
		System.out.println(student3);
		
		Student student4 = new Student(50);
		System.out.println(student4);
		
		
		

	}//main

}
