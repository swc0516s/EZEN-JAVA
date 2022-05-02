package kr.co.ezen.chap03_field.part01_kindsOfVariable.run;

import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Book;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {

//		FieldTest1 f1 = new FieldTest1();
//		f1.testMode(10);

//		// public --> ��𼭵� ���� ����
//		FieldTest2 f2 = new FieldTest2();
//		System.out.println(f2.pubA);
//		System.out.println("������" + f2.getPubA());
//		// System.out.println(f2.setPubA("�����ٲ�"));
//		f2.setPubA("dd");
//		System.out.println("������" + f2.getPubA());
//		System.out.println(f2.pubA);
//
//		// default --> ���� ��Ű�� �������� ���� ����
////		System.out.println(f2.defB); // error
//		System.out.println("������:" + f2.getDefB());
//		f2.setDefB("�����ٲ�");
//		System.out.println("������:" + f2.getDefB());

		// private --> ���� Ŭ���� �������� ���� ����
//		System.out.println(f2.priC); // error
//		System.out.println(f2.getPriC());

		// static --> Ŭ���� ������ ���α׷� ���� �� �����޸𸮿� �Ҵ�Ǳ� ������
		// ��ü ���� ���� �ٷ� ���� ����
//		System.out.println(FieldTest2.pubSta);

		// private static
//		System.out.println(FieldTest2.priSta());
//		FieldTest2.getPriSta();
//		FieldTest2.setPriSta("private 2");
//		System.out.println(FieldTest2.getPriSta());

//		FieldTest3 f3 = new FieldTest3();
//		System.out.println(f3.getNum());
//		System.out.println(FieldTest3.getStaticNum());

//		Stest01 st = new Stest01();
//		Stest02 st2 = new Stest02();
//		
//		st.method1();
//		st.method2(5);
//		st.method1();
//		st2.method2(10);				
//		st.method1();
//		st2.method2(10);
//		st.method1();
//		st.method2(5);
//		System.out.println("�� ���� ���� ������"+Stest01.i+"�� �Դϴ�.");

		Book bk1 = new Book();
		bk1.setTitle("���� ���� �ڹ� B");
		bk1.setAuthor("ȫ�浿");
		bk1.setPrice(30000);
		Book.setStock(Book.getStock() + 1);
		System.out.println(bk1.information());
		System.out.println("bk1�ǰ� : " + bk1);

		Book bk2 = new Book(); // new == heap ������ ������ ���� ����� ��.
		// ���� book������ ���� ���� ��
		bk2.setTitle("Java");
		bk2.setAuthor("ȫ�浿");
		bk2.setPrice(25000);
		Book.setStock(Book.getStock() + 20);
		System.out.println(bk2.information());
		System.out.println("bk2�ǰ� : " + bk2);
		
		Book.setStock(15);
		System.out.println(bk1.information());
		System.out.println(bk2.information());

	}

}
