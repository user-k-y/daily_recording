package ex3_daily_0523;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Promramers_0523 {
//	�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
//	��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.
//	���� ����
//	n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���θ� �Է��ϼ���: ");
        int a = sc.nextInt();//����
        System.out.print("���θ� �Է��ϼ���: ");
        int b = sc.nextInt();//����
        
        String garo = "";
        
       //(("*" * a ) + "\n") * b;
 
        for (int j = 0; j < b; j++) {
        for (int i = 0; i < a; i++) {
        	garo += "*"; } garo += "\n";}
        
        System.out.println(garo);
        
        //�ٸ� ����� Ǯ��1
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
        
        //��κ��� Ǯ��
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            } System.out.println();}
        
        //���� Ǯ��
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<a; i++){
            sb1.append("*");}
        for(int i=0; i<b; i++){
            System.out.println(sb1.toString());}

    }

}
