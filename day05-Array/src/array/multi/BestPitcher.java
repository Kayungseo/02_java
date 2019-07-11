package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		//1. 선언 2. 초기화
		Scanner scan =new Scanner(System.in);
		double[][] era =new double[3][5];
		double min = 10.0;
		int team = 0;
		int pitcher = 0;
		
		// 각팀별로 각 투수의 방어율 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력 ");
		for (int idx = 0;idx <era.length; idx++) {
			System.out.println((idx +1) + "번째 팀 1~5선발 투수 방어율 : ");
			for(int ind = 0; ind < era[idx].length; ind++) {
				era[idx][ind] = scan.nextDouble();
				if(era[idx][ind] < min) {
					min = era[idx][ind];
					team = idx;
					pitcher = ind;
				}
			}
		}
		
		System.out.println("최고의 투수는: ");
		System.out.printf("%d 번째 팀 %d 번째 투수", team + 1, pitcher + 1);

	}

}
