package control.ifstmt;

import java.util.Scanner;

/*
 * 입력된 세 정수 중 가장 큰 값을 판별하는 클래스
 * 입력값은 각각 int num1, num2, num3; 변수에 저장  
 * 가장 큰 값은 int max; 변수에 저장 
 */
public class MaxOfThree {

	public static void main(String[] args) {
		// 1. 선언
		int num1;
		int num2;
		int num3;
		int max;
		Scanner scan;

		// 2. 초기화
		scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		// 3. 사용
		if (num1 > num2) {
			// num1 이 클 때 진입
			if (num1 > num3) {
				// num1 이 클 때 진입
				max = num1;
			} else {
				// num3 이 클 때 진입
				max = num3;
			} // ctrl + shift +F : 자동 줄 맞춤
		} else {
			// num2이 클 때 진입
			if (num2 > num3) {
				// num2 이 클 때 진입
				max = num2;
			} else {
				// num3 이 클 때 진입
				max = num3;
			}
		}// else close
	}// main close
}// class close