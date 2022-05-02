package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[10];

		int count = 0;
		while (true) {
			System.out.print("�г�:");
			int grade = sc.nextInt();
			System.out.print("��:");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸�:");
			String name = sc.nextLine();
			System.out.print("��������:");
			int kor = sc.nextInt();
			System.out.print("��������:");
			int eng = sc.nextInt();
			System.out.print("��������:");
			int math = sc.nextInt();
			sc.nextLine();

			stu[count] = new Student(grade, classroom, name, kor, eng, math);
			count++;

			System.out.print("��� �߰��� �̴ϱ�?(y/n):");
			String str = sc.nextLine().toUpperCase();

			if (str.equals("N")) {
				break;
			}
		}

		// �� ������ ��
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += stu[i].getKor() + stu[i].getEng() + stu[i].getMath();
//
//		}

		for (Student s : stu) {
			if (s == null) {
				break;
			} else {
				int sum = s.getKor() + s.getEng() + s.getMath();
				System.out.println("���=" + sum / 3);

			}
		}

	}
}
