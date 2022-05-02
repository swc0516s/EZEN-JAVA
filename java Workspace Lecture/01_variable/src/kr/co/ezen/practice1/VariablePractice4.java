package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice4 {

	public void inputScannerPractice4() {
		String str;
		char name1, name2, name3;

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		str = sc.nextLine(); // abcde

		name1 = str.charAt(0); // str의 첫번째 글자를 받아옴. 0부터 시작
		name2 = str.charAt(1);
		name3 = str.charAt(2);

		System.out.println("첫번째 문자: " + name1);
		System.out.println("두번째 문자: " + name2);
		System.out.println("세번째 문자: " + name3);

		sc.close();
	}

}
