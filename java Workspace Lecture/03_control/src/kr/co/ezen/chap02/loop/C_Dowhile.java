package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class C_Dowhile { // 조건과 상관없이 먼저실행 나중비교

	public void method1() {
		// 키보드로부터 영어 문자열값을 입력받아 출력 반복 실행
		Scanner sc = new Scanner(System.in);
		String str = null;

		do {
			System.out.print("문자열 입력:");
			str = sc.next();
			System.out.println("str:" + str);
		} while (!str.equals("exit")); // == str값이 exit가 아닌 동안 무한반복

		sc.close();
	}

	public void method2() {
		// 키보드로부터 영어 문자열값을 입력받아 출력 반복 실행
		Scanner sc = new Scanner(System.in);
		String str = null;
		do {
			System.out.println("문자열 입력:");
			str = sc.next();
			System.out.println("str:" + str);
			if (str.equals("exit")) {
				break;
			}
		} while (true);

		sc.close();

	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. 테스트1");
			System.out.println("2. 테스트2");
			System.out.println("3. 테스트3");
			System.out.println("4. 종료");
			System.out.print("메뉴 선택:");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("종료합니다.");
				return; // 메서드를 종료함
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			break;
		} while (true);

		sc.close();

	}
}
