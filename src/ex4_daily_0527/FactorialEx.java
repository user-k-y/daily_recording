package ex4_daily_0527;

public class FactorialEx {

	public static void main(String[] args) {
		
		long result = FactorialEx.factorial(5L);
		System.out.println("5!(팩토리얼)의 값 :" + result);
		

	}//main
	
	public static long factorial(long n) {
		
		long result = 0L;
		//무한반복을 끝내기위한 것
		//비로소 n이 1일때, 재귀호출이 더 이상 안이루어진다. f(1) = 1이니깐.
		if(n==1) {
			result = 1;
		}
		
		else {
			System.out.println("result값 : " + result + ", n값 : " + n);
			result = n * factorial(n-1);//재귀호출이 직접적으로 이루어지는 곳
			System.out.println("result값 : " + result + ", n값 : " + n);
		}
		
		
		return result;
	}

}
