package ex3_daily_0520;



public class Programers {
	//문제 설명
//	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//	재한사항
//	s는 길이가 1 이상, 100이하인 스트링입니다.
//	입출력 예
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
	    		System.out.println("첫번째 글자: "+ s.charAt(0));
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
	    
	    //다른 개발자의 풀이
	    
	    String getMiddle(String word){

	        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
	    }


}
