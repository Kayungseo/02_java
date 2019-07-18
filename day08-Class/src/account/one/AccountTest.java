package account.one;

/**
 * 계좌(Account 타입) 클래스의 
 * 인스턴스(객체, 실체) 를 생성하고 
 * 입금기능, 현재 계좌 상태 출력 기능 등을 
 * 
 * 테스트 하는 클래스
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언 
		Account account;
		Account myAccount;
		
		// 2. 초기화 == 실체화 ( new 연산자가 하는 일이 타입의 기본값으로 초기화 해주는 것, 타입은 기본적으로 int 형 멤버변수 두개를 가지고 있는데 int 값의 기본값은 0)
		account = new Account();
		myAccount = new Account();
		
		// 3. 사용 (모든 기능은 내가 사용하는 메소드에서 정의, 디자인과 사용법 구별, 사용에서는 로직이 들어가지 않고(밖으로 나오지 않고) 
		//메소드 콜로 끝내야 함 -> 객체지향적인 코드!)
		//사용자에게는 몇가지 버튼(메소드)만 주어져야 함
		//내가 지금 잘 쓰고 있는지는 고민을 해봐야 한다. 
		
		// (1) 계좌 생성 직후 상태 출력 
		System.out.println("account의 상태");
		account.print();
		
		System.out.println("myAccount의 상태");
		myAccount.print();
		
		System.out.println("---------------------------------------");
		
		// (2) 계좌의 1,000원 입금
		System.out.println("account에 10,000원 입금");
		account.deposit(10000);//amount 변수는 선언이 헤더에서 되었으므로 메소드 끝나면 사라지고 balance 만 남아있는 상태 
		System.out.println("myAccount에 100,000원 입금");
		myAccount.deposit(100000);
		
		// (3) 입금 후 상태 출력 
		System.out.println("account의 상태");
		account.print();
		
		System.out.println("myAccount의 상태");
		myAccount.print();
		
		System.out.println("---------------------------------------");
		
		// (4) 계좌에 5,000원 입금 
		account.deposit(5000);
		
		//(5) 입금 후 상태 출력 
		System.out.println("account의 상태");
		account.print();
		
		System.out.println("myAccount의 상태");
		myAccount.print();
		
	}

}
