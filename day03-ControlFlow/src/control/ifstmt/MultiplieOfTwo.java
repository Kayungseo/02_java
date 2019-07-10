package control.ifstmt;

import java.util.Scanner;

/*
 * 입력된 정수에 대해서 2의 배수인지 판별하는 클래스 
 * 
 * Scanner 를 사용하여 입력된 정수를 input 변수에 저장하고
 * 입력된 값이 2의 배수인지 판단하는 조건을 작성하시오.
 * 2의 배수 판별 결과는 String result에 저장하시오.
 * 
 * --(1)--------------------------------------------------------------------
 * 2의 배수일 때 : "입력값 4은(는) 2의 배수 입니다."
 * 2의 배수가 아닐 때 : "입력값 5은(는) 2의 배수가 아닙니다. 
 * --(2)---------------------------------------------------------------------
 * 2의 배수일 때 : "입력값 4은(는) 2의 배수 입니다."
 * 2의 배수가 아닐 때 : 
 * 			"입력값 5은(는) 2의 배수가 아닙니다. "
 * 			"나머지가 1입니다. "
 */
public class MultiplieOfTwo {

	public static void main(String[] args) {
		//1. 선언
		int input;
		int mod;
		String result;
		Scanner scan;
		
		//2. 초기화
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		input = scan.nextInt();
		
		//3. 사용
		//입력값이 0인 경우 : "0은 배수 판별을 할 수 없습니다."
//		if ( input == 0 ) {
//			System.out.println("0은 배수 판별을 할 수 없습니다.");
//		}else	if(input%2==0) {
//			result = "배수입니다.";
//			System.out.printf("입력값 %d은(는) 2의 %s%n ", input, result);
//		} else {
//			result="배수가 아닙니다.";
//			System.out.printf("입력값 %d은(는) 2의 %s%n", input, result);
//		}
		
		if (input == 0) {
			System.out.println("0은 배수판별 할 수 없다.");
		} else {
			if(input%2==0) {
				result = "배수입니다.";
				System.out.printf("입력값 %d은(는) 2의 %s%n ", input, result);
			} else {
				result="배수가 아닙니다.";
				System.out.printf("입력값 %d은(는) 2의 %s%n", input, result);
			}
		}
			
		//3-2. 사용 
//		mod = input % 2;
//		if(input%2==0) {
//			result = "배수입니다.";
//			System.out.printf("입력값 %d은(는) 2의 %s%n", input, result);
//		} else {
//			result="배수가 아닙니다.";
//			System.out.printf("입력값 %d은(는) 2의 %s%n", input, result);
//			System.out.printf("나머지가 %d입니다. ", mod);
//		}
		
	}

}
