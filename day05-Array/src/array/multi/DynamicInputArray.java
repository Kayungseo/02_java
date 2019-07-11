package array.multi;

import java.util.Scanner;

/*
 * 정수를 저장하는 동적 2차 배열 numbers 생성
 * 
 * numbers의 사이즈 : 4
 * numbers[0] <== 5
 * numbers[1] <== 3
 * numbers[2] <== 2
 * numbers[3] <== 7
 * 
 * 각각의 사이즈를 Scanner로 입력받아서 생성 
 */
public class DynamicInputArray {

	public static void main(String[] args) {
		//1. 선언 2. 초기화
		int[][] numbers2d;
		Scanner scan = new Scanner(System.in);
		int input;
		int value = 0;
		
		//2. 2차 배열 입력하여 생성 
		System.out.println("2차 배열의 크기를 입력하세요(4): ");
		input = scan.nextInt();
		
		numbers2d = new int[input][];
		
		for (int idx = 0; idx < numbers2d.length; idx++) {
			System.out.printf("인덱스[%d] 1차 배열 크기 입력:%n", idx);
//			input = scan.nextInt();
			//스캐너로 입력된 값으로 1차 배열을 생성 
			numbers2d[idx] = new int[scan.nextInt()];
			for(int ind = 0;ind < numbers2d[idx].length; ind++) {
				numbers2d[idx][ind] = (value += 10);//값 할당 
			}
		}
		
		for(int[] number : numbers2d) {
			for(int num : number) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
	}
}
