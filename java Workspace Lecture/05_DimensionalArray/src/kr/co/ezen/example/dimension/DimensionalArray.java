package kr.co.ezen.example.dimension;

public class DimensionalArray {

	public void method1() {
		// 2���� �迭 ����

		int[][] iarr1;
		int iarr2[][];
		int[] iarr3[];

		iarr1 = new int[3][5];

		for (int i = 0; i < iarr1.length; i++) { // 3
			for (int j = 0; j < iarr1[i].length; j++) { // 0���� ����Ű�� ��
				System.out.print(iarr1[i][j] + " ");

			}
			System.out.println();
		}

	}

	public void method2() {

//		iarr[0][0] = 1;
//		iarr[0][1] = 2;
//		iarr[0][2] = 3;
//		iarr[0][3] = 4;
//		iarr[0][4] = 5;
//		iarr[1][0] = 6;
//		iarr[1][1] = 7;
//		iarr[1][2] = 8;
//		iarr[1][3] = 9;
//		iarr[1][4] = 10;
//		iarr[2][0] = 11;
//		iarr[2][1] = 12;
//		iarr[2][2] = 13;
//		iarr[2][3] = 14;
//		iarr[2][4] = 15;

		int[][] iarr = new int[3][5];

		int value = 1;

		for (int i = 0; i < iarr.length; i++) { // ��

			for (int j = 0; j < iarr[i].length; j++) { // ��
				iarr[i][j] = value;
				value += 1;
				System.out.printf("%-2d ", iarr[i][j]);
			}
			System.out.println();
		}
	}

	public void method3() {
		// ���� �迭 (���̰� �������� �ʴ�.)

		int[][] iarr = new int[3][];

		iarr[0] = new int[2];
		iarr[1] = new int[1];
		iarr[2] = new int[3];

//		iarr[0][0] = 1;
//		iarr[0][1] = 2;
//		iarr[1][0] = 3;
//		iarr[2][0] = 4;
//		iarr[2][1] = 5;
//		iarr[2][2] = 6;

		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}

		int value = 0;
		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = ++value;
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void method4() {
		// ������ �迭�� �Ҵ�� �ʱ�ȭ ���ÿ� ����
		int[] iarr0 = { 1, 2, 3, 4, 5 }; // 1�����迭�� �ʱ�ȭ

		int[][] iarr1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < iarr1.length; i++) {
			for (int j = 0; j < iarr1[i].length; j++) {
				System.out.printf("%-3d ", iarr1[i][j]);

			}
			System.out.println();
		}
//		@formatter:off
		int[][] iarr2 = { 
						{ 1, 2, 3 }, 
						{ 4, 5, 6, 7, 8, 9 }, 
						{ 10, 11, 12, 13 } 
						};
//		@formatter:on

		for (int i = 0; i < iarr1.length; i++) {
			for (int j = 0; j < iarr2[i].length; j++) {
				System.out.printf("%2d ", iarr2[i][j]);

			}
			System.out.println();
		}
		System.out.println("iarr2�� ���� ũ��:" + iarr2.length);

	}
}
