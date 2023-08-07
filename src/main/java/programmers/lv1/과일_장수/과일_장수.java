package programmers.lv1.과일_장수;

import java.util.Arrays;

public class 과일_장수 {
	public static void main(String[] args) {
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		solution(4, 3, score);
	}

	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		int box = score.length/m;

		for (int i=1; i<=box; i++) {
			int price = score[score.length-(m*i)]*m;
			answer += price;
		}
		return answer;
	}
}
