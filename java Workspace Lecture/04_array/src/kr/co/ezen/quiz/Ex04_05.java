package kr.co.ezen.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 :");
		String[] strArr = new String[sc.nextInt()];
		sc.nextLine();

		boolean check = true;

		while (check) {
			for (int i = 0; i < strArr.length; i++) {
				System.out.print((i + 1) + "번째 문자열 :");
				strArr[i] = sc.nextLine();
			}

			System.out.print("더 값을 입력하시겠습니까?(Y/N) :");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			switch (ch) {
			case 'y':
			case 'Y':
				System.out.print("더 입력하고 싶은 개수 :");
				int add = sc.nextInt();
				sc.nextLine();
				strArr = new String[strArr.length + add];
				break;

			case 'n':
			case 'N':
				check = false;
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
			}

		}
		System.out.println(Arrays.toString(strArr));
		sc.close();

		// Y/y 선택시 strArr의 길이는 늘어나지만 다시 첫번째 인덱스부터 채워 넣게 됨..
	}

}
