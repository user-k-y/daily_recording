package A1_기본이론;

public class A1_기본이론7_서식문자 {
	
	/*
	  # 출력문의 종류
	  (1) System.out.println();    줄바꿈 가능
	  (2) System.out.print();      줄바꿈 불가
	  
	  
	  (3) System.out.printf();     규칙을 갖고 있는 출력물
	  		1) format, 서식
	  		2) %알파벳
	  				%d : decimal (십진수의 정수)
	  				%f : float  (부동 소수점, 소수가 있는 수, 실수)
	  				%c : character (문자 한 개)
	  				%s : String  (문자 여러개) //자바 문법에 대문자로 표현 실타래
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(10 / 3.0);
		
		System.out.println(10);
		
		//printf의 기본형태 System.out.printf("",); ("%d", 10);
		System.out.printf("%d", 10);
		System.out.println();
		
		
		System.out.println(3.33333333);
		System.out.printf("%f", 3.33333333);
		
		System.out.println();
		//소수점 이하를 자르고 싶을 때 .몇째자리까지 출력 -> 이게 주로 printf를 쓰는 이유
		//printf는 잘 안 쓴다.
		System.out.printf("%.2f", 3.33333333);
		System.out.println();
		
		System.out.println('B');
		System.out.printf("%c", 'B');
		System.out.println();
		
		System.out.println("Java");
		System.out.printf("%s","Java");
		
		
		
	}//main

}
