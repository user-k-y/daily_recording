package A1_기본이론;

public class A1_기본이론6_산술연산자 {//굉장히 중요하다
	
	public static void main(String[] args) {
		
		/*
		  # 산술 연산자 (사칙연산자 + 나머지연산자)
		  (1)  더하기        +
		  (2)  빼기          -
		  (3)  곱하기        *
		  (4)  나누기(몫)     /
		  (5)  나머지        %	 
		 */
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);//3.3333이 안나옴
		//java는      정수/정수 = 정수(몫)
		System.out.println(10 / 3.0); //소수점 16자리까지
		//            정수/실수 = 실수 
		//            실수/정수 = 실수 
		System.out.println(10 % 3);
		//나머지도 정수로 남는다
		
		// 연산자 우선순위
		// () 프로그래밍에선 소괄호도 연산자로 취급
		// * / %
		// + -
		//연산은 왼쪽에서 오른쪽으로 가는 게 원칙
		//그러나 우선순위에 걸리면 그것부터 한다
		System.out.println((10 + 3) * 2 );
		System.out.println(10 + 3 * 2 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main

}
