package kr.co.ezen.chap01.part01_ObjectVsObjectArray.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {

		Book bk1 = new Book("자바의 정석", "홍길동", "나무", 10000);
		Book bk2 = new Book("룰의 정석", "고수", "숲", 20000);
		Book bk3 = new Book("축구의 정석", "이동중", "향기", 30000);

		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목");
		String searchTitle = sc.nextLine();

		if (bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1.information());
		} else if (bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2.information());
		} else if (bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3.information());
		}

		sc.close();
	}

}
