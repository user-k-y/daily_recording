package ex4_daily_0525;

public class CalculatorEx {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		//인스턴스 메서드 호출
		int addResult = cal.add(100, 200);
		System.out.println("addResult : " + addResult);
		
		//static매서드 호출
		//cal.multiply(100, 20);
		long mulResult = Calculator.multiply(100, 20);
		System.out.println("mulResult : " + mulResult);
		
		
		double divResult = Calculator.divide(100.88, 10.55);
		System.out.println("divResult : " + divResult);
		
		//static이라서 흘림체로 바뀜
		//정적 메서드의 예시(선언부에 static제어자가 붙어있다.)--자바닥스에서 확인을 했다.
		//Integer.parseInt("100");
		//Math.random();
		
		
		
		
	}//main

}
