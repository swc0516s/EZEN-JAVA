package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest1 {
	private int global; // ���������� default 0

	public void testMode(int num) {
		int local = 11; // ���������� �ʱ�ȭ ����� ��

		System.out.println(num);
		System.out.println(local + num);
		System.out.println(global);
	}

}
