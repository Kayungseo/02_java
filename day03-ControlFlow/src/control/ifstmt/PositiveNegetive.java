package control.ifstmt;

import java.util.Scanner;

/*
 * 하나의 정수를 입력받아서 
 * 음수인지, 양수인지 판단하는 클래스 
 * 
 * 단, 여기서는 0에 대한 판단은 하지 않는다. 
 * 
 * 입력받을 변수 input 을 선언하여 Scanner로 입력을 받고 
 * if ~ else 구문으로 부호를 판별한 후
 * 판별 결과를 저장하는 변수 String result에 저장하여 
 * 
 * "입력값 100 은(는) 양수 입니다. "
 * "입력값 -1은(는) 음수입니다. " 라는 문장을 출력하시오.
 */
public class PositiveNegetive {

	public static void main(String[] args) {
		//1. 선언 
		int input;
		String result;
		Scanner scan;
		
		//2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오(단, 0은 제외)");
		input = scan.nextInt();
		
		if(input < 0) {
			result = "음수";
		}else {
			result = "양수";
		}
		
		//3.사용 
		System.out.printf("입력한 정수 %d는 %s입니다.", input, result );
		
	}
}
