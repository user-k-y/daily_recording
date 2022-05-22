package ex3_daily_0522;

public class TimeEx {
	public static void main(String[] args) {
		
		Time t1 = new Time();
		//t1.hour = 10; //프라이빗을 걸어놓으면 보이지 않는다고 에러남
		//System.out.println(t1.getHour());
		System.out.println(t1);
		
		//시를 설정
		t1.setHour(10);
		//분을 설정
		t1.setMinute(30);
		//초를 설정
		t1.setSecond(12);
		
		System.out.println(t1);
		
		
		
	}//main

}
