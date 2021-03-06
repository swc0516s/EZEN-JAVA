package kr.co.ezen.chap01.part01_ObjectVsObjectArray.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[3];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

//		Book[] bk = new Book[3];

//		bk[0] = new Book("자바의 정석", "홍길동", "나무", 10000);
//		bk[1] = new Book("룰의 정석", "고수", "숲", 20000);
//		bk[2] = new Book("축구의 정석", "이동중", "향기", 30000);

		//@formatter:off
		Book[] bk = { 
				new Book("자바의 정석", "홍길동", "나무", 10000), 
				new Book("룰의 정석", "고수", "숲", 20000),
				new Book("축구의 정석", "이동중", "향기", 30000)
				};
		//@formatter:on

		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getPrice());

		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 책 제목");
		String searchTitle = sc.nextLine();

		for (int i = 0; i < bk.length; i++) {
			if (bk[i].getTitle().equals(searchTitle)) {
				System.out.println(bk[i].information());

			}
		}

		// 도서 검색 만들기

		sc.close();
	}

}
