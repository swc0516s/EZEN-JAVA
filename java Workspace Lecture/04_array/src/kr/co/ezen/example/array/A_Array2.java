package kr.co.ezen.example.array;

public class A_Array2 {

	public void method1() {
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println(arr);
		System.out.println("arr의 개수:" + arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("==========");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void method2() {
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		arr[3] = 40000;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public void method3() {
		String str = "The String class"; // 문자열을 힙에 만들고 str에 저장함
		System.out.println("str[0]=" + str.charAt(0));
		System.out.println("str:" + str);
		System.out.println("str:" + str.hashCode()); // 메모리 주소에 대한 것을 숫자로 표시. 결국엔 주소라는 얘기

		// 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 넣어주는 메서드
		// String(문자열)을 char형 배열로 대입

		for (int i = 0; i < str.length(); i++) {
			char[] ch = new char[str.length()];
			ch[i] = str.charAt(i);
			System.out.println("char타입 ch의 [" + i + "] 값은 " + ch[i]);
		}

		char[] arr_ch = str.toCharArray();

		for (int i = 0; i < arr_ch.length; i++) {
//			System.out.println("arr_ch의 [" + i + "] 값은 " + arr_ch[i]);
			System.out.printf("%c %d번째\n", arr_ch[i], i);
		}
		System.out.println("arr_ch.length=" + arr_ch.length);
		System.out.println("==================");
		System.out.println("10번째 문자:" + arr_ch[9]);
		// 배열은 접근해서 바꿀 수 있지만 문자열(String)은 값을 바꿀 순 없음
		// 배열은 힙에 ㅁㅁㅁㅁㅁㅁ.. 문자열은 그대로 "~~"

		// 문자열은 메모리상에 힙이라는 곳에 만들어진다.
		// 문자열은 우리가 수정을 할 수 없다.
		// 그렇지만 내부적으로는 얘도 배열구조로 저장이 되기 때문에
		// 문자열에대해서 특정 위치를 지정해주면 값 출력이 가능하다.
	}

	public void method4() {
		String str = "The String class";
		char[] arr_cnt = str.toCharArray();

		int LCNT = 0;
		int UCNT = 0;

		for (int i = 0; i < arr_cnt.length; i++) {
			if (Character.isLowerCase(arr_cnt[i])) {// i번째가 소문자면 true, 아니면 false // 첫글자가 대문자로 시작하는 것 = 클래스라고 보면 됨
				LCNT++; // 소문자라면 얘를 실행ㅇㅇ if문이니까
			} else if (Character.isUpperCase(arr_cnt[i])) {
				UCNT++;
			}
		}
		System.out.println("대문자의 개수는:" + UCNT + " 소문자의 개수는:" + LCNT);
	}

}
