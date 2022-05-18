package ex1_daily;

public class FieldInitEx {
	public static void main(String[] args) {
		//붕어빵을 찍고있다.
		//제품을 생산하고 있다.
		//new연산자가 클래스에 있는 멤버들의 바이트 크기만큼
		//힙에다가 메모리 할당을 하며 동시에 초기화를 시켜주는
		//역할을 한다.
		//fi.(->참조변수)찍으면 나오는 애들을 멤버변수 = 필드 라고한다
		FieldInit fi = new FieldInit();
		System.out.println(fi.byteField);
		System.out.println(fi.boolField);
		System.out.println(fi.floatField);
		System.out.println(fi.arrField);
		
		System.out.println(fi.toString());
		System.out.println(fi);
		
		
		
		
	}//main

}
