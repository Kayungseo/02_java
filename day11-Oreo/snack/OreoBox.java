package snack;

/**
 * 
 * 오레오(Oreo) 쿠키가 
 * 여러개 들어가있는 박스 
 * @author Administrator
 *
 */
public class OreoBox {
	// TODO Oreo를 여러개 저장할 수 있는 
	// Oreo[] oreos 를 멤버 변수로 갖도록 선언
	Oreo[] oreos = new Oreo[0];
	
	//TODO 오레오 박스에 
	// 오레오 쿠키를 1개씩 추가, 삭제, 수정, 꺼내
	public void add(Oreo oreo) {
		//길이가 하나 더 긴 배열 선언 
		Oreo[] newOreos = new Oreo[oreos.lengh + 1];
		
		//복사//newOreo = oreos;
		for (int idx = 0;idx < oreos.length; idx++) {
			newOreos[idx] =oreos[idx];
		}
		newOreos[newOreos.length - 1] = oreo;
		
		this.oreos = newOreo;
	}
	
	public void remove(Oreo oreo) {
		
	}
	
	public void set(Oreo oreo) {
		
	}
	
	public void get(Oreo oreo) {
		
	}
	public 
	
}
