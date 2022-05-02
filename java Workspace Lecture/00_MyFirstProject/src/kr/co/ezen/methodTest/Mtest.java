package kr.co.ezen.methodTest;

public class Mtest { // class : 설계도

	public void methodA() { // 메서드? ==> 기능, 메서드는 호출되야 일을 한다.
		System.out.println("나 메서드 A야!!!");
		methodB(); // method call
	}

	public void methodB() {
		System.out.println("나 메서드 B야!!!");
		methodC();
	}

	public void methodC() {
		System.out.println("나 메서드 C야!!!");
	}

}
