package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest3 {
	private final int NUM; // final : ����
	private static final int STATIC_NUM = 1;

	public FieldTest3() { // �����ڴ� ������ �ȹ������ ��ȯŸ���� �������� ����.
		this.NUM = 10; //
	}

	public void nonStaticMethod() { // �޼��� �ȿ��� ������ ������ ������ ��������.
//		 static int localStaticNum;

		// ���� ���������� static Ű���� ��� �Ұ�
		// non-static �޼���� ��ü�� �����Ǿ�߸�
		// ������ �����ϱ� ������ static Ű���尡 �� �� ����.

	}

	public static void staticMethod() {

//	static int localStaticNum;

		// static �޼��� �������� static ���� ����� �Ұ����ϴ�.
		// ���������� �޼��尡 ȣ��� �� stack�� ����� ������ �޸𸮿�
		// �����Ǵ� ��ġ ��ü�� �ٸ�
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
