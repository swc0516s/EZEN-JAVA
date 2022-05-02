package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class B_While {

	public void method1() {
		// 1부터 5까지 출력
		int i = 1;

		while (i <= 5) { // ~동안
			System.out.println(i + "번째 반복문 수행");
			i++;
		}
		System.out.println();
	}

	public void method2() {
		// 5부터 1까지 출력
		int i = 5;

		while (i >= 1) {
			System.out.println(i + "번째 반복문 수행");
			i--;
		}
	}

	public void method3() {
		// 1부터 10사이의 홀수만 출력
		int i = 1;

		while (i <= 10) {
			System.out.println(i + "번째 반복문 수행");
			i += 2;
		}
//		while (i <= 10) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//			i++;
//		}

	}

	public void method4() {
		// 정수를 하나 입력받아 그 수가 1~9사이의 수일때만 그 수의
		// 구구단 출력
		// 조건이 맞지 않으면
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 하나 입력해주세요.");
		int dan = sc.nextInt();

		if (dan >= 1 && dan <= 9) {
			int i = 1;

			while (i < 10) {

//				System.out.println(dan + "*" + i + "=" + dan * i);
				System.out.printf("%d*%d=%d\n", dan, i, (dan * i));
				i++;
			}
		} else {
			System.out.println("1~9사이의 양수를 입력해야 합니다.");
		}

		sc.close();
	}

	public void method5() {
		// 1부터 10사이의 임의의 난수를 정해
		// 1부터 난수까지의 정수 합계
		int random = (int) (Math.random() * 10 + 1);

		System.out.println(random);
		int sum = 0;
		int i = 0;

		while (i <= random) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 정수 합계 : %d", random, sum);

	}

	public void method6() {
		// 정수부터 정수까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.print("첫 번째 정수 : "); // 6 //2
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수 : "); // 2 //6
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		int i = min;
		while (i <= max) {
//			sum += min++;
			sum += i;
			i++;
		}

//		if (num1 > num2) {
//			num1 = min;
//			num2 = max;
//			}
//		while (num1 <= num2) {
//			sum += num1;
//			num1++;
//
//		}
		System.out.printf("%d부터 %d까지의 정수 합계 : %d", min, max, sum);
		sc.close();

	}

	public void method7() {
		int dan = 2;
		while (dan <= 9) {
			System.out.printf("%d단\n", dan);
			int i = 1;
			while (i <= 9) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
				i++;
			}
			dan++;
			System.out.println("");
		}
	}

	public void method8() {
		int hour = 0;
		while (hour < 24) {
			int min = 0;
			while (min < 60) {
				System.out.printf("%2d시 %d분\n", hour, min);
				min++;
			}
			hour++;
			System.out.println();
		}
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수: ");
		int row = sc.nextInt();

//		for (int r = 1; r <= row; r++) {
//			for (int c = 1; c <= 5; c++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		} 

		// 위 for문을 while문으로 변환

		int r = 1;
		while (r <= row) {
			int c = 1;
			while (c <= 5) {
				System.out.print('*');
				c++;
			}
			r++;
			System.out.println();
		}
		sc.close();

	}

	public void method10() {

		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수: ");
		int row = sc.nextInt();
		System.out.print("칸 수: ");
		int col = sc.nextInt();

		int r = 1;
		while (r <= row) {
			int c = 1;
			while (c <= col) {
				if (r == c) {
					System.out.print(r);
				} else {
					System.out.print("*");
				}
				c++;
			}
			r++;
			System.out.println("");

		}
		sc.close();

	}

	public void method11() {
		// 문자열을 입력받아 인덱스별로 문자출력
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력:");
		String str = sc.next();
		// String str=sc.nextLine();
		System.out.println("문자열의 길이 str=" + str.length());
//		System.out.println("str="+str);

		int index = 0;

		while (index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + ":" + ch);

			index++;
		}

		sc.close();
	}

	public void method12() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10사이의 홀수 출력");
			System.out.println("4. 종료");
			System.out.print("메뉴 선택:");

			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 4:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			break;

		} // end while

		sc.close();

	}
}
