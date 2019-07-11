package array.multi;
/*
 * 수학의 행렬을 나타낼 수 있는 
 * 2차원 배열을 선언하고 초기화 후 
 * 출력해보는 클래스 
 */
public class Matrix {

	public static void main(String[] args) {
		//1선언 2 배열 초기화 목록으로 초기화
//		int[][] matrix     = {{0, 1, 0}, {}, {0, 0}};//원소인 배열의 길이가 일정할 필요가 없다. //전체 배열의 길이 = 3
//		int[]	  numbers = {10, 20, 30};

//		int[] matrix[0] = {0, 1, 0}; //matrix[0].length == 3
//		int   matrix[0][0] = 0;
//		matrix[1].length == 0
//		matrix[2].length == 2
		
		
		int[][] matrix     = {{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};
		
		//3. 출력 (for : index를 사용)
		for (int idx = 0; idx <matrix.length; idx++) {
			for ( int ind = 0; ind < matrix[idx].length; ind++) {
				System.out.printf("%d\t", matrix[idx][ind]);
			}
			System.out.println();//new line(Enter key)
		}
		//4. 출력 (foreach로 출력)//차이 이해 
		for (int[] numbers : matrix) {
			for (int num : numbers) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
	}
}
