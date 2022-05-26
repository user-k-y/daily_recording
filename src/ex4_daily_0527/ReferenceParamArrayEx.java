package ex4_daily_0527;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10,20,30,40,50};
	    System.out.println("change메서드 호출 전의 값 : " + arr[0]);
		System.out.println("main() arr의 주소값 : " + arr);
		change(arr); //배열명은 곧 주소다. 2차원배열에서는 1차원 배열도 주소가 된다.
		//change(new int[] {10,20,30});//좌측과 같이 주소값을 넘겨도 된다.
		//직접 만들어서 넘길 수도 있다.
		//하지만 참조변수가 없어서 주소값을 확인하거나 조작할 수 없다.
		System.out.println("change메서드 호출 후의 값 : " + arr[0]);
		

	}
	
	public static void change(int[] arr) {
		
		System.out.println("change() arr의 주소값 : " + arr);
		arr[0] = 999;
		System.out.println("change()메서드 내의 값 : " + arr[0]);
		return;
		
	}

}
