package kr.co.ezen.chap01.encapsulation.model.vo;

public class Account {
	// Ŭ���� : ���� ���� ���赵(��ü�� �ƴϴ�, ��ü�� �Ƿ��� �޸𸮿� ����� ���� �Ѵ�.(new ~))

	private String name = "ȫ�浿"; // praivate : �ܺη� ���� ��ȣ(
	private String accNo = "110-1121-13123"; // Ŭ���� �ȿ��� ������ ���� field (���� ����:global variable)
	private String pwd = "1234";
	private int backCode = 20;
	private int balance = 0;
//	private int balance = 100;

	//@formatter:off
	/*
	 * public String name = "ȫ�浿";
	 * public String accNo = "110-1121-13123";
	 * public String pwd = "1234"; 
	 * public int backCode = 20;
	 * public int balance = 0;
	 */
	//@formatter:on

	// ������(��ü�� �����ϱ� ���� �޼���)
	public Account() { // Ŭ���� �̸��� ����, public :private�� �ݴ�

	}

	// �Ա��� ���� �޼���(���:(�ٸ� ������)�Լ�)
	public void deposit(int money) { // �޼��� (�Ű� ����) : �Ű� ���� : �ܺη� ���� ���� ���� �޴� ����
		// void : �޼���� ���� ó���ϰ� ��� ���� ��ȯ �ϰų� ���� ���� �ִ�.
		// int balance = 100; // �޼��忡�� ������ ���� local variable(������ : �ش� �޼��� �ȿ����� ����)
		// ���� ������ ���� �������� �켱�Ѵ�.
		if (money > 0) {
			balance += money;
		} else {
			System.out.println("�߸��� �ݾ��� �Ա� �Ǿ����ϴ�.");
		}


	}

	// ����� ���� �޼���
	public void withdraw(int money) {
		// ����� ���� �ܾ� ���� �۴ٸ�
		if (money < balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}

	}

	// �ܾ� ��ȸ�� ���� �޼���
	public void displayBalance() {

		System.out.println(name + "���� ���� �ܾ��� " + balance + "�� �Դϴ�.");

	}

}
