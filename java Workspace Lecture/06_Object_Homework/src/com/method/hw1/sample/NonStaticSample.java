package com.method.hw1.sample;

import java.util.Random;

public class NonStaticSample {

	// ��ȯ�� ���� �Ű����� ���� �޼���
	// 1~45������ ������ ���� 6���� �ߺ����� �ʰ� �߻����� ���
	public void printLottoNumbers() {

		int[] num = new int[6];

		for (int i = 0; i < 6; i++) {
			num[i] = new Random().nextInt(45) + 1; // �ٸ� ���!

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

	// ��ȯ�� ���� �Ű����� �ִ� �޼���
	// ���� �ϳ�, ���� �ϳ��� ���� �޾� ���ڸ� ���� ������ŭ ���

	public void outputChar(int num, char c) {

		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	// ��ȯ�� �ְ� �Ű����� ���� �޼���
	// ���ĺ� ������ �����ڸ� �ϳ� �߻����� ����

	public char alphabette() {

		int num = 0;

		while (true) { // �������� ����������
			num = new Random().nextInt(58) + 65;

			if (num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') {
				break;
			}
		}
		return (char) num;
		// �������� ������ if���� ���� �ɶ� �ݺ����� ���������� ����.

	}

	public String mySubstring(String str, int index1, int index2) { // str="apple" index1 = 2, index2 = 4 
		// null (����Ű�� ����� ����.) = ""

		
		if(!str.equals("")) {
			return str.substring(index1+1, index2);
		}else {
			return null;
		}

	}
}
