package kr.co.ezen.example.array;

import java.util.Scanner;

public class A_Array {

	public void method1() {
		// 배열 사용 이유, 배열의 편리함

		// 변수 여러개 사용
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;

		// 반복문도 사용하지 못하고 일일히 더할때
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;

		// 아파트에 사는 것은 동일해야 함. 사람~~~ 동물?x
		// ㅁㅁㅁㅁㅁ 101호 102호 103호...
		// index = 0부터 시작. 0 1 2 3 ...
		// 동일타입에 순서는 0부터!
		// 근데 101호인데 어디 101호? 이름이 존재해야함.

		// java에서의 new? 만들다.
		// 대괄호 치는것이 배열 선언
		// 배열 선언 및 할당
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("arr.length=" + arr.length);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
		}

		int sum2 = 0; // sum2에다가 배열에 있는 값 모두 누적해보기
		for (int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		System.out.println("sum2=" + sum2);

	}

	public void method2() {
		int[] iArr; // stack에 int형 배열의 주소를 보관할 수 있는 공간 생성
		char cArr[]; // 대괄호는 어디에 있든 상관 없음

		// 배열의 단점 : 한번 정한 배열의 크기는 변경 불가능
		iArr = new int[5];
		cArr = new char[10];

		int[] iArr2 = new int[5];
		char cArr2[] = new char[10];

		System.out.println("iArr:" + iArr);
		System.out.println("iArr2:" + iArr2);
		System.out.println("cArr:" + cArr);
		System.out.println("cArr2:" + cArr2); // 시작주소값이 나옴

		// heap 메모리는 변수를 생성하여 직접 접근을 하지 못하는 영역이기 때문에
		// 실제 값을 저장하고 있는 공간의 주소만 가지고 접근할 수 있다.

		System.out.println("iArr의 hashCode:" + iArr.hashCode());
		System.out.println("iArr2의 hashCode:" + iArr2.hashCode());
		System.out.println("cArr의 hashCode:" + cArr.hashCode());
		System.out.println("cArr2의 hashCode:" + cArr2.hashCode());

		// iArr, cArr에 무슨 값이 들어있는지 출력해보기
		System.out.println("iArr의 길이:" + iArr.length);
		System.out.println("cArr의 길이:" + cArr.length);

		for (int i = 0; i < iArr.length; i++) {
			System.out.println("iArr의" + i + " 번째 값>" + iArr[i] + "<");
		}

		for (int i = 0; i < cArr.length; i++) {
			System.out.println("cArr의" + i + " 번째 값>" + cArr[i] + "<");
		}

		Scanner sc = new Scanner(System.in);

		System.out.print("새로 할당한 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		double[] dArr = new double[size]; // 실행하면서 힙에다가 공간을 만드는 것 = 동적 할당 // 5

		System.out.println("dArr의 hashCode:" + dArr.hashCode());
		System.out.println("dArr의 길이:" + dArr.length);

		dArr = new double[30];
		System.out.println("dArr의 hashCode:" + dArr.hashCode());
		System.out.println("dArr의 길이:" + dArr.length);

		sc.close();

		dArr = null; // 힙에 만들어진 클래스든 배열이든 초기화는 null을 준다.
						// 참조변수(배열명) 메모리를 참조한다~

//		System.out.println("dArr의 길이:" + dArr.length);
		// 실행 시 NullPointException오류. 왜? dArr이 지금 비어있으니까.

	}

	public void method3() {
		int[] iArr = new int[5];

		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "]의 값:" + iArr[i]);
		}

		int[] iArr2 = new int[] { 11, 22, 33, 44, 55 }; // [0] [1] [2] [3] [4]

		System.out.println("iArr2의 길이:" + iArr2.length);

		String[] sArr = { "apple", "banana", "grape", "orange" };

		String sArr2[] = { "apple" };

		String sArr3[];
		sArr3 = new String[] { "apple" };

		/*
		 * String[] sArr4 = { "apple" }; sArr4 = "apple"; //String sArr44="apple;
		 */

//		String sArr5[] = null;
//		sArr5="abcd";

	}

	public void method4() {
		// 사용자에게 5명의 키의 정보를 입력받아 배열에 담아두고
		// 반목문을 통해 5명의 키의 평균값을 구하시오

		Scanner sc = new Scanner(System.in);
		double[] height = new double[5];
//		System.out.println("첫번째 사람의 키를 입력하세요.");
//		double userHeight1 = sc.nextDouble();
//		System.out.println("두번째 사람의 키를 입력하세요.");
//		double userHeight2 = sc.nextDouble();
//		System.out.println("세번째 사람의 키를 입력하세요.");
//		double userHeight3 = sc.nextDouble();
//		System.out.println("네번째 사람의 키를 입력하세요.");
//		double userHeight4 = sc.nextDouble();
//		System.out.println("다섯번째 사람의 키를 입력하세요.");
//		double userHeight5 = sc.nextDouble();
//
//		height[0] = userHeight1;
//		height[1] = userHeight2;
//		height[2] = userHeight3;
//		height[3] = userHeight4;
//		height[4] = userHeight5;
//
//		double sum = 0;
//		for (int i = 0; i < height.length; i++) {
//
//			sum += height[i];
//		}
//		System.out.println(sum / height.length);

		for (int i = 0; i < height.length; i++) {
			System.out.print("키 입력:");
			height[i] = sc.nextDouble();
		}

		double sum = 0;
		for (int i = 0; i < height.length; i++) {
			sum += height[i];
		}

		System.out.println("평균:" + sum / height.length);

		sc.close();
	}

	public void method5() {
		// 해당 배열에 1부터 100사이의 랜덤값들을 발생시켜 넣어 줌
		// 나온 배열 값 중 짝수만 더해서 합계 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
//			int random = (int) (Math.random() * 100 + 1);
//			arr[i] = random;
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			} else {
				continue;
			}
		}

		System.out.println();
		System.out.println("짝수의 총합:" + sum);

		sc.close();
	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str = sc.nextLine(); // 입력값으로 동적할당하기 //"abcde"

		char[] arr = new char[str.length()]; // ()가 들어가면 기능을 하는 메서드다~

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(arr[i] + " ");
		}
		
		//for문에 arr.legnth , str.length() 둘 다 같은 길이여서 뭘 써도 상관 없는듯 
		sc.close();
	}
}
