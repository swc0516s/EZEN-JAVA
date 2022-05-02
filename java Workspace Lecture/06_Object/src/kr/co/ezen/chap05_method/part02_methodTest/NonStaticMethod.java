package kr.co.ezen.chap05_method.part02_methodTest;

public class NonStaticMethod {

	// 1. 매개 변수 없고 반환값 없는 메서드
	public void method1() {
		System.out.println("매개 변수와 반환값이 둘다 없는 메서드입니다. ");
	}

	// 2. 매개 변수 없고 반환값이 있는 메서드
	public String method2() {
		return "매개 변수가 없지만 반환값이 있는 메서드입니다.";

	}

	// 3. 매개 변수 있고 반환값이 없는 메서드
	public void method3(int num1, int num2) {
		int minus = num1 - num2;
		System.out.println("minus=" + minus);

	}

	// 4. 매개 변수가 있고 반환값이 있는 메서드

	public int method4(int num1, int num2) {
		return num1+num2;
	}
}
