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
		String bmiResult = methods.calcBMI(1.58, 56);
		System.out.println("BMI 판정결과 = " + bmiResult);
		//
		int minOfTwo = methods.min(5, 9);
		System.out.println("min = "+ minOfTwo);
		//
		int maxOfTwo = methods.max(9, 8);
		System.out.printf("max = %d%n", maxOfTwo);
		//
		int[] intsForSum = new int[3];
		intsForSum[0] = 9;
		intsForSum[1] = 8;
		
		int sumOfNums = methods.sumOfArray(intsForSum);
		System.out.printf("sumOfNums = %d%n", sumOfNums);
		//
		int[] intsForAvg = {6, 4, 7};
		double avgOfNums = methods.avgOfArray(intsForAvg);
		System.out.printf("avgOfnums = %.2f%n", avgOfNums);
		//
		methods.adder('+', 10, 20);
	}

}
