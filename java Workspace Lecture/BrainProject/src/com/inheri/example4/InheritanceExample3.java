package com.inheri.example4;

class AA {
	int i;
	private int j; // 상속되지 않는다.

	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

class BB extends AA {
	int total;

	void sum() {
//		total = i + j; // error
	}
}

public class InheritanceExample3 {

	public static void main(String[] args) {
		BB subOb = new BB();
		subOb.sum();

	}

}
