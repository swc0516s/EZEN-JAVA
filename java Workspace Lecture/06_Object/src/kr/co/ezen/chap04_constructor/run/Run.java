package kr.co.ezen.chap04_constructor.run;

import kr.co.ezen.chap04_constructor.model.vo.ThisConstructor;

public class Run {
	
	// �޼���(method)(�Լ�)
	// Ư¡ 1. ȣ�� (call)
	//	2. ��ȯ��

	// �޼��尡 �ٸ� �޼��带 ȣ���� �� �ִ�.
	
	public static void main(String[] args) {

		ThisConstructor ts = new ThisConstructor();
		System.out.println(ts);

		ThisConstructor ts1 = new ThisConstructor("Java in head", 400000, 1);
		System.out.println(ts1.getBookName() + "|"
				+ts1.getBookprice()+"|"
				+ts1.getBookid()+"|"
				+ts1.getBookpublisher()
				); 

	}

}
