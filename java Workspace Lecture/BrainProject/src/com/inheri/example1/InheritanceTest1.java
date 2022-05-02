package com.inheri.example1;
/*
 *  상속(Inheritance)
 * 
 *  1. 상속은 모듈의 재사용과 코드의 간결성 제
 *  2. 상위 클래스의 모든 요소를 상속받고 추가적으로 더 가지는 확장(extend)개
 *  3. 상위 클래스를 지정하기 위해 extends예약어 사용
 *  4. 모든 자바 프로그램을 상위 클래스를 가진다. (상위 클래스를 지정하지 않으면 Object클래스가 묵시적인 상위 클래스)
 *  5. 자바의 최상위 클래스는 Object클래스(java.leng.Object) 
 */

class A {
	int aa = 1;

}

class B extends A {
	int bb = 2;
}

class C extends B {
	int cc = 3;
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		C objc = new C();

		System.out.println("objce객체의 객체 속성 변수 aa의 값은:" + objc.aa);
		System.out.println("objce객체의 객체 속성 변수 aa의 값은:" + objc.bb);
		System.out.println("objce객체의 객체 속성 변수 aa의 값은:" + objc.cc);
	}

}
