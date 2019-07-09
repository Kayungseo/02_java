package control.ifstmt;

import java.util.Scanner;

/*
 *  두 정수 중 큰 값을 가려내는 클래스 
 *  두 정수는 Scanner로 입력받는다. 		
 */
public class FindMax {

	public static void main(String[] args) {
		//1. 선언 
		int x;
		int y;
		int max = 0;
		Scanner scan;
		
		//2. 초기화 
		scan = new Scanner(System.in);// 이 형태의 넓은 공간을 새로 마련한다. 
		//입력을 알리는 메시지 
		System.out.println("정수 두 값 입력(space bar 로 분리)");
		x = scan.nextInt();
		y = scan.nextInt();
		
		//3.  사용된 두값을 비교 
		if(x > y) {
			max = x;
			System.out.printf("입력된 두 값은 %d와 %d,  둘 중 큰 값은 %d%n", x, y, max);
		}
		if(y > x) {
			max = y;
			System.out.printf("입력된 두 값은 %d와 %d,  둘 중 큰 값은 %d%n", x, y, max);
		}
		if(x == y) {
			max = x;
			System.out.println("두 값은 같습니다. ");
		}
}
