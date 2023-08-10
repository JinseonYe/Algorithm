package programmers.lv1.숫자_문자열과_영단어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 숫자_문자열과_영단어 {
	public int solution(String s) {
		int answer = 0;
		Map<String, String> word = new HashMap<String, String>();

		word.put("zero", "0");
		word.put("one", "1");
		word.put("two", "2");
		word.put("three", "3");
		word.put("four", "4");
		word.put("five", "5");
		word.put("six", "6");
		word.put("seven", "7");
		word.put("eight", "8");
		word.put("nine", "9");

		ArrayList<String> sList = new ArrayList<>();

		StringBuilder currentWord = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				sList.add(Character.toString(c));
			} else {
				currentWord.append(c);
				if (word.containsKey(currentWord.toString())) {
					sList.add(word.get(currentWord.toString()));
					currentWord.setLength(0);
				}
			}
		}

		int[] answerArray = new int[sList.size()];
		for (int i = 0; i < sList.size(); i++) {
			answerArray[i] = Integer.parseInt(sList.get(i));
		}

		for (int num : answerArray) {
			answer *= 10;
			answer += num;
		}

		return answer;
	}
}
