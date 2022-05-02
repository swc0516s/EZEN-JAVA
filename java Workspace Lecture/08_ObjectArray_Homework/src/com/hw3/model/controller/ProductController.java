package com.hw3.model.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro = null;

	public static int count = 0; // static�̱⶧���� ����

	Scanner sc = new Scanner(System.in);

	{
		pro = new Product[10];
	}

	public void mainMenu() {
		int menu = 0;

		do {
			System.out.println("=====��ǰ ���� �޴�=====");
			System.out.println("1. ��ǰ ���� �߰�");
			System.out.println("2. ��ǰ ��ü ��ȸ");
			System.out.println("3. ���α׷� ����");
			System.out.println("4. ��ǰ ���� �߰�");
			System.out.print("�޴� ����:");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				productInput();
				break;
			case 2:
				productPrint();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				break;
			}

		} while (menu != 3);

	}

	public void productInput() {
		System.out.print("��ǰ ��ȣ:");
		int pId = sc.nextInt();
		sc.nextLine();
		System.out.print("��ǰ �̸�:");
		String pName = sc.nextLine();
		System.out.print("��ǰ ����:");
		int price = sc.nextInt();
		System.out.print("��ǰ ����:");
		double tax = sc.nextDouble();

		pro[count] = new Product(pId, pName, price, tax);
//		count++; // �̰͵� ����

	}

	public void productPrint() {
		for (int i = 0; i < count; i++) {
			System.out.println(pro[i].information());
		}
	}
}
