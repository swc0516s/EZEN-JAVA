package kr.co.ezen.chap03_field.part02_initBlock.run;

import kr.co.ezen.chap03_field.part02_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.information());

		Product p2 = new Product("아메리카노", 2500, "7그램");
		System.out.println(p2.information());
		
		Product p3 = new Product("핫아메리카노", 2000);
		System.out.println(p3.information());
		
		Product p4 = new Product("aaa",12);
		System.out.println(p4.information());
		
		
		// 초기화블럭이 제일 먼저 작동, 
	}

}
