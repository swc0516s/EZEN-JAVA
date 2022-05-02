package kr.co.ezen.first;

public class B_ValuePrinter {

	public void printValue1() {
		// 여러가지 형태의 값을 출력해 보기

		// 숫자 출력
		System.out.println(123);
		System.out.println(1.23);

		// 문자 출력
		// char 2byte A를 저장한 다음 println()호출
		// println()은 A를 받아서 출력한다.
		System.out.println('A'); // ;는 명령문의 끝을 의미한다
		System.out.println('a');

		// 문자열 출력
		System.out.println("안녕하세요");
		System.out.println("aAbBcCdD");

		System.out.println(123 + 456); // 579
		System.out.println(1.23 - 0.12);

		System.out.println('a' + 1); // 97(아스키 코드 상 a가 97)+1 = 98

		System.out.println("Hello" + 123); // "문자열"+숫자 =>의 +는 덧셈이 아니라 연결을 의미

	}

	public void printValue2() {
		// 문자열과 숫자의 '+' 연산
		System.out.println(9 + 9);
		System.out.println(9 + "9");
		System.out.println("9" + 9);
		System.out.println("9" + "9");

		System.out.println(9 + 9 + "9"); // 18+9
		System.out.println(9 + "9" + 9); // "99"+9
		System.out.println("9" + 9 + 9); // "99"+9
		System.out.println("9" + (9 + 9)); // 918

	}

	public void printValue3() {
		System.out.println("변수 사용 전");
		System.out.println(100 + 10);
		System.out.println(((100 + 10) * 10) - 10);

		int point = 100; // 대입연산자 =, 메모리 공간 이름 = 값
						// 변수의 타입(type) 변수명 , int는 4byte 공간차지
		int bonus = 10;
		int personCount = 10;
		int fees = 10;

		System.out.println("변수 사용 후");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
	}
}

// 출력을 하는 실행 명령문들은 메서드가 있어야 함