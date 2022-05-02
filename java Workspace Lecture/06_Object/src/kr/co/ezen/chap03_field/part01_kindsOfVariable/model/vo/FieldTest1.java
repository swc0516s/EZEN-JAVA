package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest1 {
	private int global; // 전역변수는 default 0

	public void testMode(int num) {
		int local = 11; // 지역변수는 초기화 해줘야 됨

		System.out.println(num);
		System.out.println(local + num);
		System.out.println(global);
	}

}
