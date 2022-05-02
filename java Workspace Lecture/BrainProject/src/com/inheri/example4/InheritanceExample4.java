package com.inheri.example4;

class B1 {
	int x;
}

class B2 extends B1 {
	String x;
}

public class InheritanceExample4 {

	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.x = "Java";
		System.out.println("b2에 있는 x값:" + b2.x);

//		b2.x = 100; //error
//		System.out.println("b2에 있는 x값:"+b2.x);

		B1 b1 = new B1();
		b1.x = 5000;
		System.out.println("b1에 있는 x값:" + b1.x);
	}

}
