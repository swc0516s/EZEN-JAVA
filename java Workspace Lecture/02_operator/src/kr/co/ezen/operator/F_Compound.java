package kr.co.ezen.operator;

public class F_Compound {
	public void method() {
		int num = 12;

		System.out.println("num:" + num); // 12

		num = num + 3;
		System.out.println("num:" + num); // 15

		num += 3; // num = num +3 이랑 같은 말
		System.out.println("num:" + num); // 18

		num *= 6;
		System.out.println("num:" + num); // 108

		num -= 5;
		System.out.println("num:" + num); // 103

		num /= 3;
		System.out.println("num:" + num); // 34

		num %= 10;
		System.out.println("num:" + num); // 4
	}

}
