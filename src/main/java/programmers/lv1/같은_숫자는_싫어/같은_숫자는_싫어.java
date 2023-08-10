package programmers.lv1.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 같은_숫자는_싫어 {
	public int[] solution(int []arr) {
		ArrayList<Integer> uniqueValue = new ArrayList<>();
		for (int i=0; i<arr.length; i++) {
			if (i+1 < arr.length) {
				if (arr[i] != arr[i+1]) {
					uniqueValue.add(arr[i]);
				}
			} else {
				uniqueValue.add(arr[i]);
			}
		}
		int[] answer = new int[uniqueValue.size()];
		for (int i = 0; i < uniqueValue.size(); i++) {
			answer[i] = uniqueValue.get(i);
		}

		return answer;
	}
}
