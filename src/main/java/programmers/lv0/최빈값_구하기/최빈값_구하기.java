package programmers.lv0.최빈값_구하기;

public class 최빈값_구하기 {
	public int solution(int[] array) {
		int answer = array[0];
		int[] frequent = new int[1000];
		int max = 0;
		int maxOverlap = 0;
		for (int i = 0; i < array.length; i++) {
			frequent[array[i]]++;

			if (max < frequent[array[i]]) {
				max = frequent[array[i]];
				answer = array[i];
			}
		}
		for (int j = 0; j < frequent.length; j++) {
			if (max == frequent[j]) {
				maxOverlap++;
			}
			if (maxOverlap > 1) {
				answer = -1;
			}
		}
		return answer;
	}
}
