package ex3_daily_0522;

public class Time {
	
	//접근제어자(Access Modifier)의 종휴
	
	//private : 같은 클래스 내에서만 접근 가능함. (접근 범위가 가장 좁다.)
	//private로 멤버변수를 감싸는 것을 캡슐화(암호화)를 시킨다라고 함
	//자바는 보안에 강하고 이식성이 좋기 때문에 멤버변수를 내부적으로 감싸고
	//읽어갈 수 있게끔 메서드를 제공, 그것을 게터라고 하고
	//수정할 수 있게 하는 것을 세터라고 함
	//통상 클래스를 만들 때는 멤버변수는 private로 감싸고 게터나 세터 중 필요한 것을 제공
	
	//protected : 같은 패키지, 자손클래스에서만 접근 가능함.
	//default : 같은 패키지에서만 접근 가능함. 
	//변수 앞에 아무것도 적지 않으면 디폴트가 기본임. 그렇다고 적으면 에러남
	//public : 누구나 다 접근가능함.
	
	//우리는 프라이빗과 퍼블릭만 눈여겨보기
	//멤버변수만 프라이빗으로 감싸고 나머지는 다 퍼블릭으로 돌리기
	
	//프로그래밍을 할 때, 멤버변수는 웬만하면 private접근제어자로
	//감싸주고(캡슐화), 각 멤버변수에 해당하는 getter()를 제공해주는
	//방법으로 클래스를 작성하는 방법이 올바르다.
	private int hour;
	private int minute;
	private int second;
	
	
	//getter() 이렇게 일일이 만들기엔 번거롭다
//	public int getHour() {
//		return this.hour;
//	}
	
	//Source탭 -> Generate Getters and Setter를 클릭 후
	//원하는 멤버변수를 체크를 하셔서 getter, setter메서드를
	//자동 완성을 하면 된다.
	
	//게터는 값만 읽어와서 매개변수를 넣을 필요가 없으나 세터는 값을 세팅해야하기 때문에 매개변수 필요
	//select all, generate 하면 다 만들어줌
	
	
	//getter() : 멤버변수의 값을 읽어가는 메서드
	//setter() : 멤버변수의 값을 수정하는 메서드
	
	//그러나 통상적으로 프라이빗을 걸고 나면 세터는 잘 주어지지 않는다.
	public int getHour() {
		return this.hour;//게터에도 this.를 붙여주는 게 정상
		//그러나 값만 읽어가기 때문에 그냥 써줌. this를 분여주자
		//this는 객체 자기 자신의 주소를 가지고 있다.
		//new라는 연산자가 힙에 Time 클래스를 (램?)할당했을 때 비로소 활성화
		//반대되는 개념은 조상, super
	}
	public void setHour(int hour) {
		//시에 대한 에외처리 코드를 작성
		if(hour < 0 || hour > 23) {
			System.out.println("시를 잘못 입력하셨습니다.");
			return; //void이기 때문에 리턴값에 아무것도 주지 않음
			//그냥 종료를 시켜야 하기 때문에 리턴을 주는 것
		}
		this.hour = hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		//분에 대한 에외처리 코드를 작성
		if(minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		//초에 대한 에외처리 코드를 작성
		if(second < 0 || second > 59) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour() + "시 " + this.getMinute() + "분 " +
	           this.getSecond() + "초";
	}
	

}
