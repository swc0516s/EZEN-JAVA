package kr.co.ezen.variable;

public class B_Constant {
	// 상수 테스트
	public void finalConstant() {
		int age; // 변수 선언
		final int AGE; // 상수 변수 = 변하지않는 변수 = 한번 값이 들어가면 변하지 않음(final)
		// int NUMBER = 100; 상수변수를 보통 대문자로 쓰기 때문에 일반 변수는 보통 소문자로 씀

		age = 20;
		AGE = 20;

		System.out.println("age:" + age);
		System.out.println("AGE:" + AGE);
//		System.out.println("NYMBER:" + NUMBER);

		age = 30;
//		AGE = 30;
		System.out.println("age:" + age);
		System.out.println("AGE:" + AGE);
		System.out.println("상수값은 한 번 저장 후 값 변경 불가능");
	}

}
