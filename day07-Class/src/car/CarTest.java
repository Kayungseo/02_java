package car;

/*
 * Car(자동차) 라는 타입의 실체 객체를 생성하고 
 * 사용하는 클래스 
 */
public class CarTest {

	public static void main(String[] args) {
		//Car 라는 타입의 객체를 사용하기 위한 
		//참조 변수가 필요.
		// 1. Car 타입의 변수 선언(기본형이 아니므로 참조형)
		Car myCar; 
		
		// 2. 초기화 
		myCar = new Car();
		
		//3. 사용 : Car라는 타입(클래스)에 정의된 메소드 호출

		// (1) 별명 붙이기
		System.out.println("===별명 붙이기 전===");
		myCar.printf();
		
		System.out.println("== 별명 붙이고 난 후==");
		myCar.setNickname("울트라짱");
		myCar.printf();
		
		//이 호출구문 전체가 return 된 값으로 치환됨.
		System.out.println("1. myCar의 초기화 후 속도");
		myCar.printf();
		
		System.out.println("2. 80만큼 가속 후 속도");
		myCar.accelerate(60);
		myCar.accelerate(20);
		
		myCar.printf();
		
		System.out.println("초기화 후 속도");
	    myCar.stop();
	    myCar.printf();
	}

}
