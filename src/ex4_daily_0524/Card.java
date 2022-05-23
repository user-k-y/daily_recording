package ex4_daily_0524;

public class Card {

	//인스턴스 변수 -- 반드시 인스턴스를 생성해야 접근 가능
	private String color;   //카드의 색상
	private String company; //카드 회사명
	
	//static변수 (정적, 클래스, 공유 변수) -- 인스턴스 생성 없이도 클래스명.static변수명으로 접근가능
	static int width = 100; //카드의 폭
	static int height = 50; //카드의 높이
	//스테틱은 게터 세터를 할 필요가 없다. 공유해서 쓰고 프라이빗도 없기 때문에.
	
	//getter, setter 인스턴스 메서드(스테틱 붙지 않았기 때문에)
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void show() {
		//지역변수는 반드시 초기화를 해야한다.
		
		//메서드 안에 static변수를 사용을 하지 못한다. 그 이유는
		//static의 특성은 인스턴스 생성없이도 얼마든지 접근 가능해야 되는데,
		//언제 인스턴스가 생성될 지 아무도 모르기 때문에 이렇게 코드를 작성하는 것은
		//올바른 방법이 아니다.
		
		//메서드 자체가 static이라도 지역변수로는 static사용을 못한다
		
		//static int i = 10;
		//int i = 10;//int i; 이건 초기화가 아님! syso하면 초기화가 안 됐다고 에러남
		
		//메서드가 static이라면 this사용을 못한다. Card.show()로 호출할 때 문제가 된다.
		//this는 new연산자로 인스턴스를 생성했을 때 활성화되기 때문이다.
		//this와 static은 반대적인 개념!
		
		String color = this.color;
		String company = this.company;
		System.out.println(color + ", " + company);
	}
	
	@Override
	public String toString() {
		//정적변수(static)는 접근 방법이 반드시 클래스명.static변수명으로 접근을 해야
		//올바른 방법이다.
//		return "card1의 색상 : " + this.color + ", card1의 회사 : " + this.company + 
//				", 크기 : (" + Card.height //this.height;도 되긴 되지만 올바른 방법은 아님.
//				+ ", " + Card.width + ")";
		
		//게터를 썼으므로 이렇게 써주는 게 맞다고 함
		return "card1의 색상 : " + this.getColor() + ", card1의 회사 : " + this.getCompany() + 
				", 크기 : (" + Card.height
				+ ", " + Card.width + ")";
	}
	
}
