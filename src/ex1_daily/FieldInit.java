package ex1_daily;

//설계도, 붕어빵 틀을 만드는 작업
public class FieldInit {
	
	//기본현
	byte byteField;  //1byte
	short shortField; //2
	int intField; //4(디폴트타입)
	long longField; //8
	
	boolean boolField; //1
	char charField; //2
	
	float floatField; //4
	double doubleField; //8
	
	//참조형변수
	int[] arrField; //4
	String strField; //4
	
	//annotation : 컴파일러에게 강한 컴파일 요구
	//toString() : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나,
	//원하는 포맷으로 멤버변수들을 출력하고자 할때 사용을 많이 함.
	@Override
	public String toString() {
		
		String str = "byteField: " + byteField + " shortField: " + shortField + " intField: " + intField +
				      " boolField: " + boolField + " strField: " + strField;
		
		return str;
	}
	
	
}
