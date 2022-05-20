package ex3_daily_0520;

public class Monitor {
	
	//멤버변수(필드)
	String color; //모니터의 색상
	int channel; //채널
	boolean power; //전원(on/off)
	
	//멤버메서드
	//Monitor를 켜거나 끄는 기능을 하는 메서드
	public void power() {
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다!");
		}
		else {
			System.out.println("모니터가 꺼졌습니다!");
		}
	}

}
