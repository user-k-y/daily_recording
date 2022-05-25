package ex4_daily_0526;

public class Member {

	//같은 패키지 안에 메인이 두 개 있어도 상관이 없다
	
	int iv = 100;         //인스턴스 멤버변수
	static int cv = 200;  //static 멤버변수
	
	//인스턴스 메서드
	public void imethod() {
		System.out.println("iv : " + this.iv);
		//System.out.println("cv : " + Member.cv); //클래스명.정적변수명
	}
	//static 메서드
	public static void smethod() {
		//안된다?? 이유는 언제 인스턴스가 만들어질지는 아무도 모르기 떄문이다.
		//System.out.println("iv : " + this.iv);
		
		//cv는 static변수이기 때문에 인스턴스 생성없이도 접근가능해야하는데,
		//static메서드 내에서는 얼마든지 접근 가능하다. 
		System.out.println("cv : " + Member.cv);
	}
	

}
