package control.loop;

public class WhileTest {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		int idx = 50;

		while (idx > 0) {
			if ( idx % 2 != 0) {
				;
			}
			else {
				System.out.printf("%d%n", idx);
			}
			idx--;
		}
		System.out.println();

		idx = 50;
		while (idx > 0) {
			if (idx % 2 != 0) {
				continue;
			}
			System.out.printf("%d\t", idx);
		}

		System.out.println();
		idx = 1;
		while (idx <= 10) {
			System.out.printf("%2d x %2d = %3d%n", idx, idx, idx * idx);
			idx++;
		}
	}
}
