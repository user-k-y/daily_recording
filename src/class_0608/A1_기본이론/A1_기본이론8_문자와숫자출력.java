package A1_기본이론;

public class A1_기본이론8_문자와숫자출력 {
	public static void main(String[] args) {
		
		System.out.println(10 + 3);
		
		
		//더하기는 어느 하나라도 앞에 문자가 등장하면 연결만 된다. 전체가 ""로 묶어진다고 보기
		System.out.println("10 + 10 은? = " + 10 + 10);
		//문자 앞에 쓴 숫자끼리의 연산은 된다.
		System.out.println(10+10+" 10 + 10 은? = " + 10+10);
		
		System.out.println(1000-200);
		//문자 중간에 산술을 하려면 ()로 묶어준다.
		System.out.println("거스름돈 = " + (1000-200) + "원");
		//프린트 f를 쓰면 굳이 괄호로 치지 않아도 산술이 된다.
		System.out.printf("프린트f 거스름돈 = %d원", 1000-200);
		System.out.println();
		
		
		// /, *는 산술연산부터하고 붙는다.
		System.out.println("나누기(몫) = " + 10 / 3);
		System.out.println("곱하기 = " + 10 * 3);
		// 그러나 -는 괄호로 묶어줘야함 +가 되는 순간 문자취급이 되어서 빼기는 후술로는 안 됨
		System.out.println("빼기 = " + (10 - 3));
		System.out.println( 10-7 + " 빼기");
		
		
		
		
		
	}//end of main

}
