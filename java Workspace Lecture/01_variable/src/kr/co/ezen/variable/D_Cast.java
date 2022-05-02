package kr.co.ezen.variable;

public class D_Cast {

	public void rule1() { // 메서드는 하나의 독립된 공간이다.
		boolean flag = true; // true or false 값만.
//		flag = 100; //타입 불일치 = 에러
		int num = 'A';
//		char num = 'A'; // 동일 변수 명 xxx
//		char num2 = 'A';
		System.out.println("num:" + num); // 65
		// System.out.println("num:" + num2); // A
		// 같은 'A'지만 int, char로 타입을 다르게 선언해서.

		char ch = 97;
		System.out.println("ch:" + ch);

		int num2 = -97; // 한번 정한 변수 타입은 절대 변하지 않음.
		System.out.println("num2:" + num2);

		char ch3 = (char) num2; // 강제형변환 이 라인에서만 형변환. // num2가 int타입인데 char에 넣으려 해서.
		System.out.println("ch3:" + ch3);
	}

	public void rule2() {
//		int num = 10;
		int inum = 10;
		long lnum = 100;

//		int sum = inum + lnum; // int(4)+ling(8) ==> long 큰 타입을 따라감.

		int isum = (int) (inum + lnum); // 강제 casting (변환)
		System.out.println("isum:" + isum);

		int isum2 = inum + (int) lnum; // 이번엔 long타입만 int로 형변환
		System.out.println("isum2:" + isum2);

		byte bnum = 1; // 1byte
		short snum = 2; // 2byte

		short sum = (short) (bnum + snum); // byte와 short의 연산 결과는 int(4byte) 그래서 둘 다 묶어줘야
		System.out.println(sum);

		int sum2 = bnum + snum;
		System.out.println(sum2);
	}

	public void rule3() {
		long lnum = 100; 
		float fnum = lnum; // 정수는 실수로 자동 형변환된다. 
		System.out.println("fnum:" + fnum); // 정수보다 실수가 크다. 라고 알고있기.

		double dnum = 10.5;
		int inum = (int) dnum; // 실수가 무조건 더 큰데 정수에 넣으려 하니 에러, 그래서 (int)를 붙여줌.
		System.out.println("inum:" + inum);
	}
}
