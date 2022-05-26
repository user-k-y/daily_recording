package ex4_daily_0527;

class Data{
	
	int data;
}

public class ReferenceReturnClass {

	public static void main(String[] args) {
		
		Data ori = new Data();
		ori.data = 100;
		System.out.println(ori);
		Data cloned = copy(ori);
		System.out.println(cloned);
		
		System.out.println(cloned.data);
		

	}//main
	
	public static Data copy(Data d) {
		System.out.println(d);
		Data cloned = new Data();//cloned는 새주소부여
		cloned.data = d.data;//데이터 값만 넘겨받음
		System.out.println(cloned);
		
		return cloned; //Data클래스의 주소를 리턴값으로 넘기고 있다.
	}

}
