package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		int total = 0;
		int score = 0;
		int count = 0;
		double average;
		Scanner scan = new Scanner(System.in);

		// 3. 사용
		do {
			System.out.println("점수를 입력(끝내려면 0 입력) :");
			score = scan.nextInt();
			total += score;
			count++;
		} while (score != 0);

		if (count == 0) {
			System.out.println("입력된 값이 없습니다.");
		} else {
			average = (double) total / (count - 1); // score에 0 입력해도 count++해서 빠져나오므로.
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f%n", average);
		}
	}
}
