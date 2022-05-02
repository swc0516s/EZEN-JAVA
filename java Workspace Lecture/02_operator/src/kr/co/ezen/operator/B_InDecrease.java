package kr.co.ezen.operator;

public class B_InDecrease {

	public void method1() {
		int num1 = 10;

		// ++, -- : 증감 연산자 ++a(전위 연산자) a++(후위 연산자)
		System.out.println("증감 연산자 사용 전:" + num1); // 10
		System.out.println("++num1을 1회 수행한 결과:" + (++num1)); // 11
		System.out.println("++num1을 2회 수행한 결과:" + (++num1)); // 12
		System.out.println("++num1을 3회 수행한 결과:" + (++num1)); // 13
		System.out.println("++num1을 4회 수행한 결과:" + (++num1)); // 14
		System.out.println("++num1을 5회 수행한 결과:" + (++num1)); // 15
		System.out.println("전위 증감 연산 수행 후 num1의 값:" + num1); // 15

		// 앞에 붙으면 값을 먼저 증가
		// 뒤에 붙으면 값을 나중에 증가
		// num2 = num1 ++ //num1값이 5, num2값이 5로 된 후 num1값이 +1 (후위 연산자)

		int num2 = 10;

		System.out.println("증감 연산자 적용 전:" + num2); // 10
		System.out.println("num2++을 1회 수행한 결과:" + (num2++)); // 10
		System.out.println("num2++을 2회 수행한 결과:" + (num2++)); // 11
		System.out.println("num2++을 3회 수행한 결과:" + (num2++)); // 12
		System.out.println("num2++을 4회 수행한 결과:" + (num2++)); // 13
		System.out.println("num2++을 5회 수행한 결과:" + (num2++)); // 14
		System.out.println("후위 증감 연산 수행 후 num2의 값:" + num2); // 15
	}

	public void method2() {
		int age = 20;

		System.out.println("현재 나이는?" + age); // 20
		System.out.println("++age는?" + (++age)); // 21
		System.out.println("age++는?" + (age++)); // 21 출력 후 22가 됨
		System.out.println("--age는?" + (--age)); // 21
		System.out.println("age--는?" + (age--)); // 21 출력 후 20이 됨
		System.out.println("현재 나이는?" + age); // 20

	}

	public void method3() {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a++); // 10 (11)
		// a=11 b=20 c=30
		System.out.println((++a) + (b++)); // 12 + 20(21)
		// a=12 b=21 c=30
		System.out.println((a++) + (--b) + (--c)); // 12(13) + 20 + 29
		// a=13 b=20 c=30

		System.out.println("a=" + a); // 13
		System.out.println("b=" + b); // 20
		System.out.println("c=" + c); // 29
	}

	public void method4() {
		int num1 = 20;
		int result = num1++ * 3; //연산자에는 우선순위가 있음. 교재참고
		// 20(21) *3 = 60
		System.out.println("result:" + result); //60
		System.out.println("num1:" + num1);// 21

		int num2 = 20;
		int result2 = ++num2 * 3;
		// 21 *3 = 63
		System.out.println("result2:" + result2); //63
		System.out.println("num2:" + num2); //21
		
	}
}
