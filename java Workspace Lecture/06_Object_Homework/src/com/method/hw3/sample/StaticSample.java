package com.method.hw3.sample;

public class StaticSample {
	private static String value;

//	public StaticSample() {
//
//	}
//
//	public StaticSample(String value) {
//		this.value = value;
//	}

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {
//		char[] cArr = value.toCharArray(); // value�� ����Ǿ��ִ� ���ڿ��� �迭 Ÿ������ ��ȯ
//
//		for (int i = 0; i < cArr.length; i++) {
//			if(cArr[i] >= 'a'&& cArr[i] <= 'z') {
//				cArr[i]=(char)(cArr[i]-32); // �ƽ�Ű�ڵ� �ҹ��ڿ� �빮���� ���̸�ŭ
//			}
//		}
//		value=value.valueOf(cArr);

		value = value.toUpperCase();
	}

	public static int valueLength() {

		return value.length();

	}

	public static String valueConcat(String str) {

		return value.concat(str);
	}

	public static void setChar(int index, char c) {
		char[] cArr = value.toCharArray();
		cArr[index] = c;
		value = String.copyValueOf(cArr);

	}
}
