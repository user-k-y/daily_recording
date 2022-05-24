package ex4_daily_0525;

import java.util.Scanner;

public class Programers_0525 {
//	���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
//	��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
//	���� ����
//	phone_number�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
//	����� ��
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
    
    //�ٸ� ����� Ǯ��
    public String solution1(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
     }
    
    //�ٸ� ����� Ǯ��2_���Խ�
    //. -> ������ ���� �� �� / (?=.) -> ���ʿ� ������ ���� �� ���� �����ϰ� ����/ {����} -> ���� ��ŭ�� �ڸ��� / .(?=.{4}) ==> ���ʿ��� ������ ���� 4���� ������ ������ ���� �� �� ����
    public String solution2(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
      }
    
    
    //�ٸ� ����� Ǯ��3
    public String solution3(String phone_number) {
        String answer = "";

          for (int i = 0; i < phone_number.length() - 4; i++)
              answer += "*";

          answer += phone_number.substring(phone_number.length() - 4);

          return answer;
    }
    
    //�ٸ� ����� Ǯ��4
    public String solution4(String phone_number) {
        int size = phone_number.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size-4; i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(size-4, size));
        return sb.toString();
    }
    
    //�ٸ� ����� Ǯ�� 5
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
    
    //�ٸ� ����� Ǯ�� 6
    public String solution6(String phone_number) {

        String answer = phone_number.substring(0,phone_number.length()-4).replaceAll(".","*")
        		+phone_number.substring(phone_number.length()-4);

        return answer;
    }
    //���̽�3 �ڵ� 1
//    def hide_numbers(s):
//        return "*"*(len(s)-4) + s[-4:]
//
//    # �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//    print("��� : " + hide_numbers('01033334444'));
    
    //���̽�3 �ڵ�2
//    import re
//
//    def hide_numbers(s):
//        p = re.compile(r'\d(?=\d{4})')
//        return p.sub("*", s, count = 0)


}
