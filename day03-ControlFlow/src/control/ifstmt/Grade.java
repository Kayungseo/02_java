package control.ifstmt;

import java.util.Scanner;

/*
 * 다중 선택 if 구문 사용하여 다음의 기준으로 
 * 학점을 계산하는 클래스 
 * ------------------------------------------------------
 * A : 90 점 이상 
 * B : 80-89 점 
 * C : 60-79 점 
 * D : 40-59 점 
 * F : 이하 나머지 
 * ------------------------------------------------------
 * printf로 출력 
 */
public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;

		// 2. 초기화
		Scanner scan = new Scanner(System.in);

		// 입력 알림 Prompt
		System.out.println("0~100사이의 정수를 입력");
		score = scan.nextInt();

		// 3. 사용 : score에 입력된 값을 확인/ grade 변수에 대해 case 에 따른 초기화
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 60) {
			grade = 'C';
		} else if (score >= 40) {
			grade = 'D';
		} else {
			grade = 'F';// 꼭 있어야 함-초기화 100% 코드
		}

		System.out.printf("%d 점에 해당하는 학점은 %c 입니다.", score, grade);

	}

}
