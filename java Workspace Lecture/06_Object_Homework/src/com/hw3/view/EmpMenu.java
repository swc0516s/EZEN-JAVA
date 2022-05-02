package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {
	Scanner sc = new Scanner(System.in);

	Employee emp; // 갖다 쓰겠다.

	public EmpMenu() {

	}

	public void mainMenu() {

		System.out.println("1.새 사원 정보 입력");
		System.out.println("2.사원 정보 수정");
		System.out.println("3.사원 정보 삭제");
		System.out.println("4.사원 정보 출력");
		System.out.println("5.프로그램 종료");
		System.out.print("메뉴 번호 선택>>");

		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			emp = inputEmployee();
			mainMenu();
			break;
		case 2:
			modifyEmployee(); // 받을 게 없으니 호출만
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

	public Employee inputEmployee() { // emp의 타입이 Employee.
		System.out.print("사원명을 입력하세요 ");
		String name = sc.nextLine();
//		sc.nextLine();

		System.out.print("부서명을 입력하세요");
		String dept = sc.nextLine();
//		sc.nextLine();

		System.out.print("직급을 입력하세요");
		String job = sc.nextLine();

		System.out.print("나이를 입력하세요");
		int age = sc.nextInt();

		System.out.print("성별을 입력하세요");
		char gender = sc.next().charAt(0);

		System.out.print("급여를 입력하세요");
		int salary = sc.nextInt();

		System.out.print("보너스 포인트를 입력하세요");
		double bonusPoint = sc.nextDouble();
		sc.nextLine(); // 뒤에 스트링 타입이 오면 엔터키 처리를 위해

		System.out.print("전화번호를 입력하세요");
		String phone = sc.nextLine();
//		sc.nextLine();

		System.out.print("주소를 입력하세요");
		String address = sc.nextLine();
//		sc.nextLine();

		// 객체만들고 리턴시키기
		Employee emp = new Employee(name, dept, job, age, gender, salary, bonusPoint, phone, address);
		return emp;
	}

	public void modifyEmployee() {
		System.out.println("사원 정보 수정");
		System.out.println("1.이름 변경");
		System.out.println("2.급여 변경");
		System.out.println("3.부서 변경");
		System.out.println("4.직급 변경");
		System.out.println("5.이전 메뉴로");

		System.out.print("수정할 번호를 선택하세요");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.print("변경할 이름을 입력하세요");
			sc.nextLine();
			String name = sc.nextLine();
			emp.setEmpName(name);
			System.out.println("입력되었습니다.");
			break;
		case 2:
			System.out.print("변경할 급여를 입력하세요");
			int salary = sc.nextInt();
			emp.setSalary(salary);
			System.out.println("입력되었습니다.");
			break;
		case 3:
			System.out.print("변경할 부서를 입력하세요");
			sc.nextLine();
			String dept = sc.nextLine();
			emp.setDept(dept);
			System.out.println("입력되었습니다.");
			break;
		case 4:
			System.out.print("변경할 직급을 입력하세요");
			sc.nextLine();
			String job = sc.nextLine();
			emp.setJob(job);
			System.out.println("입력되었습니다.");
			break;
		case 5:
			modifyEmployee();
			mainMenu();
			break;
		}
	}

}

//사원클래스하고, 메뉴, 두개의 클래스 간의 상호작용