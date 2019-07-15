package array.basic;
/*
 * 자바 1.5 버전부터 지원되는 
 * 향상된 for 반복문의 기능
 * ---------------------------------
 * 데이터구조와 함께 사용된다.
 * 
 * 데이터 구조 : 1. 배열( Arrary)
 * 						2. 리스트 (List)
 * 						3. 맵 (Map)
 * 						4. 셋 (Set)
 * ---------------------------------
 * 
 * 							
 */
public class ForEachTest {

	public static void main(String[] args) {
		//1. 배열의 선언(과 동시에 값을 넣으면서 2. 초기화)
		int[] numbers= {	1, 2, 3, 4, 5 }; //length : 5 (0~4)
		int sum = 0;
		
		//3. foreach 구문으로 배열 값 출력 
		//for (원소의 타입 변수이름 : 자료구조(==배열)) {
		//		문장들;
		//}
		for (int num : numbers) {
			System.out.println("num=" + num);//num을 출력하는데 값이 자동으로 바뀜(단, 값을 각 칸에 직접 넣을수는 없다)
			sum += num;
		}
		System.out.println("sum=" + sum);
	}
}