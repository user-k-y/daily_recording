package ex5_daily_0528;

class A {
	int data1 = 10;
	int data2 = 30;
}

public class AccumulatorEx {

	public static void main(String[] args) {
		
		Accumulator ac = new Accumulator();
		int iresult = ac.add(10, 50);
		System.out.println("iresult: " + iresult);
		
		//접미사를 반드시 붙이도록 하자 long:L float:f
		long lresult = ac.add(100, 7500L);
		//L을 마지막에 안 붙이면 int를 호출함
		System.out.println("lresult: " + lresult);
		
		lresult = ac.add(1000L, 10);
		System.out.println("lresult: " + lresult);
		
		double dresult = ac.add(107.88, 11.55);
		System.out.println("dresult: " + dresult);
		//정수지표?에도 오차가 발생한다. 119.43인데 119.42999999로 나옴
		
		//따로 다 만들 다음에 넣는것보다 바로 매개변수 안에서 생성하는 경우가 많음
		long arrResult = ac.add(new int[] {1,2,3,4,5});
		//배열을 바로 생성해서 그 주소를 넘기는 것
		System.out.println("arrResult : " + arrResult);
		
		iresult = ac.add(new A());//객체를 새로 만들어서 넘김
		System.out.println("iresult: " + iresult);
		
		
		
		
	}//main

}
