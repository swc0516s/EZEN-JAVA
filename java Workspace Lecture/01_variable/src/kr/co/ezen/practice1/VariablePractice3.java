package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice3 {

	public void inputScannerPractice3() {
		double num1;
		double num2;
		double area;
		double circle;

		Scanner sc = new Scanner(System.in);

		System.out.println("가로: ");
		num1 = sc.nextDouble();

		System.out.println("세로: ");
		num2 = sc.nextDouble();

		area = num1 * num2;
		circle = (num1 + num2) * 2;

		sc.close();

		System.out.println("면적: " + area);
		System.out.println("둘레: " + circle);

	}
}