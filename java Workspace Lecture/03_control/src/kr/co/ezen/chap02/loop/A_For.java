package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(초기식; 조건식; 증감식){
	// 실행할 문장;
	// }
	public void method1() {

		for (int i = 1; i <= 5; i++) { // 조건이 참이면 false될때까지 증감식 실행
			// 초기값은 한번 실행, 그 후 조건식, 증감식 뺑뺑이
			System.out.println(i + "번째 반복문 실행");
		}
	}

	public void method2() {
		// 초기값 5, i가 1보다 크거나 같을 동안 --
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "번째 반복문 실행");
		}
	}

	public void method3() {
		// 1부터 10사이의 홀수만 출력

//		for (int i = 1; i <=10; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}

		for (int i = 1; i <= 10; i += 2) { // i = i+2
			System.out.println(i);
		}

	}

	public void method4() {
		// 정수를 하나 입력받아 그 수가 1~9사이의 구일 때만
		// 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9 사이의 양수를 입력해주세요"

		Scanner sc = new Scanner(System.in);
		System.out.println("1~9 사이의 수를 입력해주세요.");
		int dan = sc.nextInt();

//		if (dan >= 1 && dan <= 9) {
//			for (int num = 1; num <= 9; num++) {
//				System.out.println(dan * num);
//			}
//		} else {
//			System.out.println("1~9 사이의 양수를 입력해야 합니다.");
//		}

		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력해야 합니다.");
		}

		sc.close();
	}

	public void method5() {
		// 1부터 10사이의 임의의 난수를 발생
		// 1부터 난수(실수로 나옴 0.3 , 0.2) 까지의 정수 합계
		// ex) 7 = 1+2+3+4+5+6+7
		// 0<= Math.random < 1 // 0.0 ~ 0.999999

		int random = (int) (Math.random() * 10) + 1; // 0.0~ 0.99 x10 + 1 / 1~10까지 나올 예정
		int sum = 0;

		for (int i = 1; i <= random; i++) {
//			System.out.println(i);
			sum += i; // random이 4라면, 1부터 4까지 실행되면서 sum+=i;가 계속 더함
		}
		System.out.printf("1부터 %d까지의 정수 합계:%d", random, sum);
	}

	public void method6() {
		// 키보드로 정수 두개를 입력 받아 작은 수 부터 큰 수 까지의 합

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : "); // 1
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : "); // 10 // 1~10까지의 합
		int num2 = sc.nextInt();

		// 수가 거꾸로 들어오면? ex) 4, 2
		int sum = 0;

//		for (int i = num1; i <= num2; i++) {
//			sum += i;
//		}
//
//		System.out.printf("(순서 맞음)%d에서 %d 까지의 합 : %d", num1, num2, sum);

		int min = 0;
		int max = 0;

		if (num1 > num2) {
			min = num2;
			max = num1;
		} else {
			min = num1;
			max = num2;
		}

		for (int i = min; i <= max; i++) {
			sum += i;
		}

		System.out.printf("(순서 반대)%d에서 %d 까지의 합 : %d", min, max, sum);

		sc.close();
	}

	public void method7() {// 이중 for문

		for (int dan = 2; dan <= 9; dan++) { // 1~9단..
			for (int i = 1; i < 10; i++) { // *1~9
				System.out.printf("%3d*%d=%d ", dan, i, (dan * i));
			}
			System.out.println("");
		}
	}

	public void method8() {
		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				System.out.printf("%2d시%2d분\n", hour, min);
			}
		}
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수: ");
		int row = sc.nextInt();

		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

	public void method10() {
		/*
		 * 1***** 2**** 3*** 4** 5* 6
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수: ");
		int row = sc.nextInt();
		System.out.print("칸 수: ");
		int col = sc.nextInt();

//		for (int r = 1; r <= row; r++) {
//			for (int c = 1; c <= col; c++) {
//				if (r == c) {
//					System.out.print(c);
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//
//		}

		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= col; c++) {
				if (r == c) {
					System.out.print(r);
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");

		}
		sc.close();
	}

}
