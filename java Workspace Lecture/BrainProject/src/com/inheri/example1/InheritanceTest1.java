package com.inheri.example1;
/*
 *  ���(Inheritance)
 * 
 *  1. ����� ����� ����� �ڵ��� ���Ἲ ��
 *  2. ���� Ŭ������ ��� ��Ҹ� ��ӹް� �߰������� �� ������ Ȯ��(extend)��
 *  3. ���� Ŭ������ �����ϱ� ���� extends����� ���
 *  4. ��� �ڹ� ���α׷��� ���� Ŭ������ ������. (���� Ŭ������ �������� ������ ObjectŬ������ �������� ���� Ŭ����)
 *  5. �ڹ��� �ֻ��� Ŭ������ ObjectŬ����(java.leng.Object) 
 */

class A {
	int aa = 1;

}

class B extends A {
	int bb = 2;
}

class C extends B {
	int cc = 3;
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		C objc = new C();

		System.out.println("objce��ü�� ��ü �Ӽ� ���� aa�� ����:" + objc.aa);
		System.out.println("objce��ü�� ��ü �Ӽ� ���� aa�� ����:" + objc.bb);
		System.out.println("objce��ü�� ��ü �Ӽ� ���� aa�� ����:" + objc.cc);
	}

}
