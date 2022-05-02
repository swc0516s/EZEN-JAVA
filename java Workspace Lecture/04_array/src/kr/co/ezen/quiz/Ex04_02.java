package kr.co.ezen.quiz;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		// 01이랑 같은결과,
		// 배열, for문이 들어가야 함.

		Scanner sc = new Scanner(System.in);
		int[] iArr = new int[4];
		int num;
		int hap = 0;
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(i + 1 + "번째 숫자를 입력하세요 : ");
			num = sc.nextInt();
			iArr[i] = num;

			hap += num;
		}
		System.out.println("합계 ==> " + hap);
		;

		sc.close();
	}

}
