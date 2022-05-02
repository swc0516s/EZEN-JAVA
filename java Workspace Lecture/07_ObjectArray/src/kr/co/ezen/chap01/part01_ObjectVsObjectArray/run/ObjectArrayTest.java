package kr.co.ezen.chap01.part01_ObjectVsObjectArray.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[3];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

//		Book[] bk = new Book[3];

//		bk[0] = new Book("�ڹ��� ����", "ȫ�浿", "����", 10000);
//		bk[1] = new Book("���� ����", "���", "��", 20000);
//		bk[2] = new Book("�౸�� ����", "�̵���", "���", 30000);

		//@formatter:off
		Book[] bk = { 
				new Book("�ڹ��� ����", "ȫ�浿", "����", 10000), 
				new Book("���� ����", "���", "��", 20000),
				new Book("�౸�� ����", "�̵���", "���", 30000)
				};
		//@formatter:on

		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getPrice());

		Scanner sc = new Scanner(System.in);

		System.out.println("�˻��� å ����");
		String searchTitle = sc.nextLine();

		for (int i = 0; i < bk.length; i++) {
			if (bk[i].getTitle().equals(searchTitle)) {
				System.out.println(bk[i].information());

			}
		}

		// ���� �˻� �����

		sc.close();
	}

}
