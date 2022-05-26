package ex4_daily_0527;

import java.util.Arrays;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		
		int[] ori = new int[] {10,20,30,40,50}; //원본배열
		int[] cloned = null;              
		//int[] cloned = new int[5];    //타겟배열          //타겟배열
		//System.out.println("copy()호출 전 : " + Arrays.toString(cloned));
		//cloned = copy(ori);
		//몇개만큼 더 할 건지가 추가된다면 렝쓰를 추가하면 됨
		cloned = copy(ori, ori.length);
		System.out.println("ori[]값 : "+ Arrays.toString(ori));
		System.out.println("cloned[]값 : " + Arrays.toString(cloned));
		
	
	}//main
		


	//리턴타입이 참조타입 온 경우 //temp주소와 cloned주소가 같다
	//public static int[] copy(int[] arr) {
	//몇개만큼 할거냐를 추가하고 싶으면 매개변수에 인트를 더 받으면 됨
	public static int[] copy(int[] arr, int size) {
		//몇 개만큼 더 할 건지 메서드를 이용하지 않고도 만들 수 있다
		int[] temp = new int[size];
		//int[] temp = new int[5];
		//int[] temp = new int[arr.length];
		//System.arraycopy(arr, 0, temp, 0, arr.length);
		//System.arraycopy(주소, 시작인덱스, 타겟어레이명,?이것도 0번째 ,어레이길이)
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i]; }
		
		return temp;
		
	}

}
