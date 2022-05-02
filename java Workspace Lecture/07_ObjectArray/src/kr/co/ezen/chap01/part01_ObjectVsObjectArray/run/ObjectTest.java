package kr.co.ezen.chap01.part01_ObjectVsObjectArray.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {

		Book bk1 = new Book("�ڹ��� ����", "ȫ�浿", "����", 10000);
		Book bk2 = new Book("���� ����", "���", "��", 20000);
		Book bk3 = new Book("�౸�� ����", "�̵���", "���", 30000);

		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� å ����");
		String searchTitle = sc.nextLine();

		if (bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1.information());
		} else if (bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2.information());
		} else if (bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3.information());
		}

		sc.close();
	}

}
