package kr.co.ezen.chap01.part02.PersonMVC.view;

import java.util.Scanner;

import kr.co.ezen.chap01.part02.PersonMVC.controller.PersonController;

public class PersonMenu {

	public void mainMenu() {
		Scanner sc = new Scanner(System.in);

		PersonController pc = new PersonController();

		while (true) {
			System.out.println("=====�޴�=====");
			System.out.println("1.ȸ�� �߰�");
			System.out.println("2.ȸ�� ��ü ��ȸ");
			System.out.println("3.��� ��� ��ȸ");
			System.out.println("4.ȸ�� �̸����� �˻�");
			System.out.println("5.���α׷� ����");
			System.out.println("�޴� ����:");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				pc.insertPerson();
				break;
			case 2:
				pc.printPerson();
				break;
			case 3:
				pc.avgWealth();
				break;
			case 4:
				pc.searchPerson();
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
			}

		}

	}

}
