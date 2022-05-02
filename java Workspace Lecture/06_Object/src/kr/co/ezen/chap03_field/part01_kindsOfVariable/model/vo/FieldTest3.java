package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest3 {
	private final int NUM; // final : 고정
	private static final int STATIC_NUM = 1;

	public FieldTest3() { // 생성자는 아직은 안배웠지만 반환타입이 존재하지 않음.
		this.NUM = 10; //
	}

	public void nonStaticMethod() { // 메서드 안에서 생성된 변수는 무조건 지역변수.
//		 static int localStaticNum;

		// 지역 변수에서는 static 키워드 사용 불가
		// non-static 메서드는 객체가 생성되어야만
		// 접근이 가능하기 때문에 static 키워드가 올 수 없다.

	}

	public static void staticMethod() {

//	static int localStaticNum;

		// static 메서드 내에서도 static 변수 사용이 불가능하다.
		// 지역변수는 메서드가 호출될 때 stack에 생기기 때문에 메모리에
		// 생성되는 위치 자체가 다름
	}

	public int getNum() {
		return NUM;

	}

//	public void setNUM(int num) {
//		this.NUM = num;
//	}

	public static int getStaticNum() {
		return STATIC_NUM;
	}
}
