package kr.co.ezen.chap03_field.part01_kindsOfVariable.run;

import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Book;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {

//		FieldTest1 f1 = new FieldTest1();
//		f1.testMode(10);

//		// public --> 어디서든 접근 가능
//		FieldTest2 f2 = new FieldTest2();
//		System.out.println(f2.pubA);
//		System.out.println("변경전" + f2.getPubA());
//		// System.out.println(f2.setPubA("내가바꿈"));
//		f2.setPubA("dd");
//		System.out.println("변경후" + f2.getPubA());
//		System.out.println(f2.pubA);
//
//		// default --> 같은 패키지 내에서만 접근 가능
////		System.out.println(f2.defB); // error
//		System.out.println("변경전:" + f2.getDefB());
//		f2.setDefB("나도바꿈");
//		System.out.println("변경후:" + f2.getDefB());

		// private --> 같은 클래스 내에서만 접근 가능
//		System.out.println(f2.priC); // error
//		System.out.println(f2.getPriC());

		// static --> 클래스 변수는 프로그램 실행 시 정적메모리에 할당되기 때문에
		// 객체 생성 없이 바로 접근 가능
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
//		System.out.println("총 구매 가능 개수는"+Stest01.i+"개 입니다.");

		Book bk1 = new Book();
		bk1.setTitle("과정 평가형 자바 B");
		bk1.setAuthor("홍길동");
		bk1.setPrice(30000);
		Book.setStock(Book.getStock() + 1);
		System.out.println(bk1.information());
		System.out.println("bk1의값 : " + bk1);

		Book bk2 = new Book(); // new == heap 공간에 무조건 새로 만드는 것.
		// 같은 book이지만 새로 만든 것
		bk2.setTitle("Java");
		bk2.setAuthor("홍길동");
		bk2.setPrice(25000);
		Book.setStock(Book.getStock() + 20);
		System.out.println(bk2.information());
		System.out.println("bk2의값 : " + bk2);
		
		Book.setStock(15);
		System.out.println(bk1.information());
		System.out.println(bk2.information());

	}

}
