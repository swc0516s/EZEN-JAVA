package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice2 {

	public void inputScannerPractice2() {
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수 :");
		num1 = sc.nextInt();
		System.out.println("두번째 정수 :");
		num2 = sc.nextInt();
		
		sc.close();

		// '+, -, *, /'

		System.out.println("");
		System.out.println("더하기 결과는 \"" + (num1 + num2) + "\" 입니다.");
		System.out.println("빼기 결과는 \"" + (num1 - num2) + "\" 입니다.");
		System.out.println("곱하기 결과는 \"" + (num1 * num2) + "\" 입니다.");
		System.out.println("나누기 결과는 \"" + ((float) num1 / num2) + "\" 입니다."); //정수와 정수 ==> 정수
//		System.out.println("나누기 결과는 " + (num1 / num2) + " 입니다.");

	}
}
