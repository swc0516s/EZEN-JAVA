package kr.co.ezen.chap04_constructor.model.vo;

import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Book;

public class ThisConstructor {

	private String bookName;
	private int bookprice;
	private String bookpublisher;
	private int bookid;

	{ // 만들어 질때 무조건 얘로 초기화됨
		bookid = 10;
		bookpublisher = "ezen";
	}

	// 오버로딩 --> 같은 이름으로 매개 변수 타입 개수 위치가 다르면 다른 메서드로 인식
	public ThisConstructor() { // 기본 생성자
		System.out.println("기본 생성자입니다.");

	}

	public ThisConstructor(String bookName, int bookprice) {

	}

	public ThisConstructor(int bookprice, String bookName) {

	}

	public ThisConstructor(String bookpublisher) {
		this.bookpublisher = bookpublisher;
		System.out.println("매개 변수 하나");
	}

	public ThisConstructor(String bookName, int bookprice, int bookid) {
//		this();
		this("EZEN");
		this.bookName = bookName;
		this.bookprice = bookprice;
		this.bookid = bookid;
		// this : 자기 자신 클래스, 다른 생성자 호출
		
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookpublisher() {
		return bookpublisher;
	}

	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

}
