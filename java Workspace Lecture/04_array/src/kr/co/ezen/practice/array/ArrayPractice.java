package kr.co.ezen.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i; // 10 9 8 7 6 5 4 3 2 1
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		// 키보드로부터 정수를 입력받아
		// 입력받은 숫자 만큼 5 = 12345

		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 하나 입력해주세요.");

		int size = sc.nextInt();

		if (size > 0) {
			int[] arr = new int[size];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;

				System.out.println("arr[" + i + "] 의 값은 : " + arr[i]);
			}
		} else {
			System.out.println("양의 정수가 아닙니다.");
		}

		sc.close();
	}

	public void practice4() {
		String[] arr = new String[5];

		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";

		System.out.println(arr[1]); // 주소값에서 불러온거임

//		String sArr2[]= {"apple"};
//		System.out.println("sArr2:"+sArr2[0]);

	}

	public void practice5() { // 이것도 제대로 이해해보자....
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열:"); // abcde
		String str = sc.nextLine();
		System.out.print("문자:");
		char ch = sc.nextLine().charAt(0);

		char[] chArr = new char[str.length()];
		int count = 0; // aabbcde 처럼 동일 문자가 여러개일때 체크위해..

		// abcde에 b가 존재하는 위치
		// abcde를 입력받고 문자를 입력받음.
		// 문자열에서 그 문자가 있는 인덱스 찾기
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스):");

		for (int i = 0; i < str.length(); i++) {

			chArr[i] = str.charAt(i);

			if (ch == chArr[i]) {
				count++;
				System.out.print(i + " ");
			} else {
			}

		}
		System.out.println();
		System.out.println(ch + "개수:" + count);

		sc.close();

	}

	public void practice6() {
		String[] strArr = { "월", "화", "수", "목", "금", "토", "일" };
		// 0부터 6사이 숫자 입력, 해당되는 요일 출력, 다른 숫자 입력시 "잘못 입력하셨습니다." 출력
		// 0 : 월 - 6 : 일

		Scanner sc = new Scanner(System.in);
		System.out.println("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(strArr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

//		switch (num) {
//		case 0:
//			System.out.println("입력하신 숫자는 " + strArr[0] + "요일에 해당합니다.");
//			break;
//		case 1:
//			System.out.println("입력하신 숫자는 " + strArr[1] + "요일에 해당합니다.");
//			break;
//		case 2:
//			System.out.println("입력하신 숫자는 " + strArr[2] + "요일에 해당합니다.");
//			break;
//		case 3:
//			System.out.println("입력하신 숫자는 " + strArr[3] + "요일에 해당합니다.");
//			break;
//		case 4:
//			System.out.println("입력하신 숫자는 " + strArr[4] + "요일에 해당합니다.");
//			break;
//		case 5:
//			System.out.println("입력하신 숫자는 " + strArr[5] + "요일에 해당합니다.");
//			break;
//		case 6:
//			System.out.println("입력하신 숫자는 " + strArr[6] + "요일에 해당합니다.");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다.");
//		} 

		// !!!!!!!!!!!!!!!!!!!!! 똑같은 코드 반복은 좋은 코딩이 아님.

		sc.close();

	}

	public void practice7() {
		// 동적 할당 사용. 만들어진 배열에 임의의 정수값을 입력,
		// 그리고 입력된 정수의 수를 출력하고, 총합을 구함.
		// 입력시 입력될 인덱스 표시할 것.

		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수값 입력 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		System.out.println("입력된 정수 : " + num);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값:");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("입력된 정수의 총합 : " + sum);
		sc.close();

	}

	public void practice8() {
		String[] arr = { "후라이드", "양념", "파닭", "매콤", "치즈", "간장" };

		Scanner sc = new Scanner(System.in);

		System.out.print("치킨 이름을 입력하세요:");
		String chicken = sc.nextLine();

		boolean check = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(chicken)) {
				check = true;
				break;
			}
		}

		if (check) {
			System.out.println(chicken + "치킨 배달 가능");
		} else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
		sc.close();
	}

	public void practice9() {
		// 랜덤 숫자 1부터 10까지 출력하세요 .
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void practice10() {
		// 랜덤 숫자 1부터 10까지 발생 저장 후 배열에 저장된 값을 출력하고
		// 최대값 최소값 구하세요

		int[] arr = new int[10];
		int max = 1;
		int min = 10;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}

			System.out.println("arr[" + i + "]에 저장된 값" + arr[i]);
		}
		System.out.println();
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
	}

	public void practice11() {
		// 랜덤 숫자 중복 제거
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			boolean check = false;
//			System.out.println("arr[" + i + "]:" + arr[i]);

			arr[i] = random;
			for (int j = 0; j < i; j++) { // 중복된 숫자가 안나오게 해보기
				if (arr[j] == random) {
					check = true;
					break;
				} // 중복이면 넘어가고

			}

			if (!check) {
				arr[i] = random;
				System.out.print(arr[i] + " ");
			} // 중복이 아니면 출력

		}

	}

	public void practice12() {
		// 중복된 숫자 체크,,
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length;) {
			int random = (int) (Math.random() * 45 + 1);
			boolean check = false;

			for (int j = 0; j < i; j++) {
				if (lotto[j] == random) { // 로또의 j번째 숫자가 랜덤으로 발생한 숫자와 같냐
					check = true;
					break;
				}
			}

			if (!check) { // 같은 숫자가 들어왔을땐 여기 처리안함
				lotto[i] = random;
				i++; // for문에 마지막 i++를 여기로.
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = i; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;

				}
			}

			System.out.print(lotto[i] + " ");
		} // 0이 나왔단 소리는 그 자리에 숫자가 안들어갔다는 소리 .

	}

	public void practice13() {
		// 문자열: application
		// 문자열에 있는 문자, a,p,l,i,c,t,o,n
		// 문자 갯수 : 8 // count+=;

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str = sc.nextLine();

		int count = 0;

		char[] chArr = new char[str.length()];

		System.out.println("문자열 :" + str);
		for (int i = 0; i < chArr.length; i++) {

			chArr[i] = str.charAt(i);
			System.out.printf("chArr[%d]=%c\n", i, chArr[i]);
		}
		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (chArr[i] == str.charAt(j)) {
					chArr[i] = '\u0000';
					count++;
				}
			}

			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		System.out.println("문자 갯수 :" + (str.length() - count));
		sc.close();

	}

	public void practice13_1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열:");
		String str = sc.nextLine();

		char[] chArr = new char[str.length() + 1]; // 배열 길이만큼'\u0000' null default값만 들어있음.
		chArr[0] = str.charAt(0); // a / / / / / / / / / /

		boolean check = false;
		for (int i = 1; i < str.length(); i++) {
			for (int j = 0; j < chArr.length; j++) {
				if (str.charAt(i) == chArr[j]) {
					check = true; // p = a?? // p = null? // l = null? . . .
									// p = a?? // p = null? // ...
									// l = a?? // l = null? ...
									// i = a?? // i = null? ...

					break;
				}
			}

//			System.out.println(check);
			if (!check) {
				for (int k = 1; k < chArr.length; k++) {
					if (chArr[k] == '\u0000') {
						chArr[k] = str.charAt(i); // 자리가 비어있으면 넣어라
						break;
					}
				}
			}
			check = false; // 이거 만나고 다시 for문으로..
		}

//		배열에 값이 모두 입력돼서 넘어왔음  
		System.out.print(chArr[0]);
		System.out.print(chArr[1]);
		System.out.print(chArr[2]);
		System.out.print(chArr[3]);
		System.out.print(chArr[4]);
		System.out.print(chArr[5]);
		System.out.print(chArr[6]);
		System.out.print(chArr[7]);
		System.out.print(chArr[8]);
		System.out.print(chArr[9]);
		System.out.print(chArr[10]);
//		a p l i c t o n

		int count = 0;
		System.out.print("문자열에 있는 문자:");
		for (int i = 0; i < chArr.length; i++) { // a p . l i c . t . o n
			if (chArr[i] != '\u0000') {
				if (chArr[i + 1] == '\u0000') { // 에러가 난 곳.
					System.out.print(chArr[i]);
				} else {
					System.out.print(chArr[i] + ", ");

				}
				count++;
			} // chArr[i]가 공백이면 if문을 건너뛰기때문에 카운트 x
		}
		System.out.println();
		System.out.print("문자 개수:" + count);

		sc.close();
	}
}
