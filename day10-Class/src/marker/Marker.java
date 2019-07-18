package marker;
/**
 * 화이트 보드 마카를 정의하는 클래스 
 * ---------------------------------------------------
 * 화이트 보드 마카 속성 정의 => 멤버변수로 정의
 * isOpened : boolean
 * isNew : boolean
 * String color;
 * ----------------------------------------------------
 * 생성자 정의 : 중복정의 
 * 
 * -----------------------------------------------------
 * 기능 정의 
 *  use()
 *  print()
 * @author Administrator
 *
 */

public class Marker {
	static int count = 0;
	//1. 멤버변수
	/**마커의 뚜껑이 열려있는지 여부*/
	boolean isOpened;
	/**
	 * 마커의 뚜껑이 열려있는지 여부 
	 * true : 뚜껑이 열려있는 상태 
	 * false : 뚜껑이 닫혀있는 상태 
	 */
	
	boolean isNew;
	String color;
	int serial;
	
	//2. 생성자 선언부 
	Marker(){
		this.serial = ++count;
	}
	
	Marker(boolean isNew) {
		this();
		this.isNew = isNew;
	}
	
	Marker(boolean isNew, boolean isOpened) {
		this(isNew);
		this.isOpened = isOpened;
	}
	
	Marker(boolean isNew, boolean isOpened, String color){
		this(isNew, isOpened);
		this.color = color;
	}
	
	//3. 메소드 선언부  
	/**
	 * ~색의 마커를 사용하고 있습니다. 
	 * 라는 문장을 출력하는 메소드 
	 */
	public void use() {
		System.out.printf("%s색 마커를 사용하고 있습니다.%n",  color);
	}
	
	public void print() {
		String message = "마커 색상 : %d, %s, %s, %s%n";
		String openStatus = "";
		String newStatus = "";
		
		if( isOpened ) {
			openStatus = "뚜껑이 열렸습니다.";
		} else {
			openStatus = "뚜껑이 닫혔습니다.";
		}
		
		if( isNew ) {
			newStatus = "새 마커입니다.";
		} else {
			newStatus = "다 쓴 마커입니다.";
		}
		
		System.out.printf(message, serial, color, openStatus, newStatus);
	}
}
