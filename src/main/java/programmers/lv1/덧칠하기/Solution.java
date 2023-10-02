package programmers.lv1.덧칠하기;

public class Solution {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		answer ++;

		for (int a : section) {
			if (section[0] + m > a) {
				continue;
			}

			section[0] = a;
			answer ++;
		}
		return answer;
	}
}
