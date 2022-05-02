package kr.co.ezen.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
//얕은복사, 깊은복사
	public void method1() {

		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = originArr; // 얕은 복사 : // 배열의 주소만 복사
// 같은 주소값이 나옴, copyArr도 같은 1,2,3,4,5를 가르킴.

		System.out.println("originArr:" + originArr);
		System.out.println("copyArr:" + copyArr);
		System.out.println("originArr:" + originArr.hashCode());
		System.out.println("copyArr:" + copyArr.hashCode());

		String str = "";

		for (int i = 0; i < originArr.length; i++) { // i가 4가 될때까지 ++ = 0,1,2,3,4
			if (i != originArr.length - 1) { // i가 4가 아니라면 (5-1)
				str += originArr[i] + ","; // str에 originArr 배열값을 더하고 뒤에 ","
			} else {
				str += originArr[i]; // i가 4라면 끝
			}

		}
		System.out.println("originArr:" + str); // originArr: 1,2,3,4,5

		str = ""; // str값을 다시 클리어

		for (int i = 0; i < copyArr.length; i++) { // 같은 작업을 이번엔 copyArr로
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}
		}

		System.out.println("copyArr:" + str);
		originArr[0] = 99;

		str = "";

		for (int i = 0; i < originArr.length; i++) {
			if (i != originArr.length - 1) {
				str += originArr[i] + ",";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr:" + str);

		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr:" + str);

		System.out.println("originArr의 hashcode:" + originArr.hashCode());
		System.out.println("copyArr의 hashcode:" + copyArr.hashCode());
	}

	public void method2() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[5]; // java에서의 new 는 무조건 '힙'에 만든다~
		// 깊은 복사: 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사

		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = originArr[i];

			System.out.println(copyArr[i]);
		}

		String str = "";

		for (int i = 0; i < originArr.length; i++) {
			if (i != originArr.length - 1) {
				str += originArr[i] + ",";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr:" + str);

		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr:" + str);

		originArr[0] = 99;

		str = "";

		for (int i = 0; i < originArr.length; i++) {
			if (i != originArr.length - 1) {
				str += originArr[i] + ",";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr:" + str);

		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}
		}

		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr:" + str);

		System.out.println(originArr);
		System.out.println(copyArr);
		System.out.println("originArr의 hashcode:" + originArr.hashCode());
		System.out.println("copyArr의 hashcode:" + copyArr.hashCode());

	}

	public void method3() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[10];

		System.arraycopy(originArr, 0, copyArr, 3, originArr.length); // 복사할소스, 어디부터, 복사받을소스, 어디부터, 어디까

		String str = "";

		for (int i = 0; i < originArr.length; i++) {
			if (i != originArr.length - 1) {
				str += originArr[i] + ",";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr:" + str);

		str = "";
		for (int i = 0; i < copyArr.length; i++) {
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}

		}
		System.out.println("copyArr:" + str);

		System.out.println("originArr의 hashcode:" + originArr.hashCode());
		System.out.println("copyArr의 hashcode:" + copyArr.hashCode());
	}

	public void method4() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[10];

		String str = "";

		for (int i = 0; i < originArr.length; i++) {
			if (i != originArr.length - 1) {
				str += originArr[i] + ",";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);

		copyArr = Arrays.copyOf(originArr, originArr.length); // 복사할 원본 , 복사할 원본의 길이

		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}

		}
		System.out.println("copyArr : " + str);
		System.out.println("copyArr : " + copyArr);
		System.out.println("copyArr:" + Arrays.toString(copyArr)); // Arrays.toString 앞으로 많이 쓸거임

		System.out.println("originArr의 hashcode:" + originArr.hashCode());
		System.out.println("copyArr의 hashcode:" + copyArr.hashCode());

	}

	public void method5() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[10];

		System.out.println("originArr 배열주소:" + originArr.hashCode());
		System.out.println("준비된 복사본 배열의 주소:" + copyArr.hashCode());
		copyArr=originArr.clone();
		System.out.println("복사된 배열의 주소:"+copyArr.hashCode());
		
		String str = "";

		for (int i = 0; i < originArr.length; i++) {
			if (i != originArr.length - 1) {
				str += originArr[i] + ",";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr:" + str);

		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			if (i != copyArr.length - 1) {
				str += copyArr[i] + ",";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr:" + str);

	}
}
