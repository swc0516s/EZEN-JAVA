package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {
	Scanner sc = new Scanner(System.in);

	Employee emp; // ���� ���ڴ�.

	public EmpMenu() {

	}

	public void mainMenu() {

		System.out.println("1.�� ��� ���� �Է�");
		System.out.println("2.��� ���� ����");
		System.out.println("3.��� ���� ����");
		System.out.println("4.��� ���� ���");
		System.out.println("5.���α׷� ����");
		System.out.print("�޴� ��ȣ ����>>");

		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			emp = inputEmployee();
			mainMenu();
			break;
		case 2:
			modifyEmployee(); // ���� �� ������ ȣ�⸸
			mainMenu();
			break;
		case 3:
			emp = null;
			System.gc();
			mainMenu();
			break;
		case 4:
			String info = emp.information();
			System.out.println(info);
			mainMenu();
		case 5:
			System.exit(0);
		}

	}

	public Employee inputEmployee() { // emp�� Ÿ���� Employee.
		System.out.print("������� �Է��ϼ��� ");
		String name = sc.nextLine();
//		sc.nextLine();

		System.out.print("�μ����� �Է��ϼ���");
		String dept = sc.nextLine();
//		sc.nextLine();

		System.out.print("������ �Է��ϼ���");
		String job = sc.nextLine();

		System.out.print("���̸� �Է��ϼ���");
		int age = sc.nextInt();

		System.out.print("������ �Է��ϼ���");
		char gender = sc.next().charAt(0);

		System.out.print("�޿��� �Է��ϼ���");
		int salary = sc.nextInt();

		System.out.print("���ʽ� ����Ʈ�� �Է��ϼ���");
		double bonusPoint = sc.nextDouble();
		sc.nextLine(); // �ڿ� ��Ʈ�� Ÿ���� ���� ����Ű ó���� ����

		System.out.print("��ȭ��ȣ�� �Է��ϼ���");
		String phone = sc.nextLine();
//		sc.nextLine();

		System.out.print("�ּҸ� �Է��ϼ���");
		String address = sc.nextLine();
//		sc.nextLine();

		// ��ü����� ���Ͻ�Ű��
		Employee emp = new Employee(name, dept, job, age, gender, salary, bonusPoint, phone, address);
		return emp;
	}

	public void modifyEmployee() {
		System.out.println("��� ���� ����");
		System.out.println("1.�̸� ����");
		System.out.println("2.�޿� ����");
		System.out.println("3.�μ� ����");
		System.out.println("4.���� ����");
		System.out.println("5.���� �޴���");

		System.out.print("������ ��ȣ�� �����ϼ���");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.print("������ �̸��� �Է��ϼ���");
			sc.nextLine();
			String name = sc.nextLine();
			emp.setEmpName(name);
			System.out.println("�ԷµǾ����ϴ�.");
			break;
		case 2:
			System.out.print("������ �޿��� �Է��ϼ���");
			int salary = sc.nextInt();
			emp.setSalary(salary);
			System.out.println("�ԷµǾ����ϴ�.");
			break;
		case 3:
			System.out.print("������ �μ��� �Է��ϼ���");
			sc.nextLine();
			String dept = sc.nextLine();
			emp.setDept(dept);
			System.out.println("�ԷµǾ����ϴ�.");
			break;
		case 4:
			System.out.print("������ ������ �Է��ϼ���");
			sc.nextLine();
			String job = sc.nextLine();
			emp.setJob(job);
			System.out.println("�ԷµǾ����ϴ�.");
			break;
		case 5:
			modifyEmployee();
			mainMenu();
			break;
		}
	}

}

//���Ŭ�����ϰ�, �޴�, �ΰ��� Ŭ���� ���� ��ȣ�ۿ�