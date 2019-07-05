package type.primitive;
/*
 *  char : 문자 1개를 저장하는 타입 
 *  -------------------
 *  유니코드 표기법으로 저장히고
 *  출력하여 테스트하는 클래스 
 * 
 */
public class CharUnicodeTest {

	public static void main(String[] args) {
		//1 . 선언, 2. 초기화 동시에
		char han = '\ud55c';
		char gul = '\uae00';
		
		// 3. 사용 
		System.out.println("han=" + han);
		System.out.println("gul=" + gul);
		System.out.println("han + gul = " + han + gul);
		
		System.out.println("---------------------");
		
		System.out.println("han=" + han);
		System.out.println("gul=" + gul);
		System.out.println(han + gul);// 문자화 되지 않고 편리한 산술연산으로 처리 
		System.out.println(han + "" + gul);// ""(String)은 화살표, 산수연산 불가능 -> 문자로 출력하도록 판단
		
	}

}
