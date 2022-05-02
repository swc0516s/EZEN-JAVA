package kr.co.ezen.chap03_field.part02_initBlock.model.vo;

public class Product {
	// 2. 명시적 초기화 블럭
	private String pName = "아디다스";
	private int price = 100000;
	private static String brand = "나이키";
	private int createYear; // 1. default 값 

	// 4. 인스턴스 초기화 블럭 --> 객체 생성시 마다 적용
	{
		pName = "키보드";
		price = 90000;
		brand = "EZEN";
		createYear = 2022;
	}

	// 3. static 초기화 블럭
	static {
//		pName = "모니터";
//		price = 1000000;
		brand = "삼송";
	}

	// 5. 매개 변수 생성자
	public Product(String pName, int price) {
		this.pName = pName;
		this.price = price;

	}

	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		Product.brand = brand;

	}

	public Product() {

	}
// Product pd = new Product(); // 호출하면 무조건 기본생성자 호출 
// 생성자가 이미 존재한다면 기본 생성자를 미리 만들어주지 않음 .
// Product pd = new Product("aaa",1000);

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Product.brand = brand;
	}

	public int getCreateYear() {
		return createYear;
	}

	public void setCreateYear(int createYear) {
		this.createYear = createYear;
	}

	public String information() {
		//@formatter:off
		return "[Product pName= "+pName+
				", price= "+price+
				", brand= "+brand+
				", createYear= "+createYear
				+"]";
		//@formatter:on

	}

}
