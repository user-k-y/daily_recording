package ex3_daily_0520;



public class Programers {
	//���� ����
//	�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
//	���ѻ���
//	s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
//	����� ��
//	s	return
//	"abcde"	"c"
//	"qwer"	"we"
	
		String s;
		static String res;

	    public String solution(String s) {
	        
	    	this.s = s;
	    	int s1 = s.length();
	    	System.out.println("s.length: " + s1);
	    	
	    	if (s1%2 == 1) {
	    		
	    		System.out.println(s1/2);
	    		System.out.println("ù��° ����: "+ s.charAt(0));
	    		int s2 = s1/2;
	    		char res1 = s.charAt(s2);
	    		res = res1+ "";
	    	}
	    	
	    	else {
	    		
	    		int s3 = s1/2 -1;
	    		System.out.println("s3: " + s3);
	    		int s4 = s1/2;
	    		System.out.println("s4: " + s4);
	    		
	    		char res2 = s.charAt(s3);
	    		System.out.println("res2: "+res2);
	    		char res3 = s.charAt(s4);
	    		System.out.println("res3: "+res3);
	    		res = res2 + "" + res3;
	    		System.out.println(res);
	    		
	    		
	    		
	    		
	    	}
	
	        System.out.println(res);
	    	
	        String answer = res;
	        return answer;
	    }
	    
	    //�ٸ� �������� Ǯ��
	    
	    String getMiddle(String word){

	        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
	    }


}
