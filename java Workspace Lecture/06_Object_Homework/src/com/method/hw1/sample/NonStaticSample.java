package com.method.hw1.sample;

import java.util.Random;

public class NonStaticSample {

	// 반환값 없고 매개변수 없는 메서드
	// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력
	public void printLottoNumbers() {

		int[] num = new int[6];

		for (int i = 0; i < 6; i++) {
			num[i] = new Random().nextInt(45) + 1; // 다른 방법!

			for (int j = 0; j < i; j++)
				if (num[i] == num[j]) {
					i--;
					break;
				}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}
		System.out.println();
	}

	// 반환값 없고 매개변수 있는 메서드
	// 정수 하나, 문자 하나를 전달 받아 문자를 정수 개수만큼 출력

	public void outputChar(int num, char c) {

		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	// 반환값 있고 매개변수 없는 메서드
	// 알파벳 범위의 영문자를 하나 발생시켜 리턴

	public char alphabette() {

		int num = 0;

		while (true) { // 무한으로 돌려버리기
			num = new Random().nextInt(58) + 65;

			if (num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') {
				break;
			}
		}
		return (char) num;
		// 무한으로 돌려서 if문이 참이 될때 반복문을 빠져나가서 리턴.

	}

	public String mySubstring(String str, int index1, int index2) { // str="apple" index1 = 2, index2 = 4 
		// null (가르키는 대상이 없다.) = ""

		
		if(!str.equals("")) {
			return str.substring(index1+1, index2);
		}else {
			return null;
		}

	}
}
