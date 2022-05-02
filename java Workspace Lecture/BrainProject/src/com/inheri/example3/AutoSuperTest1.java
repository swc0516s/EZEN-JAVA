package com.inheri.example3;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		// Point(x,y);(x)
//		this.x = x;
//		this.y = y;
		this.z = z;
//		super(x, y);(x)
	}

	String getLocation() {
		return "x:" + x + ",y:" + y + ",z:" + z;
	}

}

public class AutoSuperTest1 {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);

		System.out.println(p3.getLocation());

	}

}
