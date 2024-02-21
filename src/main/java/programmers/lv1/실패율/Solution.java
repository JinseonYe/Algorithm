package programmers.lv1.실패율;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public int[] solution(int[] answers) {
		int[] first = {1,2,3,4,5};
		int[] second = {2,1,2,3,2,4,2,5};
		int[] third = {3,3,1,1,2,2,4,4,5,5};

		int[] score = new int[3];
		List<Integer> temp = new ArrayList<>();
		int[] answer = new int[score.length];

		for (int i = 0; i < answers.length; i++) {
			if(first[i] == answers[i]) {
				score[0]++;
			}
		}

		for (int i = 0; i < answers.length; i++) {
			if(second[i] == answers[i]) {
				score[1]++;
			}
		}

		for (int i = 0; i < answers.length; i++) {
			if(third[i] == answers[i]) {
				score[2]++;
			}
		}

		for (int i = 0; i < score.length-1; i++) {
			if(score[i] > score[i+1]) {
				temp.add(i+1);
			} else if(score[i] == score[i+1]) {
				temp.add(i+1);
				temp.add(i+2);;
			}
		}

		return answer;
	}
}