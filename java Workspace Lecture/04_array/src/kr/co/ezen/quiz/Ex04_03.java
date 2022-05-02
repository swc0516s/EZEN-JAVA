package kr.co.ezen.quiz;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(" 배열의 최대값 =>> " + max);

		sc.close();

	}

}
