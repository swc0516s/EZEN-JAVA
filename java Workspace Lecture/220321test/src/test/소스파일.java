package test;

import java.util.ArrayList;

public class 소스파일 {

	public static void main(String[] args) {
		// 강호동 박명수 유재석 홍길동 / 135 150 135 190/ 3 2 3 1
		String[] name = { "홍길동", "강호동", "유재석", "박명수" };
		int[] kor = { 60, 70, 80, 90 };
		int[] eng = { 75, 80, 55, 100 };
		int[] rank = { 1, 1, 1, 1 };

		ArrayList<String> nameArr = new ArrayList<>();
		ArrayList<Integer> korArr = new ArrayList<>();
		ArrayList<Integer> engArr = new ArrayList<>();
		ArrayList<Integer> score = new ArrayList<>();
		for (int i = 0; i < name.length; i++) {
			nameArr.add(name[i]);
			korArr.add(kor[i]);
			engArr.add(eng[i]);
			score.add(korArr.get(i) + engArr.get(i));
		}

		System.out.println("==이름, 총점, 순위 출력 (이름순 출력)==");
		// nameArr.sort(Comparator.naturalOrder());

		for (int i = 0; i < name.length; i++) {
			System.out.print("이름:" + nameArr.get(i) + ", ");
			System.out.print("총점:" + score.get(i) + ", ");
			for (int j = 0; j < name.length; ++j) {
				if (score.get(i) < score.get(j))
					++rank[i];
			}

			System.out.println("순위:" + rank[i]);
		}

		// 이름순 정렬 구현 못하였음.

	}
}