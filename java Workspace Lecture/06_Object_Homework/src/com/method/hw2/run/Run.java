package com.method.hw2.run;

import com.method.hw2.sample.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		NonStaticSample ns = new NonStaticSample();
		// 1.intArrayAllocation() : ũ�Ⱑ 5�� �迭�� ������ 1���� 100������ ���� ��ϵ� �迭 �ޱ�

		int arr[] = ns.intArrayAllocation(5);

		// 2. display() : ���� �迭 ����ϱ�
		System.out.println("ũ�Ⱑ 5�� �迭�� ������:");
//		for(int ar: arr)
//			System.out.print(ar+" ");

		ns.display(arr);

		// 3. swap() : ��ȯ, 4.sortDescending() : �������� ���
		System.out.println("�������� ���:");
		ns.sortDesecending(arr);

		// 5. sortAscending() : �������� ���� swap() display()
		System.out.println("�������� ���:");
		ns.sortAscending(arr);

		// 6. countChar() : "apple" ���ڿ��� 'p'������ ����
		System.out.println("apple���ڿ��� 'p'�� ����:" + ns.countChar("apple", 'p'));

		// 7. totalValue() : 13�� 7������ �������� �հ�
		System.out.println("13�� 7������ �������� �հ�:" + ns.totalValue(13, 7)); // 8, 9, 10, 11 ,12 �� ��

		// 8. pCharAt() : "programming"���ڿ��� 3�� �ε��� ����
		System.out.println("programming ���ڿ��� 3�� �ε��� ����:" + ns.pCharAt("programming",3));
		
		// 9. pConcat() : "JAVA"���ڿ��� "programming"���ڿ��� ��ģ ��� 
		System.out.println("JAVA�� programming�� ��ģ ���ڿ�:"+ns.pConcat("JAVA","programming"));
	}

}
