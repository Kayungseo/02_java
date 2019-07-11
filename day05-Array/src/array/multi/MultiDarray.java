package array.multi;

public class MultiDarray {

	public static void main(String[] args) {
		char stars[][];
		
		stars = new char[6][];
		for(int idx = 0; idx < stars.length; idx++) {
			stars[idx] = new char[idx +1];
			for(int ind = 0; ind < stars[idx].length; ind++) {
				stars[idx][ind] = '*';
				System.out.printf("%c", stars[idx][ind]);
			}
			System.out.println();
		}
	}

}
