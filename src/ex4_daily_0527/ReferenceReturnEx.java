package ex4_daily_0527;

import java.util.Arrays;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		
		int[] ori = new int[] {10,20,30,40,50}; //�����迭
		int[] cloned = null;              
		//int[] cloned = new int[5];    //Ÿ�ٹ迭          //Ÿ�ٹ迭
		//System.out.println("copy()ȣ�� �� : " + Arrays.toString(cloned));
		//cloned = copy(ori);
		//���ŭ �� �� ������ �߰��ȴٸ� ������ �߰��ϸ� ��
		cloned = copy(ori, ori.length);
		System.out.println("ori[]�� : "+ Arrays.toString(ori));
		System.out.println("cloned[]�� : " + Arrays.toString(cloned));
		
	
	}//main
		


	//����Ÿ���� ����Ÿ�� �� ��� //temp�ּҿ� cloned�ּҰ� ����
	//public static int[] copy(int[] arr) {
	//���ŭ �Ұųĸ� �߰��ϰ� ������ �Ű������� ��Ʈ�� �� ������ ��
	public static int[] copy(int[] arr, int size) {
		//�� ����ŭ �� �� ���� �޼��带 �̿����� �ʰ� ���� �� �ִ�
		int[] temp = new int[size];
		//int[] temp = new int[5];
		//int[] temp = new int[arr.length];
		//System.arraycopy(arr, 0, temp, 0, arr.length);
		//System.arraycopy(�ּ�, �����ε���, Ÿ�پ�̸�,?�̰͵� 0��° ,��̱���)
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i]; }
		
		return temp;
		
	}

}
