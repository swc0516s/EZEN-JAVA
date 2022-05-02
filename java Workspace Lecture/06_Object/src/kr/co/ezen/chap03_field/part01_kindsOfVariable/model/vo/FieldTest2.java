package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

//class FieldTest2 { // 같은 패키지 내에서는 public가 없어도 기본값이 퍼블릭. 다른 패키지에서는 접근할 수 없음 .!!!!
public class FieldTest2 {
	public String pubA = "public";
	String defB = "default"; // default
	private String priC = "private";

	public static String pubSta = "public static";
	private static String priSta = "private static";

	public FieldTest2() {

	}

	// get 가져오다 // getter
	// set 저장하다 // setter
	// 빈 공간 우클릭 - 소스 -제네레이트 게터 세터
	public String getPubA() { // 첫글자가 대문자로 바뀜
		return pubA;
	}

	public void setPubA(String pubA) {
		this.pubA = pubA;
	}

	public String getDefB() {
		return defB;
	}

	public void setDefB(String defB) {
		this.defB = defB;
	}

	public String getPriC() {
		return priC;
	}

	public void setPriC(String priC) {
		this.priC = priC;
	}

	public static String getPubSta() {
		return pubSta;
	}

	public static void setPubSta(String pubSta) {
		FieldTest2.pubSta = pubSta;
	}

	public static String getPriSta() {
		return priSta;
	}

	public static void setPriSta(String priSta) {
		FieldTest2.priSta = priSta;
	}

}
