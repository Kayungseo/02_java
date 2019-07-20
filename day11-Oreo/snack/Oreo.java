package Snack;

/**
 * Oreo 쿠키를 정의하는 클래스
 * ----------------------------------------
 * 속성 : 
 * cream 		: String  : 바닐라, 초코, 딸기, 말차
 * radius 		: double : 오레오 쿠키 1개의 반지름 길이 
 * thickness  : double : 오레오 1개의 두께 
 * -----------------------------------------
 * 생성자 : 기본 생성자, 중복 정의된 this, this()로 정의하는 생성자 
 * 총 4개의 생성자 중복정의 
 * -----------------------------------------
 * 메소드 : 
 * print() : void : 오레오 쿠키의 상태 출력 
 * changeCream(String cream) : void 
 * 					: 매개변수로 입력된 cream 값으로 
 * 					: 오레오 쿠키의 크림을 변경함 
 * 
 * @author Administrator
 *
 */
public class Oreo {
	//1. 멤버변수 선언
	//TODO 쿠키 일련번호 int seq; 추가 
	String cream;
	double radius;
	double thickness;
	int seq;
	
	//2. 생성자 중복정의 
	Oreo(){
		
	}// 기본 생성자 필수적으로 명시 
	
	Oreo(String cream) {
		this();//기본 생성자 호출 
		this.cream = cream; 
	}
	
	Oreo(String cream, double radius) {
		this(cream);
		this.radius = radius;
	}
	
	Oreo(String cream, double radius, double thickness) {
		this(cream, radius);
		this.thickness = thickness;
	}
	
	//3. 메소드 선언 
	public void print() {
		System.out.printf("오레오 쿠키 상태 [크림의 종류 : %s, 반지름 : %4.1f, 두께 : %4.1f]%n", cream, radius, thickness);
	}
	
	public void changeCream(String cream) {
		this.cream = cream;
	}
	
	//TODO 접근자, 수정자 추가 
	public String getCream(){
		return this.cream;
	}	
	
	public void setCream(String cream) {
		this.cream = cream;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getThickness() {
		return this.thickness;
	}
	
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	
	public int getSeq() {
		return this.seq;
	}
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
}
