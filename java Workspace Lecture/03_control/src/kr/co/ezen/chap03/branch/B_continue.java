package kr.co.ezen.chap03.branch;

public class B_continue {

	public void method1() {
		int sum = 0;

		for (int k = 1; k < 101; k++) { // 4의 배수를 제외한 나머지 수의 합
			if (k % 4 == 0) // 4의 배수 체크 / 실행문이 한줄일땐 중괄호 생략 가능
				continue;
			System.out.print(k + "+");
			sum += k;
		}
		System.out.println(); // 줄 넘겨주고
		System.out.println("sum:" + sum);

	}

	public void method2() {
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("=======" + dan + "단=======");
			for (int su = 1; su < 10; su++) {
				if (dan % 2 == 0 || su % 2 == 0)
					continue;
				System.out.println(dan + "*" + su + "=" + (dan * su));
			}
			System.out.println();
		}

	}
}
