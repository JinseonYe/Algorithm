package programmers.lv0.최댓값_만들기_2;

import java.util.Arrays;

public class 최댓값_만들기_2 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int num1 = numbers[numbers.length-1];
		int num2 = numbers[numbers.length-2];
		int num3 = numbers[0];
		int num4 = numbers[1];
		int answer1 = num1 * num2;
		int answer2 = num3 * num4;
		int answer = 0;
		if (answer1 >= answer2) {
			answer = answer1;
		} else if (answer2 >= answer1) {
			answer = answer2;
		}
		return answer;
	}
}
