package kr.co.ezen.variable;

public class A_Variable {

	public void declareVariable() {
		// 1.논리형 (true, false)
		boolean isTrue;

		// 2.숫자형
		// 2-1.정수형
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte
		long lNum; // 8byte

		// 2-2.실수형
		float fNum; // 4byte
		double dNum; // 8byte

		// 3. 문자형

		char ch; // 2byte 0~65536

		// 4. 문자열
		String str;

		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // L을 붙여야 8byte짜리로 처리

		fNum = 4.0f; // f를 붙여야 4byte짜리로 처리
		dNum = 8.0; // 실수의 기본 타입(double)

		ch = 'A'; // 문자형''
		str = "A"; // 문자열""

		System.out.println("isTrue:" + isTrue);
		System.out.println("bNum의 값:" + bNum);
		System.out.println("sNum의 값:" + sNum);
		System.out.println("iNum의 값:" + iNum);
		System.out.println("lNum의 값:" + lNum);
		System.out.println("fNum의 값:" + fNum);
		System.out.println("dNum의 값:" + dNum);
		System.out.println("ch의 값:" + ch);
		System.out.println("str의 값:" + str);
	}

	public void declareVariable2() {
		// 1.논리형 (true, false)
		boolean isTrue = true;

		// 2.숫자형
		// 2-1.정수형
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; // 4byte
		long lNum = 8L; // 8byte

		// 2-2.실수형
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; // 8byte

		// 3. 문자형

		char ch = '가'; // 2byte 0~65536

		// 4. 문자열(참조형)
		String str = "자바 취업반";

		System.out.println("isTrue:" + isTrue);
		System.out.println("bNum의 값:" + bNum);
		System.out.println("sNum의 값:" + sNum);
		System.out.println("iNum의 값:" + iNum);
		System.out.println("lNum의 값:" + lNum);
		System.out.println("fNum의 값:" + fNum);
		System.out.println("dNum의 값:" + dNum);
		System.out.println("ch의 값:" + ch);
		System.out.println("str의 값:" + str);
	}

	public void charVariable() {
		char ch = 32;
		System.out.println("1.코드값으로 리턴 :" + ch);
		ch = '이';
		System.out.println("2.한글로 리턴:" + ch);
		ch = '\uae08';
		System.out.println("3.유니코드로 리턴:" + ch);

		char ch1, ch2, ch3, ch4;
		ch1 = '\ub300';
		ch2 = '\ud55c';
		ch3 = '\ubbfc';
		ch4 = '\uad6d';
		// 백슬래시u < 유니코드

		System.out.println(ch1); // 대
		System.out.println(ch1 + 1); // 45824+1
		System.out.println(ch1 + ch2 + ch3 + ch4); // 192965
		System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + ch4); // 대한민국
		System.out.println("" + ch1 + ch2 + ch3 + ch4); // 대한민국

		System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4); // 대 한 민 국
		System.out.println(" " + ch1 + ch2 + ch3 + ch4); // 대한민국

	}

}
