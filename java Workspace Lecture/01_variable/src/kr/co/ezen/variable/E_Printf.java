package kr.co.ezen.variable;

public class E_Printf {

	public void printMethod() {
		System.out.println('a');
		System.out.printf("%c\n", 'a'); // print'f'(format 형식) \n 줄바꿈
		System.out.printf("%c %c\n", 'a', 'b');
		System.out.printf("%3c %5c", 'a', 'b');
		System.out.println(); // 줄바꿈 용도로 쓰려면 내용 없이
		System.out.printf("%10s %5d %5d %5d\n", "abc", 100, 99, 98);
		System.out.printf("표시할 수 있는 글자:%10s %f %10.2f\n", "★", 10.95, 10.975);

	}
}
