package A1_기본이론;

public class A6_연산자_예제LV5 {

	public static void main(String[] args) {
		
		
		int change = 174900;
		
		int five_m = change/50000;
		System.out.println(five_m);
		
		int one_m = (change%50000)/10000;
		System.out.println(one_m);
		
		int one_m1 = change%50000/10000;
		System.out.println(one_m1);
		
		int five_c = change%50000%10000/5000;
		System.out.println(five_c);
		
		int five_b = change%50000%10000%5000/500;
		System.out.println(five_b);
		
		int one_b = change%50000%10000%5000%500/100;
		System.out.println(one_b);
		
		//이럴 필요 없이 마지막 수로 나눠진 나머지만 봐도 됨
		
		System.out.println("------------------------");
		
		int time = 123123;
		
		int hour = time/60/60;
		System.out.println(hour);
		
		int hour1 = time/(60*60);
		System.out.println(hour1);
		
		int min = time%(60*60)/60;
		System.out.println(min);
		
		int sec = time%60;
		System.out.println(sec);
		
		System.out.println("--------------------------");
		//멜론예제
		
		int flat_rate = 10500;
		
		int one_music = 600;
		
		int music_sum = 0;
		
		int music_count = 0;
		
		for (int i = 1; music_sum < flat_rate; i++) {
			
			music_sum = one_music*i;
			music_count = i;
		}
		
		System.out.println(music_count);
		
		System.out.println("--------------");
		
		System.out.println(9000/700);
		
		System.out.println("--------------------");
		//경주해야함
		
		int chul_one = 56/4;
		int min_one = 84/7;
		
		System.out.println(chul_one*3-min_one*3);
		System.out.println("-----***********--");
		
		////////가장 큰 수 랑 작은 수 빼는 건 더 나은 코드가 있을 듯
		///너무길고 복잡하다!!!
		
		int[] max_min = {2,4,7,6};
		
		int max_n = 0;
		
		int min_n = 0;
		
		
		for(int i = 1; i < max_min.length; i++) {
			
			if (max_min[i] > max_min[i-1]) {
				max_n = max_min[i];
			} 
			
			if (max_min[0] > max_min[i]) {
				max_n = max_min[0];
			}
		}
		
		for(int i = 1; i < max_min.length; i++) {
			if (max_min[i] < max_min[i-1]) {
				min_n = max_min[i];
			} 
			
			if (max_min[0] < max_min[i]) {
				min_n = max_min[0];
			}
		}
		
		System.out.println(max_n/min_n);
		System.out.println(max_n%min_n);
		
		System.out.println("-----------------------------");
		///A 5
		
		//세전 월급 찾기
		
		int salary = 1350;
		
		int whole_salary = 0;
		
		whole_salary = salary + salary/9;
		
		System.out.println(whole_salary/12);
		
		System.out.println("----------------------");
		//전체우유 수
		//뭔가 더 깔끔하게 할 수 없나....ㅜㅜㅜㅜ
		
		
		int percent_m = 16;
		int percent_a = 15;
		int whole_milk = 0;
		int remain_milk = 345;
		int percent_milk = (100 - percent_m - percent_a);
		
		whole_milk = remain_milk/percent_milk*100;
		System.out.println(whole_milk);
		
		System.out.println("----------------------------");
		//float으로 받을 땐 둘 중에 하나 실수인 거 그냥 .만 쓰지 말고 마지막에 f써주기
		float bam_min = 11.0f/100;

		float bam_3min = bam_min*3;
		
		System.out.printf("%.2f\n",bam_3min);
		
		System.out.println("-----------------------");
		
		int remained_cash = 0;
		int first_cash = 50000;
		int movie = 12000;
		int pop = movie/10*6;
		int coke = pop - 4000;

		remained_cash = first_cash - movie*2 -pop -coke*2;
		
		System.out.println(movie);
		System.out.println(pop);
		System.out.println(coke);
		System.out.println(remained_cash);
		
		System.out.println("------------------------");
		//A.4 조립
		
		int com_one = 60/4;
		int com_96_three = 96/3*com_one;
		
		System.out.println(com_96_three/60);
		
		System.out.println("-------------------------");
		//연봉찾기
		
		//월급이 세후월급인줄 알았음
		int salary_m = 100;
		int salary_y = 0;
		salary_y = 100/9*10*12;
		
		System.out.println("세후월급이 100원이라면 "+ salary_y);
		
		//세전 월급
		salary_y = 100*12-(100*12/10);
		System.out.println("세전월급이 100원이라면 "+ salary_y);
		
		System.out.println("-------**********.0f가 맞는지**------------------");
		
		float square_line = 5.0f/8/4;
		System.out.println(square_line);
		System.out.println("그냥 출력 " + (5/8/4));
		System.out.println(5/8/4);//이것도 정수로 하면 그냥 0나옴
		System.out.println(5.0/8/4);//실수로 해야 소수점 나옴
		System.out.printf("%.2f\n", square_line);
		//%0.f로 나타내면 실수도 정수처럼 표현된다
		
		System.out.println("---------------------------");
		//A3
		int shelter_home = 0; //집에서 쉰 곳 까지의 거리
		shelter_home = 1800 - 300;
		
		System.out.println(1800+300+200+200+shelter_home);
		
		System.out.println("-----------------------------");
		///집에서 헤맸던 거!!! 못 풀었던 것!!
		
		int Home_to_Sc = 1200;
		int Sc_to_Ac = 1100;
		int Ac_to_Home = 1300;
		int Sc_to_Home = 1200;
		
		int All_Sc = Home_to_Sc + Sc_to_Home;
		int Academy = Home_to_Sc + Sc_to_Ac + Ac_to_Home;
		
		int one_week = All_Sc*2 + Academy*3;
		
		System.out.println(one_week*4);
		
		System.out.println("------------------------------");
		//집에서 봤을 때 어려웠던 것
		//계단
		
		int nomal_production = 10000;
		int make_p = 30;
		
		int Whole_product = nomal_production/1000*30 + nomal_production;
		int pay = Whole_product * 30;
		
		System.out.println(pay);
		
		System.out.println("----------------------");
		//음수를 값에 넣으면 더하기로 연산하기
		int start_point = 50;
		int win = +3;
		int lose = -2;
		int chul_position = 0;
		
		System.out.println(start_point + win*4 + lose*2);
		
		System.out.println("---------------------------");
		//A2 평균!!!!!!
		
		int f_cash = 10000;
		int snack_p = 1200;
		int need_snack = 6;
		int p_snack = 0;

		if(need_snack > 2) {
			p_snack = need_snack/3*2 + need_snack%3;
		} else {
			p_snack = need_snack;
		}
		
		System.out.println(p_snack);
		System.out.println(f_cash - p_snack * snack_p);
	
		System.out.println("---------------------------");
		
		int ko = 83;
		int eng = 54;
		int math = 23;
		
		System.out.println(average(ko, eng, math));
		System.out.printf("%.2f\n", average(ko, eng, math));
		
		System.out.println("--------------------------");
		
		System.out.printf("%.2f", 3*7/2.0);
		
		
		

	}//end of main
	
	//평균 구하는 메서드 만들기
	public static float average (int a, int b, int c) {
		
		int[] for_count = {a, b, c};
		float avr = (float)(a+b+c)/for_count.length;
		//플로트로 받아도 계산식에서 플로트지정 없이 정수로만 계산이면 소수점자리 절사함
		System.out.println(for_count.length);
		
		return avr;
		
	}

}//end of class
