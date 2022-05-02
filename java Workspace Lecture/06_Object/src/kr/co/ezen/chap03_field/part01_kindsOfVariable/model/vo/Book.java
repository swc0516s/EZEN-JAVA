package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class Book {
	private String title; // field
	private String author;
	private int price;

	public static final String PUBLISHER = "EZEN 아카데미";
	private static int stock = 10; // class variable

	public Book() { // 생성자

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getStock() {
		return stock;
	}

	public static void setStock(int stock) {
		Book.stock = stock;
	}

	public static String getPublisher() {
		return PUBLISHER;
	}

	public String information() {
		//@formatter:off
		return "Book [title= "+title
				+", author= "+author
				+", price= "+price
				+", stock= "+stock
				+"]";
		//@formatter:on

	}

}
