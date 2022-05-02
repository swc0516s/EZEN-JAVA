package kr.co.ezen.chap01.encapsulation.model.vo;

public class Account {
	// 클래스 : 내가 만든 설계도(실체가 아니다, 실체가 되려면 메모리에 만들어 져야 한다.(new ~))

	private String name = "홍길동"; // praivate : 외부로 부터 보호(
	private String accNo = "110-1121-13123"; // 클래스 안에서 선언한 변수 field (전역 변수:global variable)
	private String pwd = "1234";
	private int backCode = 20;
	private int balance = 0;
//	private int balance = 100;

	//@formatter:off
	/*
	 * public String name = "홍길동";
	 * public String accNo = "110-1121-13123";
	 * public String pwd = "1234"; 
	 * public int backCode = 20;
	 * public int balance = 0;
	 */
	//@formatter:on

	// 생성자(객체를 생성하기 위한 메서드)
	public Account() { // 클래스 이름과 같다, public :private의 반대

	}

	// 입금을 위한 메서드(기능:(다른 언어에서는)함수)
	public void deposit(int money) { // 메서드 (매개 변수) : 매개 변수 : 외부로 부터 값을 전달 받는 변수
		// void : 메서드는 일을 처리하고 결과 값을 반환 하거나 안할 수도 있다.
		// int balance = 100; // 메서드에서 선언한 변수 local variable(사용범위 : 해당 메서드 안에서만 가능)
		// 지역 변수가 전역 변수보다 우선한다.
		if (money > 0) {
			balance += money;
		} else {
			System.out.println("잘못된 금액이 입금 되었습니다.");
		}


	}

	// 출금을 위한 메서드
	public void withdraw(int money) {
		// 출금할 돈이 잔액 보다 작다면
		if (money < balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}

	}

	// 잔액 조회를 위한 메서드
	public void displayBalance() {

		System.out.println(name + "님의 계좌 잔액은 " + balance + "원 입니다.");

	}

}
