package kr.co.ezen.chap01.part02.PersonMVC.controller;

import java.util.Scanner;

import kr.co.ezen.chap01.part02.PersonMVC.model.vo.Person;

public class PersonController {

	private Person[] people = new Person[2];
	Scanner sc = new Scanner(System.in);

	public PersonController() {

	}

	// 회원 추가
	public void insertPerson() {
		for (int i = 0; i < people.length; i++) {
			System.out.println("==사원 정보 입력==");
			System.out.print("이름:");
			String name = sc.nextLine();
			System.out.print("나이:");
			int age = sc.nextInt();
			System.out.print("재산:");
			int wealth = sc.nextInt();
			sc.nextLine();

			people[i] = new Person(name, age, wealth);

		}
	}

	// 회원 전체 조회
	public void printPerson() {
//		for (int i = 0; i < people.length; i++) {
//			System.out.println("==" + i + "번 회원==");
//			System.out.println(people[i].informaiton());
//		}

		// 향상된 for문
		for (Person p : people) {
			System.out.println(p.informaiton());

		}
	}

	// 평균 재산 조회
	public void avgWealth() {
		int sum = 0;
		for (int i = 0; i < people.length; i++) {
			sum += people[i].getWealth();
		}
		System.out.println("평균 재산:" + sum / people.length);

	}

	public void searchPerson() {
		System.out.print("검색할 이름:");
		String searchName = sc.nextLine();

		for (int i = 0; i < people.length; i++) {
			if (people[i].getName().equals(searchName)) {
				System.out.println(people[i].informaiton());
				break;
			} else {
				if (i != people.length) {
					continue;
				}
			}
			System.out.println("검색된 회원이 없습니다.");
			break;
		}

	}
}