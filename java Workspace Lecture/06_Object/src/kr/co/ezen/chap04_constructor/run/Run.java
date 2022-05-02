package kr.co.ezen.chap04_constructor.run;

import kr.co.ezen.chap04_constructor.model.vo.ThisConstructor;

public class Run {
	
	// 메서드(method)(함수)
	// 특징 1. 호출 (call)
	//	2. 반환값

	// 메서드가 다른 메서드를 호출할 수 있다.
	
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
