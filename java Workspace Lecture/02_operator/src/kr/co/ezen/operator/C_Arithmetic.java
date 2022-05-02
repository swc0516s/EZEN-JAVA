package kr.co.ezen.operator;

public class C_Arithmetic {

	public void method1() {
		int num1 = 10;
		int num2 = 3;

		System.out.println("num1+num2:" + (num1 + num2));
		System.out.println("num1-num2:" + (num1 - num2));
		System.out.println("num1*num2:" + (num1 * num2));

		System.out.println("num1/num2:" + (num1 / num2));
		System.out.println("num1%num2:" + (num1 % num2)); // 나머지

		// 값%배수 == 0
		// 짝수 ==> 값%2 == 0 or 값%2 !=1
		// 홀수 ==> 값%2 == 1 or 값%2 !=0
		System.out.println(365 % 2 != 1); // false
		System.out.println(365 % 2 != 0); // true

	}

	public void method2() {
		double a = 35;
		double b = 10;

		double add = a + b;
		double sub = a - b;
		double mul = a * b;
		double div = a / b;
		double mod = a % b;

		System.out.println("add=" + add);
		System.out.println("sub=" + sub);
		System.out.println("mul=" + mul);
		System.out.println("div=" + div);
		System.out.println("mod=" + mod);

		int c = 27;

		System.out.println("c+" + c);

		double result = a + a * b % c - a / b;
		// --계산 순서--
		// a + ((a * b) % c) - (a / b)
		// 35.0 + ((35.0 * 10.0) % 27) - (35.0/10.0)
		// 35.0 + ((350.0) % 27) - (35.0/10.0)
		// 35.0 + (26.0) - (3.5)
		// 35.0 + 26.0 - 3.5
		// 57.5

		System.out.println("result=" + result);
		System.out.println(35.0 + ((35.0 * 10.0) % 27) - (35.0 / 10.0));
	}

	public void method3() {
		int a = 5; // 5
		int b = 10; // 5 10

		int c = (++a) + b; // 6 10 16
		int d = c / a; // 6 10 16 2
		int e = c % a; // 6 10 16 2 4
		int f = e++; // 6 10 16 2 5 4
		int g = (--b) + (d--); // 6 9 16 1 5 4 11
		int h = 2; // 6 9 16 1 5 4 11 2
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); // 6 9 16 1 5 4 11 2 ?

		System.out.println(6+9/(15/4)*(11 - 1) % (6+2) );
		// a++ + b / (--c / f) * (g-- - d) % (++e + h) c=15 e=6 그리고 후위값 a=7 g=10
		// 6+9/(15/4)*(11 - 1) % (6+2) = 12  계산 끝. 이후 후위연산자 적용
		// 7+9/(15/4)*(10 - 1) % (6+2)
		// 6 / 4 *9 %8
		//
		// 계산순서

		System.out.println("a=" + a); //
		System.out.println("b=" + b); //
		System.out.println("c=" + c); //
		System.out.println("d=" + d); //
		System.out.println("e=" + e); //
		System.out.println("f=" + f); //
		System.out.println("g=" + g); //
		System.out.println("h=" + h); //
		System.out.println("i=" + i); //

	}
}
