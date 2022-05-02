package kr.co.ezen.chap03.branch;

import java.util.Scanner;

public class A_break {
	// break문은 가장 가까운 반복문을 나감

	public void method1() { // 0~5숫자합 구하고 반복문 빠지기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요."); // 5
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 0;; i++) { // 무한
			sum += i;
			if (i == num) {
				break;
			}
		}

		System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
		sc.close();
	}

}
