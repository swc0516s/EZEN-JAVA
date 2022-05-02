package com.method.hw2.sample;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 100 + 1);
			arr[i] = r;
		}
		return arr;

	}

	public void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public void swap(int[] arr, int idx1, int idx2) {

		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

	}

	public void sortDesecending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}

			}

		}
		display(arr);
	}

	public void sortAscending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}

			}

		}
		display(arr);

	}

	public int countChar(String str, char c) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;

	}

	public int totalValue(int num1, int num2) {

		int sum = 0;

//		int min = 0;
//		int max = 0;
//		if (num1 < num2) {
//			min = num1;
//			max = num2;
//		} else {
//			min = num2;
//			max = num1;
//		}

		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);

		for (int i = min + 1; i < max; i++) {
			sum += i;
		}

		return sum;

	}

	public char pCharAt(String str, int index) {

		return str.charAt(index);

	}

	public String pConcat(String str1, String str2) {
//		return str1+str2;

		return str1.concat(str2); // 연결 대상을 넣으면 연결.
	}
}
