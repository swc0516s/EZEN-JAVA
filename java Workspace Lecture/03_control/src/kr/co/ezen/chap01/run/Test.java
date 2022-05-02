package kr.co.ezen.chap01.run;
 
public class Test {

	public static void main(String[] args) { // main()도 결국 method
		int a = 10;
		int b = 0;
		int c;
		

		if (a < 5)
			b = 10;
		int d = 0;

		System.out.println(b); // 0
		System.out.println(d); // 0

		if (a > 5) {
			int e = 100; // local variable (지역 변수 ) 괄호 안에서 만들어진건 괄호 안에서
			System.out.println(e);
		}
		//System.out.println(e); //error

	}

}
