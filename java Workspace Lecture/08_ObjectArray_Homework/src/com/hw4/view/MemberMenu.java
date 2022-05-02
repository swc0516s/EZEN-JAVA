package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("======ȸ�� ���� �޴�======");
			System.out.println("1.�ű� ȸ�� ���");
			System.out.println("2.ȸ�� ���� �˻�");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� ���� ���");
			System.out.println("6.ȸ�� ���� ����");
			System.out.println("7.���α׷� ����");
			System.out.print("�޴� ����:");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 7:
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				break;
			}
		}
	}

	public void insertMember() {
		if (mc.getMemberCount() >= MemberController.SIZE) {
			System.out.println("ȸ�� ���� �ʰ��߽��ϴ�.");
			return;
		}
		System.out.println("���̵�:");
		String userId = sc.nextLine();

		Member m = mc.checkId(userId);

		if (m != null) {
			System.out.println("������ ���̵� �����մϴ�. ȸ�� ��� ����");
		} else {
			System.out.print("��й�ȣ:");
			String userPwd = sc.nextLine();
			System.out.print("�̸�:");
			String name = sc.nextLine();
			System.out.print("����:");
			int age = sc.nextInt();
			System.out.print("����:");
			char gender = sc.next().charAt(0);
			System.out.print("�̸���:");
			String email = sc.nextLine();
			sc.nextLine();
			//

			mc.insertMember(new Member(userId, userPwd, name, age, gender, email));
			System.out.println("���������� ȸ������� �Ǿ����ϴ�.");
		}
	}

	public void searchMember() {
		while (true) {
			System.out.println("======ȸ�� ���� �˻�======");
			System.out.println("1.���̵�� �˻��ϱ�");
			System.out.println("2.�̸����� �˻��ϱ�");
			System.out.println("3.�̸��Ϸ� �˻��ϱ�");
			System.out.println("4.���� �޴���");

			System.out.print("�޴� ����:");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 4) {
				System.out.println("���� �޴��� ���� ���ϴ�.");
				return;
			}

			System.out.print("�˻� ����:");
			String search = sc.nextLine();

			Member searchMember = mc.searchMember(menu, search);

			if (searchMember != null) {
				System.out.println("======�˻����======");
				System.out.println(searchMember.information());
			} else {
				System.out.println("�˻� ����� �����ϴ�.");

			}

		}
	}

	public void updateMember() {
		while (true) {
			System.out.println("======ȸ�� ���� ����======");
			System.out.println("1.��й�ȣ ����");
			System.out.println("2.�̸� ����");
			System.out.println("3.�̸��� ����");
			System.out.println("4.���� �޴���");

			System.out.print("�޴� ����:");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 4) {
				System.out.println("���� �޴��� ���� ���ϴ�.");
				return;
			}

			System.out.print("������ ȸ�� ���̵�:");
			String userId = sc.nextLine();

			Member m = mc.checkId(userId);

			if (m != null) {
				System.out.println("���� ����:" + m.information());
				System.out.println("���� ����");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);

				System.out.println("ȸ�� ������ ����Ǿ����ϴ�.");
			} else {
				System.out.println("������ ȸ���� ���� ������ �������� �ʽ��ϴ�.");

			}

		}

	}

	public void deleteMember() {
		System.out.println("������ ȸ�� ���̵�:");
		String userId = sc.nextLine();

		Member m = mc.checkId(userId);

		if (m != null) {
			System.out.println("���� ����:" + m.information());
			System.out.print("���� �����Ͻðڽ��ϱ�?(y/n)");
			char ch = sc.nextLine().toUpperCase().charAt(0);

			if (ch == 'Y') {
				mc.deleteMember(userId);
			} else {
				System.out.println("������ ȸ���� ���� ������ �������� �ʽ��ϴ�.");
			}
		}
	}

	public void printAllMember() {
		Member[] mem = mc.getMem();

		for (int i = 0; i < mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());

		}

	}

	public void sortMember() {
		while (true) {
			System.out.println("======ȸ�� ���� ����======");
			System.out.println("1. ���̵� ���� ���� ����");
			System.out.println("2. ���̵� ���� ���� ����");
			System.out.println("3. ���� ���� ���� ����");
			System.out.println("4. ���� ���� ���� ����");
			System.out.println("5. ���� ���� ���� ����(���� ��)");
			System.out.println("6. ���� �޴���");

			System.out.print("�޴� ����:");
			int menu = sc.nextInt();

			if (menu == 6) {
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			}

			Member[] sortMem = null;

			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");

			}

			System.out.println("======���� ���======");
			for (int i = 0; i < sortMem.length; i++) {
				System.out.println(sortMem[i].information());
			}

		}

	}
}
