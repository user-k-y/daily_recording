package ex4_daily_0525;

import java.util.Scanner;

public class Programers_0525 {
//	프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//	전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
//	제한 조건
//	phone_number는 길이 4 이상, 20이하인 문자열입니다.
//	입출력 예
//	phone_number	return
//	"01033334444"	"*******4444"
//	"027778888"	"*****8888"
	
    public String solution(String phone_number) {

    	
    	String asterisk = "";
    	String sub2 = "";
    	String reverse = "";
    	
    	for(int i=0; i<phone_number.length()-4; i++) {
    		asterisk += "*";
    	}
    	
    	for(int i = phone_number.length()-1; i > phone_number.length()-5; i--) {
    		sub2 += phone_number.charAt(i);
    	}
    	
    	phone_number = sub2 + asterisk;
    	
    	for(int i = phone_number.length()-1; i >= 0; i--) {
    		reverse += phone_number.charAt(i);
    	}

    	System.out.println(reverse);
    	
        String answer = reverse;
        return answer;
    }
    
    //다른 사람의 풀이
    public String solution1(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
     }
    
    //다른 사람의 풀이2_정규식
    //. -> 임의의 문자 한 개 / (?=.) -> 뒷쪽에 임의의 문자 한 개를 제외하고 선택/ {숫자} -> 숫자 만큼의 자릿수 / .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
    public String solution2(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
      }
    
    
    //다른 사람의 풀이3
    public String solution3(String phone_number) {
        String answer = "";

          for (int i = 0; i < phone_number.length() - 4; i++)
              answer += "*";

          answer += phone_number.substring(phone_number.length() - 4);

          return answer;
    }
    
    //다른 사람의 풀이4
    public String solution4(String phone_number) {
        int size = phone_number.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size-4; i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(size-4, size));
        return sb.toString();
    }
    
    //다른 사람의 풀이 5
    public String solution5(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        for(int i = 0; i < len; i++){
            if(i < len - 4)
                answer += "*";
            else
                answer += phone_number.charAt(i);
        }

        return answer;
    }
    
    //다른 사람의 풀이 6
    public String solution6(String phone_number) {

        String answer = phone_number.substring(0,phone_number.length()-4).replaceAll(".","*")
        		+phone_number.substring(phone_number.length()-4);

        return answer;
    }
    //파이썬3 코드 1
//    def hide_numbers(s):
//        return "*"*(len(s)-4) + s[-4:]
//
//    # 아래는 테스트로 출력해 보기 위한 코드입니다.
//    print("결과 : " + hide_numbers('01033334444'));
    
    //파이썬3 코드2
//    import re
//
//    def hide_numbers(s):
//        p = re.compile(r'\d(?=\d{4})')
//        return p.sub("*", s, count = 0)


}
