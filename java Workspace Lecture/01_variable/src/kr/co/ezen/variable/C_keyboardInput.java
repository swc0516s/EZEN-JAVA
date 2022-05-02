package kr.co.ezen.variable;

import java.util.Scanner;

public class C_keyboardInput {
	// java.util 패키지에서 제공하는 클래스를 이용한 키보드 입력

	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 이름은 무엇입니까?");
		String name = sc.next(); // 문자열을 받긴하는데 공백을 미포함. 홍 길동 이라고 했더니 공백을 문자의 끝으로 인식해서 끝났음
//		String name = sc.nextLine(); // 공백 포함
		System.out.println("당신의 나이는 몇살입니까?");
		int age = sc.nextInt(); // 정수 nextInt
		System.out.println("당신의 키는 몇입니까?");
		double height = sc.nextDouble(); // 실수 nextDouble

//		System.out.println("이름 :" + name);
//		System.out.println("나이 :" + age);
//		System.out.println("키 :" + height);

		System.out.println("이름은: " + name + " 나이는: " + age + " 키는: " + height);

		sc.close();
	}

	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.nextLine();

		System.out.println("나이:");
		int age = sc.nextInt();

		sc.nextLine(); // 엔터키 처리

		System.out.println("주소:");
//		String address = sc.next();
		String address = sc.nextLine();

		System.out.println("키:");
		double height = sc.nextDouble();

		System.out.println(name + "님은 " + age + "세이며, 사는 곳은 " + address + "이고, 키는 " + height + "입니다.");

		sc.close();

	}

	public void inputScanner3() {
		String name;
		char gender;
		int age;
		double height;

		Scanner sc = new Scanner(System.in);

		System.out.println("이름:");
		name = sc.nextLine();

		System.out.println("성별(M/F):");
//		gender = sc.nextLine().;
		gender = sc.nextLine().charAt(0); // 읽어들인 값 중에서 제일 첫번째 값

		System.out.println("나이:");
		age = sc.nextInt();

		System.out.println("키:");
		height = sc.nextDouble();

		System.out.println(name + "님의 개인 정보");
		System.out.println("성별:" + gender);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);

		sc.close();

	}

}
