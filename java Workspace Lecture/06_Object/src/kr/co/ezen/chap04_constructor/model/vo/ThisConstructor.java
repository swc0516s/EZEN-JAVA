package kr.co.ezen.chap04_constructor.model.vo;

import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Book;

public class ThisConstructor {

	private String bookName;
	private int bookprice;
	private String bookpublisher;
	private int bookid;

	{ // ����� ���� ������ ��� �ʱ�ȭ��
		bookid = 10;
		bookpublisher = "ezen";
	}

	// �����ε� --> ���� �̸����� �Ű� ���� Ÿ�� ���� ��ġ�� �ٸ��� �ٸ� �޼���� �ν�
	public ThisConstructor() { // �⺻ ������
		System.out.println("�⺻ �������Դϴ�.");

	}

	public ThisConstructor(String bookName, int bookprice) {

	}

	public ThisConstructor(int bookprice, String bookName) {

	}

	public ThisConstructor(String bookpublisher) {
		this.bookpublisher = bookpublisher;
		System.out.println("�Ű� ���� �ϳ�");
	}

	public ThisConstructor(String bookName, int bookprice, int bookid) {
//		this();
		this("EZEN");
		this.bookName = bookName;
		this.bookprice = bookprice;
		this.bookid = bookid;
		// this : �ڱ� �ڽ� Ŭ����, �ٸ� ������ ȣ��
		
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
