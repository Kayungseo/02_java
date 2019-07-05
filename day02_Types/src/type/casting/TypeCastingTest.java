package type.casting;
/*
 * 숫자형 데이터 사이에 
 * 형 변환(type Casting)을 
 * 테스트하는 클래스이다. 
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.1415926535797;	
		int number = 100;
		int result;
		
		// 3.  형 변환 : (타입이름) 피연산값;
		result = number + (int) pi;//연산할 때 잠깐만 바꾸겠다. 
		
		// 4. 사용 : 출력
		System.out.println("double pi=" + pi);
		System.out.println("int number=" + number);
		System.out.println("int result=" + result);
		
		// 5. byte 타입으로 result 를 변환 저장 
		byte buffer = (byte) result; // 자바가 아는 것은 값이 아니라 int 타입 이라는 것 
		System.out.println("int result=" + result);
		System.out.println("byte buffer=" + buffer);
	}
}
