package programmers.lv1.시저_암호;

import java.util.ArrayList;

public class 시저_암호 {
	public String solution(String s, int n) {

		String answer = "";

		ArrayList<Character> upperCaseList = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			upperCaseList.add((char) ('A' + i));
		}

		ArrayList<Character> lowerCaseList = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			lowerCaseList.add((char) ('a' + i));
		}

		char[] sArray = s.toCharArray();

		for (int i = 0; i < sArray.length; i++) {
			if (upperCaseList.contains(sArray[i])) {
				int index = upperCaseList.indexOf(sArray[i]);
				int shiftedIndex = (index + n) % 26;
				sArray[i] = upperCaseList.get(shiftedIndex);
			} else if (lowerCaseList.contains(sArray[i])) {
				int index = lowerCaseList.indexOf(sArray[i]);
				int shiftedIndex = (index + n) % 26;
				sArray[i] = lowerCaseList.get(shiftedIndex);
			}
		}

		answer = new String(sArray);
		return answer;
	}
}
