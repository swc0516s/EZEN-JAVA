package com.method.hw1.run;

import com.method.hw1.sample.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample ns = new NonStaticSample();

//		System.out.print("1.���� ��:");
//		ns.printLottoNumbers();

//		System.out.print("2.a���� 5�� ���:");
//		ns.outputChar(5, 'a');
//
//		System.out.print("3. ���� ������ ���:" + ns.alphabette());

		System.out.print("4. apple�� 2�� 4�� �ε��� ������ �� ���:" + ns.mySubstring("apple", 2, 4));
	}

}
