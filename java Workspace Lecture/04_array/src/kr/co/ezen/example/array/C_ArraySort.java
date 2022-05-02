package kr.co.ezen.example.array;

public class C_ArraySort { // sort: 정렬

	public void testSwapLogic() {
		int num1 = 10;
		int num2 = 20;
		int temp = 0;

		temp = num1; // num1 = 10 / num2 = 20 / temp = 20
		num1 = num2; // num1 = 10 / num2 = 10 / temp = 20
		num2 = temp; // num1 = 20 / num2 = 10 / temp = 20

		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		System.out.println("temp:" + temp);

		int[] arr = { 2, 1, 3 }; // 123
		int temp2 = 0;

		temp2 = arr[0]; // 2 2 1 3
		arr[0] = arr[1]; // 2 1 1 3
		arr[1] = temp2;

		for (int i = 0; i < arr.length - 1; i++) {
			temp2 = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp2;

			// 2 1 3
			// 2 3 1
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void testArraySort() { // 주말에 완벽 이해하자!!!

		int[] array = { 2, 4, 6, 1, 3, 5 };
		// 선택 정렬 (select sort)
		// 2 4 6 1 3 5
		// 1 4 6 2 3 5
		// 1 2 6 4 3 5
		// 1 2 4 6 3 5
		// 1 2 4 3 6 5
		// 1 2 3 4 6 5
		// 1 2 3 4 5 6
		int min;
		int temp;

		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				System.out.printf("현재 인덱스 위치:%d,%d\n", i, j);
				if (array[min] > array[j]) {
					min = j;
				}
			}
			System.out.println("--- 교환 시작합니다.---");
			temp = array[i];
			array[i] = array[min]; // 현재 가장 작은 값이 들어있음.
			array[min] = temp;

			// 0/12345 1/2345 2/345 3/45 4/5
		}
		System.out.println("정렬 후:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void testArraySort2() {
		// 버블정렬
		int[] array = { 2, 4, 6, 1, 3, 5 };
		int temp = 0;

		for (int i = array.length - 1; i > -1; i--) { // 5 4 3 2 1 0
			for (int j = 0; j < i; j++) { // 0 1 2 3 4
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

				for (int k = 0; k < array.length; k++) {
					if (k < array.length - 1) {
						System.out.print(array[k] + ",");
					} else {
						System.out.println(array[k]);
					}

				}
			}
		}
		System.out.println("정렬 후 확인:");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}