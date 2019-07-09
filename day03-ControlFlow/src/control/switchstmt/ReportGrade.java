package control.switchstmt;

import java.util.Scanner;

/*
 * 다중 선택 switch 구문 사용하여 다음의 기준으로 
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
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		Scanner scan  = new Scanner(System.in);

		// 2. 초기화
		// 입력 알림 prompt
		System.out.println("점수를 입력하시오");
		score = scan.nextInt();
		
		switch (score / 10) {
		case 10: case 9: 
			grade = 'A';
			break;

		case 8:
			grade = 'B';
			break;

		case 7: case 6:
			grade = 'C';
			break;

		case 5: case 4:
			grade = 'D';
			break;

		default:
			grade = 'F';
		}// end switch
		System.out.printf("입력된 점수 %d은 %c입니다.", score, grade);
	}
}
