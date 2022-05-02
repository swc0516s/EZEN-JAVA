package kr.co.ezen.operator;

public class D_Comparison {

	public void method() {
		int a = 10;
		int b = 25;
		boolean result1, result2, result3; //참, 거짓만 저장 가능함

		result1 = (a == b); // =(대입연산자 항상 나중에 연산) , == 같냐
		result2 = (a < b);
		result3 = (a > b);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
