package A1_�⺻�̷�;

public class A6_������_����LV5 {

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
		
		//�̷� �ʿ� ���� ������ ���� ������ �������� ���� ��
		
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
		//��п���
		
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
		//�����ؾ���
		
		int chul_one = 56/4;
		int min_one = 84/7;
		
		System.out.println(chul_one*3-min_one*3);
		System.out.println("-----***********--");
		
		////////���� ū �� �� ���� �� ���� �� �� ���� �ڵ尡 ���� ��
		///�ʹ���� �����ϴ�!!!
		
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
		
		//���� ���� ã��
		
		int salary = 1350;
		
		int whole_salary = 0;
		
		whole_salary = salary + salary/9;
		
		System.out.println(whole_salary/12);
		
		System.out.println("----------------------");
		//��ü���� ��
		//���� �� ����ϰ� �� �� ����....�̤̤̤�
		
		
		int percent_m = 16;
		int percent_a = 15;
		int whole_milk = 0;
		int remain_milk = 345;
		int percent_milk = (100 - percent_m - percent_a);
		
		whole_milk = remain_milk/percent_milk*100;
		System.out.println(whole_milk);
		
		System.out.println("----------------------------");
		//float���� ���� �� �� �߿� �ϳ� �Ǽ��� �� �׳� .�� ���� ���� �������� f���ֱ�
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
		//A.4 ����
		
		int com_one = 60/4;
		int com_96_three = 96/3*com_one;
		
		System.out.println(com_96_three/60);
		
		System.out.println("-------------------------");
		//����ã��
		
		//������ ���Ŀ������� �˾���
		int salary_m = 100;
		int salary_y = 0;
		salary_y = 100/9*10*12;
		
		System.out.println("���Ŀ����� 100���̶�� "+ salary_y);
		
		//���� ����
		salary_y = 100*12-(100*12/10);
		System.out.println("���������� 100���̶�� "+ salary_y);
		
		System.out.println("-------**********.0f�� �´���**------------------");
		
		float square_line = 5.0f/8/4;
		System.out.println(square_line);
		System.out.println("�׳� ��� " + (5/8/4));
		System.out.println(5/8/4);//�̰͵� ������ �ϸ� �׳� 0����
		System.out.println(5.0/8/4);//�Ǽ��� �ؾ� �Ҽ��� ����
		System.out.printf("%.2f\n", square_line);
		//%0.f�� ��Ÿ���� �Ǽ��� ����ó�� ǥ���ȴ�
		
		System.out.println("---------------------------");
		//A3
		int shelter_home = 0; //������ �� �� ������ �Ÿ�
		shelter_home = 1800 - 300;
		
		System.out.println(1800+300+200+200+shelter_home);
		
		System.out.println("-----------------------------");
		///������ ��̴� ��!!! �� Ǯ���� ��!!
		
		int Home_to_Sc = 1200;
		int Sc_to_Ac = 1100;
		int Ac_to_Home = 1300;
		int Sc_to_Home = 1200;
		
		int All_Sc = Home_to_Sc + Sc_to_Home;
		int Academy = Home_to_Sc + Sc_to_Ac + Ac_to_Home;
		
		int one_week = All_Sc*2 + Academy*3;
		
		System.out.println(one_week*4);
		
		System.out.println("------------------------------");
		//������ ���� �� ������� ��
		//���
		
		int nomal_production = 10000;
		int make_p = 30;
		
		int Whole_product = nomal_production/1000*30 + nomal_production;
		int pay = Whole_product * 30;
		
		System.out.println(pay);
		
		System.out.println("----------------------");
		//������ ���� ������ ���ϱ�� �����ϱ�
		int start_point = 50;
		int win = +3;
		int lose = -2;
		int chul_position = 0;
		
		System.out.println(start_point + win*4 + lose*2);
		
		System.out.println("---------------------------");
		//A2 ���!!!!!!
		
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
	
	//��� ���ϴ� �޼��� �����
	public static float average (int a, int b, int c) {
		
		int[] for_count = {a, b, c};
		float avr = (float)(a+b+c)/for_count.length;
		//�÷�Ʈ�� �޾Ƶ� ���Ŀ��� �÷�Ʈ���� ���� �����θ� ����̸� �Ҽ����ڸ� ������
		System.out.println(for_count.length);
		
		return avr;
		
	}

}//end of class
