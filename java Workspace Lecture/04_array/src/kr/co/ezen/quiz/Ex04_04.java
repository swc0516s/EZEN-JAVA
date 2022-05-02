package kr.co.ezen.quiz;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		// 배열의 length필드 이용하여 배열 크기만큼 키보드에서
		// 정수를 입력받고 평균을 구하는 프로그램을 작성하세요.
		// 10
		// 20
		// 30
		// 40
		// 50
		// 배열 원소의 평균은 30.0입니다.

		Scanner sc = new Scanner(System.in);

		int[] iArr = new int[5];
		int sum = 0;

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}

		double avg = (sum / iArr.length);

		System.out.println("배열 원소의 평균은 " + avg + "입니다.");
		sc.close();

	}

}
