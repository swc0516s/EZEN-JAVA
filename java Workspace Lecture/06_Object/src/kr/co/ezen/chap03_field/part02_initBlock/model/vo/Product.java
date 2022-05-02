package kr.co.ezen.chap03_field.part02_initBlock.model.vo;

public class Product {
	// 2. ����� �ʱ�ȭ ��
	private String pName = "�Ƶ�ٽ�";
	private int price = 100000;
	private static String brand = "����Ű";
	private int createYear; // 1. default �� 

	// 4. �ν��Ͻ� �ʱ�ȭ �� --> ��ü ������ ���� ����
	{
		pName = "Ű����";
		price = 90000;
		brand = "EZEN";
		createYear = 2022;
	}

	// 3. static �ʱ�ȭ ��
	static {
//		pName = "�����";
//		price = 1000000;
		brand = "���";
	}

	// 5. �Ű� ���� ������
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
// Product pd = new Product(); // ȣ���ϸ� ������ �⺻������ ȣ�� 
// �����ڰ� �̹� �����Ѵٸ� �⺻ �����ڸ� �̸� ��������� ���� .
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
