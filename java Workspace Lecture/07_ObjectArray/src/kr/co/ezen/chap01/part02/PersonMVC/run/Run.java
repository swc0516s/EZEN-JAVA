package kr.co.ezen.chap01.part02.PersonMVC.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part02.PersonMVC.view.PersonMenu;

public class Run {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		PersonController pc = new PersonController();
//
//		while (true) {
//			System.out.println("=====�޴�=====");
//			System.out.println("1.ȸ�� �߰�");
//			System.out.println("2.ȸ�� ��ü ��ȸ");
//			System.out.println("3.��� ��� ��ȸ");
//			System.out.println("4.ȸ�� �̸����� �˻�");
//			System.out.println("5.���α׷� ����");
//			System.out.println("�޴� ����:");
//			int menu = sc.nextInt();
//
//			switch (menu) {
//			case 1:
//				pc.insertPerson();
//				break;
//			case 2:
//				pc.printPerson();
//				break;
//			case 3:
//				pc.avgWealth();
//				break;
//			case 4:
//				pc.searchPerson();
//				break;
//			case 5:
//				System.out.println("���α׷��� �����մϴ�.");
//				return;
//			default:
//				System.out.println("�ٽ� �Է����ּ���.");
//			}
//
//		}

		
		
//		PersonMenu pm = new PersonMenu();
//		pm.mainMenu();

		new PersonMenu().mainMenu(); // �̷��� �ص� �ȴ�~
	}

}
