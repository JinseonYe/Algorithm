package programmers.lv1.두_개_뽑아서_더하기;

import java.util.ArrayList;
import java.util.Arrays;

public class 두_개_뽑아서_더하기 {
	public int[] solution(int[] numbers) {
		int[] answer;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j <numbers.length; j++) {
				int temp = numbers[i] + numbers[j];
				if(!list.contains(temp)) {
					list.add(temp);
				}
			}
		}

		answer = new int[list.size()];

		int size = 0;
		for (int num : list) {
			answer[size++] = num;
		}
		Arrays.sort(answer);
		return answer;
	}
}
