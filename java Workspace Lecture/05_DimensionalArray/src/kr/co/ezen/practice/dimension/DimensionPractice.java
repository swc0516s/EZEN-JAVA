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
				int random = (int) (Math.random() * 10 + 1); // 4*4크기의 배열 중 3*3크기에 랜덤값 각각 배정
				arr[i][j] = random;// 0,0 0,1 0,2 // 1,0 1,1 1,2 // 2,0 2,1 2,2 // i0일때 j가 012 도니까 .
			}
		}
		// 근환님
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[i][3] += arr[i][j];
//				arr[3][j] += arr[i][j];
//				arr[3][3] += arr[i][j];
//			}
//			arr[3][3] += arr[i][3];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j]; // i행 3열에 arr i행 j열(012/0~2까지 반복문)값을 누적
				arr[3][i] += arr[j][i]; // 3행 i열에 arr j행 i열(012/0~2까지 반복문)값을 누적

			}
			arr[3][3] += arr[i][3] + arr[3][i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

			// 다빈님
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
		System.out.println("행 크기 : ");
		int row = sc.nextInt();
		System.out.println("열 크기 : ");
		int col = sc.nextInt();

		char[][] arr = new char[row][col];

		// 행열안에 랜덤 알파벳 대문자 값 65 ~ 90
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
											{"이","까","왔","앞","힘"},
											{"차","지","습","으","냅"},
											{"원","열","니","로","시"},
											{"배","심","다","좀","다"},
											{"열","히","!" ,"더","!!"}
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

		System.out.println("행의 크기 : ");
		int row = sc.nextInt();
		int col = 0;

		char[][] charArr = new char[row][col];

		for (int i = 0; i < row; i++) {
			System.out.print(i + "열의 크기 : ");
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
		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		// @formatter:off
		// 0,0 0,1 / 1 2 / 반복문 순서 그대로.
		// 1,0 1,1 / 3 4 / student 값만 카운트로 올리면 될듯
		// 2,0 2,1 / 5 6 /
		// @formatter:on

		int count = 0;

		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {

				seat1[i][j] = student[count];
				count++;

				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();

		System.out.println("== 2분단 ==");
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

		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		// @formatter:off
		// 0,0 0,1 / 1 2 / 반복문 순서 그대로.
		// 1,0 1,1 / 3 4 / student 값만 카운트로 올리면 될듯
		// 2,0 2,1 / 5 6 /
		// @formatter:on

		int count = 0;

		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {

				seat1[i][j] = student[count];
				count++;

				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();

		System.out.println("== 2분단 ==");
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

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		String partName = ""; // 분단
		String colName = ""; // 왼, 오른 쪽 / 열
		String rowName = ""; // 줄 / 행?

		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				if (seat1[i][j].equals(name)) {
					partName = "1분단";

//					rowName = (i + 1) + "번째줄";
					if (i == 0) {
						rowName = "첫 번째 줄";
					} else if (i == 1) {
						rowName = "두 번째 줄";
					} else {
						rowName = "세 번째 줄";
					}

//					if (seat1[i][0].equals(name)) {
//						colName = "왼쪽";
//					} else {
//						colName = "오른쪽";
//					}
					if (j == 0) {
						colName = "왼쪽";

					} else {
						colName = "오른쪽";

					}

				}
			}
		}
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				if (seat2[i][j].equals(name)) {
					partName = "2분단";

//					rowName = (i + 1) + "번째줄";
					if (i == 0) {
						rowName = "첫 번째 줄";
					} else if (i == 1) {
						rowName = "두 번째 줄";
					} else {
						rowName = "세 번째 줄";
					}

//					if (seat1[i][0].equals(name)) {
//						colName = "왼쪽";
//					} else {
//						colName = "오른쪽";
//					}
					if (j == 0) {
						colName = "왼쪽";

					} else {
						colName = "오른쪽";

					}

				}

			}
		}
		if (partName == "")

		{
			System.out.println("없는 이름입니다.");
		} else {
			System.out.println("검색하신 " + name + " 학생은 " + partName + " " + rowName + " " + colName + "에 있습니다.");
		}
		sc.close();
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6];

		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();

		for (int i = 0; i < board.length; i++) { // board 를 공백으로 초기화
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

		for (int i = 0; i < board.length; i++) { // board 를 공백으로 초기화
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}

		for (int i = 0; i < board.length - 1; i++) {
			board[0][i + 1] = i + "";
			board[i + 1][0] = i + "";
		}

		do {
			System.out.print("행 인덱스 입력 : "); // 3
			row = sc.nextInt();

			if (row != 99) {

				System.out.print("열 인덱스 입력 : "); // 4
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
		System.out.println("프로그램 종료");

		sc.close();

	}
}
