package programmers.lv1.기사단원의_무기;

import java.util.ArrayList;
import java.util.List;
public class Solution {
	public static int solution(int number, int limit, int power) {
		int answer = 0;

		for (int i = 1; i <= number; i++) {
			int count = 0;
			for (int j = 1; j * j <= i; j++) {
				if (j * j == i) {
					count++;
				} else if (i % j == 0) {
					count += 2;
				}
			}
			answer += count > limit ? power : count;
		}
		return answer;
	}
}
