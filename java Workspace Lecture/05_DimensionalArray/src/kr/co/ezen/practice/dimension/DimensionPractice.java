package kr.co.ezen.practice.dimension;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class DimensionPractice {

	public void practice1() {
		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
				System.out.printf("%d,%d ", i, j);
			}
			System.out.println();
		}

	}

	public void practice2() {
		int[][] arr = new int[4][4];
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice3() {
		int[][] arr = new int[4][4];
		int count = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count--;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice4() {
		int[][] arr = new int[4][4];
		int sum = 0;

		for (int i = 0; i < arr.length - 1; i++) { // i = 0 ; i < 3 ; i++ // 0 1 2
			for (int j = 0; j < arr[i].length - 1; j++) {
				int random = (int) (Math.random() * 10 + 1); // 4*4ũ���� �迭 �� 3*3ũ�⿡ ������ ���� ����
				arr[i][j] = random;// 0,0 0,1 0,2 // 1,0 1,1 1,2 // 2,0 2,1 2,2 // i0�϶� j�� 012 ���ϱ� .
			}
		}
		// ��ȯ��
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[i][3] += arr[i][j];
//				arr[3][j] += arr[i][j];
//				arr[3][3] += arr[i][j];
//			}
//			arr[3][3] += arr[i][3];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j]; // i�� 3���� arr i�� j��(012/0~2���� �ݺ���)���� ����
				arr[3][i] += arr[j][i]; // 3�� i���� arr j�� i��(012/0~2���� �ݺ���)���� ����

			}
			arr[3][3] += arr[i][3] + arr[3][i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

			// �ٺ��
//			for(int i=0; i<arr.length-1; i++) {
//				for(int j=0; j<arr[i].length-1; j++) {
//				arr[i][3] += arr[i][j];
//				arr[3][i] += arr[j][i];
//				         
//				}
//				   }
//				for(int i=0; i<arr.length-1; i++) {
//				arr[3][3] += arr[3][i]+arr[i][3];
//				}
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ũ�� : ");
		int row = sc.nextInt();
		System.out.println("�� ũ�� : ");
		int col = sc.nextInt();

		char[][] arr = new char[row][col];

		// �࿭�ȿ� ���� ���ĺ� �빮�� �� 65 ~ 90
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) ((Math.random() * 26) + 65);

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

	public void practice6() {

//		@formatter:off
		String[][] strArr = new String[][] {
											{"��","��","��","��","��"},
											{"��","��","��","��","��"},
											{"��","��","��","��","��"},
											{"��","��","��","��","��"},
											{"��","��","!" ,"��","!!"}
											};
											
											//0,0 0,1 0,2 0,3 0,4
											//1,0 1,1 1,2 1,3 1,4
											//2,0 2,1 2,2 2,3 2,4
											//3,0 3,1 3,2 3,3 3,4
											//4,0 4,1 4,2 4,3 4,4
//		@formatter:on

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {

				System.out.print(strArr[j][i] + " ");
			}
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		//@formatter:off
		
		//0,0 
		//1,0 1,1 
		//2,0 2,1 2,2
		//3,0 3,1 3,2 3,3 
		//4,0 4,1 4,2 4,3 4,4
		
		//@formatter:on

		System.out.println("���� ũ�� : ");
		int row = sc.nextInt();
		int col = 0;

		char[][] charArr = new char[row][col];

		for (int i = 0; i < row; i++) {
			System.out.print(i + "���� ũ�� : ");
//			col = sc.nextInt();
//			charArr[i] = new char[col];
			charArr[i] = new char[sc.nextInt()];

		}

		char data = 'a';
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				charArr[i][j] = data++;
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

	public void practice8() {
		String[] student = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		// @formatter:off
		// 0,0 0,1 / 1 2 / �ݺ��� ���� �״��.
		// 1,0 1,1 / 3 4 / student ���� ī��Ʈ�� �ø��� �ɵ�
		// 2,0 2,1 / 5 6 /
		// @formatter:on

		int count = 0;

		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {

				seat1[i][j] = student[count];
				count++;

				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();

		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {

				seat1[i][j] = student[count];
				count++;

				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();

		}

	}

	public void practice9() {

		String[] student = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		// @formatter:off
		// 0,0 0,1 / 1 2 / �ݺ��� ���� �״��.
		// 1,0 1,1 / 3 4 / student ���� ī��Ʈ�� �ø��� �ɵ�
		// 2,0 2,1 / 5 6 /
		// @formatter:on

		int count = 0;

		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {

				seat1[i][j] = student[count];
				count++;

				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();

		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {

				seat2[i][j] = student[count];
				count++;

				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println("=================");

		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();

		String partName = ""; // �д�
		String colName = ""; // ��, ���� �� / ��
		String rowName = ""; // �� / ��?

		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				if (seat1[i][j].equals(name)) {
					partName = "1�д�";

//					rowName = (i + 1) + "��°��";
					if (i == 0) {
						rowName = "ù ��° ��";
					} else if (i == 1) {
						rowName = "�� ��° ��";
					} else {
						rowName = "�� ��° ��";
					}

//					if (seat1[i][0].equals(name)) {
//						colName = "����";
//					} else {
//						colName = "������";
//					}
					if (j == 0) {
						colName = "����";

					} else {
						colName = "������";

					}

				}
			}
		}
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				if (seat2[i][j].equals(name)) {
					partName = "2�д�";

//					rowName = (i + 1) + "��°��";
					if (i == 0) {
						rowName = "ù ��° ��";
					} else if (i == 1) {
						rowName = "�� ��° ��";
					} else {
						rowName = "�� ��° ��";
					}

//					if (seat1[i][0].equals(name)) {
//						colName = "����";
//					} else {
//						colName = "������";
//					}
					if (j == 0) {
						colName = "����";

					} else {
						colName = "������";

					}

				}

			}
		}
		if (partName == "")

		{
			System.out.println("���� �̸��Դϴ�.");
		} else {
			System.out.println("�˻��Ͻ� " + name + " �л��� " + partName + " " + rowName + " " + colName + "�� �ֽ��ϴ�.");
		}
		sc.close();
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6];

		System.out.print("�� �ε��� �Է� : ");
		int row = sc.nextInt();
		System.out.print("�� �ε��� �Է� : ");
		int col = sc.nextInt();

		for (int i = 0; i < board.length; i++) { // board �� �������� �ʱ�ȭ
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}

//		System.out.println("  0 1 2 3 4");
		for (int i = 0; i < board.length; i++) {
//			System.out.print(i + " ");
			for (int j = 0; j < board[row].length; j++) {

				board[1][0] = "0";
				board[2][0] = "1";
				board[3][0] = "2";
				board[4][0] = "3";
				board[5][0] = "4";
				board[0][1] = "0";
				board[0][2] = "1";
				board[0][3] = "2";
				board[0][4] = "3";
				board[0][5] = "4";
				board[0][0] = " ";

//				board[row][col] = "X";
				board[row + 1][col + 1] = "X";
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

	public void practice10_1() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6];

		int row = 0;
		int col = 0;

		for (int i = 0; i < board.length; i++) { // board �� �������� �ʱ�ȭ
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}

		for (int i = 0; i < board.length - 1; i++) {
			board[0][i + 1] = i + "";
			board[i + 1][0] = i + "";
		}

		do {
			System.out.print("�� �ε��� �Է� : "); // 3
			row = sc.nextInt();

			if (row != 99) {

				System.out.print("�� �ε��� �Է� : "); // 4
				col = sc.nextInt();

				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (i== row && j == col) {
							board[i + 1][j + 1] = "X";

						}
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}
		} while (row != 99);
		System.out.println("���α׷� ����");

		sc.close();

	}
}
