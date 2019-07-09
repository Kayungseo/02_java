package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		//1. 선언 
		double weight;
		double height;
		Scanner scan = new Scanner(System.in);
		String result;
		
		//2. 초기화 
		System.out.println("체중을 입력하시오(kg) ");
		weight = scan.nextDouble();
		System.out.println("신장을 입력하시오(m) ");
		height = scan.nextDouble();
		//비만도 
		double BMI = weight / (height * height);
		
		//3. 사용 
		if (BMI < 15.0) {
			result = "병적인 저체중"	;
		} else if (BMI < 18.5) {
			result = "저체중";
		} else if (BMI < 23.0) {
			result = "정상";
		} else if (BMI <= 27.5) {
			result = "과체중";
		} else if (BMI <= 40.0) {
			result = "비만";
		} else {
			result = "병적인 비만";
		} 
		System.out.printf("BMI = %f, 판정 : %s", BMI, result);
	}
}
