package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {

//		Product arr = new Product();

		Product[] arr = new Product[3];
		arr[0] = new Product("ssgnote9", "������ ��Ʈ9", "��⵵ ����", 960000, 10.0);
		arr[1] = new Product("lgxnote5", "LG ����Ʈ ��5", "��⵵ ����", 780000, 0.7);
		arr[2] = new Product("ktsnote3", "KT����Ʈ��", "����� ����", 250000, 0.3);

		int price;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}

		System.out.println("====================================");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getProductId() + "     " + arr[i].getProductName() + "     "
					+ arr[i].getProductArea() + "     " + arr[i].getPrice() + "     " + arr[i].getTax());
		}
		System.out.println("====================================");

		// price :1200000 tax :0.05
		for (int i = 0; i < arr.length; i++) {
			arr[i].setPrice(1200000);
			arr[i].setTax(0.05);

			System.out.println(arr[i].getProductId() + "     " + arr[i].getProductName() + "     "
					+ arr[i].getProductArea() + "     " + arr[i].getPrice() + "     " + arr[i].getTax());
		}
		System.out.println("====================================");

		for (int i = 0; i < arr.length; i++) {
			price = arr[i].getPrice() + (int) (arr[i].getPrice() * arr[i].getTax());
			arr[i].setPrice(price);
			System.out.println("��ǰ��=" + arr[i].getProductName());
			System.out.println("�ΰ��� ���� ����=" + arr[i].getPrice());
		}

	}

}
