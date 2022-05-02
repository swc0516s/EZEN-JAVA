package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {

		Book bo1 = new Book();
		Book bo2 = new Book("자바의 구조", 20000, 0.2, "이순신");

		int sp1, sp2;

		System.out.println(bo1.information());
		System.out.println(bo2.information());

		System.out.println("======================================");

		bo1.setTitle("C언어");
		bo1.setPrice(30000);
		bo1.setDiscountRate(0.1);
		bo1.setAuthor("홍길동");

		System.out.println("======================================");
		System.out.println("수정된 결과 확인");
		System.out.println(bo1.information());
		System.out.println("======================================");

//		sp1 = bo1.getPrice() - (int) (bo1.getPrice() * bo1.getDiscountRate());
//		sp2 = bo2.getPrice() - (int) (bo2.getPrice() * bo2.getDiscountRate());
//
//		bo1.setPrice(sp1);
//		bo2.setPrice(sp2);
//
//		System.out.println("도서명=" + bo1.getTitle());
//		System.out.println("할인된 가격=" + bo1.getPrice());
//		System.out.println("도서명=" + bo2.getTitle());
//		System.out.println("할인된 가격=" + bo2.getPrice());

		
		sp1 =(int) (bo1.getPrice() * bo1.getDiscountRate());
		sp2 =(int) (bo2.getPrice() * bo2.getDiscountRate());

		System.out.println("도서명=" + bo1.getTitle());
		System.out.println("할인된 가격=" + (bo1.getPrice()-sp1)+"원");
		System.out.println("도서명=" + bo2.getTitle());
		System.out.println("할인된 가격=" + (bo2.getPrice()-sp2)+"원");

	}
}
