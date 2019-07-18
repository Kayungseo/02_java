package pracitce.methods;

public class MethodsTest {

	public static void main(String[] args) {
		// 1. 메소드 정의 클래스 VarietyMethods 의 
		//     변수 선언 
		
		VarietyMethods methods;
		
		// 2. 초기화 
		methods = new VarietyMethods();
		
		// 3. 사용 
		methods.sayHello();
		methods.maxims("홍길동", "호부호형을 못하니...");
		methods.maxims("소크라테스", "Know Yourself");
		methods.maxims("피터사간", "모든 사람은 두 종류의 고통중에서 선택해야한다. " + "훈련하는 고통이거나 후회하는 고통이거나");
		double cel = methods.fahToCel(100.0);
		System.out.println("cel = " + cel);
		//
		int[] arr = {4, 5};
		methods.printNineNineTableArray(arr);//{4, 5} 바로 넣을 수 없다.
		//
		
		System.out.println("BMI 판정결과 = " + methods.calcBMI(1.58, 56));
		//
		System.out.println("min = "+ methods.min(5, 9));
		//
		System.out.printf("max = %d%n", methods.max(9, 8));
		//
		int[] intsForSum = new int[3];
		intsForSum[0] = 9;
		intsForSum[1] = 8;
		
		System.out.printf("sumOfNums = %d%n", methods.sumOfArray(intsForSum));
		//배열의 평균 계산 메소드 테스트 
		//1. 매개변수로 넘길 변수 선언 
		int[] ages = {12, 15, 10, 18, 17};
		//2. 테스트할 메소드 call하며 1의 배열 전달 
		double avgOfAges = methods.avgOfArray(ages);
		//3. 평균이 저장된 변수를 출력
		System.out.printf("avgOfnums = %.2f%n", methods.avgOfArray(avgOfAges));
		//
		methods.adder('+', 10, 20);
	}

}
