package kr.co.ezen.chap05_method.part02_methodTest;

public class NonStaticMethod {

	// 1. �Ű� ���� ���� ��ȯ�� ���� �޼���
	public void method1() {
		System.out.println("�Ű� ������ ��ȯ���� �Ѵ� ���� �޼����Դϴ�. ");
	}

	// 2. �Ű� ���� ���� ��ȯ���� �ִ� �޼���
	public String method2() {
		return "�Ű� ������ ������ ��ȯ���� �ִ� �޼����Դϴ�.";

	}

	// 3. �Ű� ���� �ְ� ��ȯ���� ���� �޼���
	public void method3(int num1, int num2) {
		int minus = num1 - num2;
		System.out.println("minus=" + minus);

	}

	// 4. �Ű� ������ �ְ� ��ȯ���� �ִ� �޼���

	public int method4(int num1, int num2) {
		return num1+num2;
	}
}
