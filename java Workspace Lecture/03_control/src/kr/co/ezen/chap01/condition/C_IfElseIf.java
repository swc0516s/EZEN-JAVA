package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	/*
	 * if(조건식) { 실행할 문장1; }else if(조건식) { 실행할 문장2; }else { 실행할 문장3; }
	 */

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한개 입력하세요.:");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else if (num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}

		System.out.println("프로그램 종료");

		sc.close();
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만): ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만): ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만): ");
		int num = sc.nextInt();
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째 자리까지): ");
		double score = sc.nextDouble();

		String student = null; // 값은 값인데 의미 없는 값

		if (gender == 'm' || gender == 'M') { // 조건이 참 일때는 무조건 첫 번째 명령어 실행
			student = "(남)";

		} else if (gender == 'f' || gender == 'F') {
			student = "(여)";

		} else {
			student = "(성별)";
			System.out.println("");
			System.out.println("성별을 잘못 입력하였습니다.");
		}

		System.out.println(
				grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + student + "의 성적은 " + score + "이다.");

		sc.close();
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이:");
		int age = sc.nextInt();

		String str = null;

		if (age <= 13) { // ~13세
			str = "어린이";

		} else if (age < 19) {
			str = "청소년";

		} else {
			str = "성인";
		}

		System.out.print(str);
		sc.close();
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("주민 번호를 입력하세요(-포함): ");
		char pId = sc.nextLine().charAt(7);

		if (pId == '1' || pId == '3') {
			System.out.println("남자입니다.");
		} else if (pId == '2' || pId == '4') {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		sc.close();
	}

	public void method5() {
		// 점수를 하나 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요: ");
		int score = sc.nextInt();
		char grade = ' '; // 초기화

		if (score > 100 || score < 0) {
			System.out.println("점수를 잘못입력하셨습니다.");
			grade = '-';
		} else if (score <= 100 && score >= 90) {
			grade = 'A';
		} else if (score < 90 && score >= 80) {
			grade = 'B';
		} else if (score < 80 && score >= 70) {
			grade = 'C';
		} else if (score < 70 && score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("당신의 점수는 " + score + "이고, 등급은 " + grade + "입니다.");
		System.out.printf("당신의 점수는 %d이고, 등급은 %c입니다.", score, grade);
		sc.close();

	}

	public void method6() {
		// 점수 등급별 중간 점수 이상의 경우에는
		// 등급에 "+" 라는 문자 추가
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요: ");
		int score = sc.nextInt();
		String grade = ""; // 초기화

//		if (score > 100 || score < 0) {
//			System.out.println("점수를 잘못입력하셨습니다.");
//			grade = "-";
//
//		} else if (score <= 100 && score >= 90) {
//			grade = "A";
//			if (score >= 95) {
//				grade += "+";
//			}
//		} else if (score < 90 && score >= 80) {
//			grade = "B";
//			if (score >= 85) {
//				grade += "+";
//			}
//		} else if (score < 80 && score >= 70) {
//			grade = "C";
//			if (score >= 75) {
//				grade += "+";
//			}
//		} else if (score < 70 && score >= 60) {
//			grade = "D";
//			if (score >= 65) {
//				grade += "+";
//			}
//		} else {
//			grade = "F";
//		}

		if (score > 100 || score < 0) {
			System.out.println("점수를 잘못입력하셨습니다.");
			grade = "-";
		} else if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 85) {
			grade = "B+";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 75) {
			grade = "C+";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 65) {
			grade = "D+";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "이고, 등급은 " + grade + "입니다.");
		System.out.printf("당신의 점수는 %d이고, 등급은 %s입니다.", score, grade);
		sc.close();

	}

	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int score = sc.nextInt();
		String grade = ""; // 초기화

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score > 75) {
				grade += "+";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade += "+";
			}
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "이고, 등급은 " + grade + "입니다.");
		System.out.printf("당신의 점수는 %d이고, 등급은 %s입니다.", score, grade);
		sc.close();

	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수: ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		System.out.println("총 합계: " + sum);
		System.out.println("총 평균: " + avg);
//각 과목이 40점 이상이면서 평균이 60점 이상= 합격 아니면 불합격 

		if (kor >= 40 && eng >= 40 && math >= 40) {
			if (avg >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("평균이 부족합니다.");
			}
		} else {
			System.out.println("각 과목 기준을 넘지 못했습니다.");
		}

		sc.close();
	}
}
