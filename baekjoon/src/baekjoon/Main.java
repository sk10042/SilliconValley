package baekjoon;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new	Scanner(System.in);
		int	month	=	sc.nextInt();
		int	day		= 	sc.nextInt();		

		int monthday[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String week[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int sum = 0;
		for(int i=0 ; i< month ; i++){
			if(i<month-1){
				sum = sum + monthday[i];
			}else{
				sum = sum + day;
			}
		}
		System.out.println(week[sum%7]);
	}
}