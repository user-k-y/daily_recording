package ex4_daily_0524;

public class CardEx {

	public static void main(String[] args) {
		
		//Card.height = 0; //이건 에러 안 남 -> 이미 클래스영역에 생성이 되어있음
		//card1.setColor("노랑"); //이건 에러남 -> 아직 생성 전이라서
		
		//ctrl + pageUp : 이전파일 이동
		//ctrl + pageDown : 다음파일 이동
		
		Card card1 = new Card();
		card1.setColor("노랑");
		card1.setCompany("국민은행");
		
		System.out.println(card1);
		card1.show();
		//syso로 하면 에러남 -> show()메서드가 void기 때문에 String type으로 넘어가야 매개변수로 들어감
		//syso쓰지 않고 그냥 호출하면 됨
		//ctrl + page up or down을 누르면 바로바로 화면 전환이 됨
		
		//static변수는 반드시 클래스명.static변수명으로 접근하여야 함.
		//웬만하면, 공유변수는 분석하는 단계에서는 바꾸지 않는게 바람직한 방법.
		//card1.width = 80;
		//card1.height = 150;
		Card.width = 80;
		Card.height = 150;
	
		
		Card card2 = new Card();
		card2.setColor("파랑");
		card2.setCompany("농협");
		
		System.out.println(card2);

	}//main

}
