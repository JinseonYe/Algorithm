package programmers.lv1.카드_뭉치;

public class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "";
		int cards1Index = 0;
		int cards2Index = 0;

		for (String goalWord : goal) {
			if(cards1Index < cards1.length && cards1[cards1Index].equals(goalWord)) {
				cards1Index++;
			} else if(cards2Index < cards2.length && cards2[cards2Index].equals(goalWord)) {
				cards2Index++;
			} else {
				answer = "No";
				break;
			}
			answer = "Yes";
		}
		return answer;
	}
}
