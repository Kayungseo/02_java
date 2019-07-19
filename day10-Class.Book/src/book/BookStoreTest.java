package book;

/**
 * 서점에서 할 수 있는 여러 기능들 
 * 책찾기, 책수정, 신간추가, 책 폐기 
 * 등의 기능을 테스트하는 클래스 
 * 
 * @author Administrator
 *
 */
public class BookStoreTest {

	public static void main(String[] args) {
		
		// 1. 매니저에게 전달할 책장 안에 들어갈 배열(선반)
		Book[] books = new Book[0];
		
		//2. 배열로 구성되는 책장을 만든다. 
		BookShelf bookShelf = new BookShelf(books);
		
		//3. 배열로 구성된 책장을 관리할 매니저를 고용 
		BookManager manager = new BookManager(bookShelf);
		
		//4. 책장을 관리할 매니저와 함께 서점을 오픈 
		BookStore kyobo = new BookStore(manager);
		
		//-----------------------------------------------------------------------
		// 1.서점에 신간이 도착 
		Book vegeterian = new Book(1, "9788936433598(8936433598)", "채식주의자", "한강",  "창비", 247, 10800, 10);
		Book littlePrince = new Book(2, "9791159039690(1159039690)", "어린왕자초판본", "생텍쥐페리", "더스토리",  150, 8820, 5);
		Book noDaap = new Book(3, "9791190182645(1190182645)", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3);
		Book dduk = new Book(4, "9791196394509(1196394504)", "죽고싶지만 떡볶이는 먹고 싶어", "백세희", "흔", 208, 12420, 2);
		Book ax = new Book(5, "	9788956055466(8956055467)", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		// 2. 서점에 도착한 신간 입고 
		kyobo.add(vegeterian);
		kyobo.add(littlePrince);
		kyobo.add(noDaap);
		kyobo.add(dduk);
		kyobo.add(ax);
		
		// 3. 입고된 신간들 모두 확인 
		Book[] allBooks = kyobo.getAllBooks();
		for (Book book : allBooks) {
			book.print();
		}
	}

}
