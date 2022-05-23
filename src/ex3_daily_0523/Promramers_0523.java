package ex3_daily_0523;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Promramers_0523 {
//	이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//	별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
//	제한 조건
//	n과 m은 각각 1000 이하인 자연수입니다.
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로를 입력하세요: ");
        int a = sc.nextInt();//가로
        System.out.print("세로를 입력하세요: ");
        int b = sc.nextInt();//세로
        
        String garo = "";
        
       //(("*" * a ) + "\n") * b;
 
        for (int j = 0; j < b; j++) {
        for (int i = 0; i < a; i++) {
        	garo += "*"; } garo += "\n";}
        
        System.out.println(garo);
        
        //다른 사람의 풀이1
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
        
        //대부분의 풀이
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            } System.out.println();}
        
        //섞은 풀이
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<a; i++){
            sb1.append("*");}
        for(int i=0; i<b; i++){
            System.out.println(sb1.toString());}

    }

}
