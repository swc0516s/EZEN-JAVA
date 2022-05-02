package kr.co.ezen.practice.chap02;

import java.util.Scanner;

public class LoofPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력해주세요");
		int userNum = sc.nextInt();

		if (userNum >= 1) {
			for (int i = 1; i <= userNum; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요:");
		}
		sc.close();
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력해주세요");
			int userNum = sc.nextInt();

			if (userNum >= 1) {
				for (int i = 1; i <= userNum; i++) {
					System.out.print(i + " ");

				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력하세요:");

			}
		} // end while
		sc.close();
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력해주세요");
		int userNum = sc.nextInt();

		if (userNum >= 1) {

			for (int i = userNum; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요:");

		}
		sc.close();

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력해주세요");
			int userNum = sc.nextInt();

			if (userNum >= 1) {
				for (int i = userNum; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력하세요:");

			}
		} // while end
		sc.close();

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력하세요:");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i != num) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=" + sum);
			}
		}

	}
}
