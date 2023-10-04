package programmers.lv1.키패드_누르기;

public class Solution {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		int left = 10;
		int right = 12;

		StringBuilder sb = new StringBuilder();

		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7) {
				sb.append("L");
				left = number;
			} else if (number == 3 || number == 6 || number == 9) {
				sb.append("R");
				right = number;
			} else {
				if (number == 0) {
					number = 11;
				}
				int leftDist = Math.abs(number - left) / 3 + Math.abs(number - left) % 3;
				int rightDist = Math.abs(number - right) / 3 + Math.abs(number - right) % 3;

				if (leftDist < rightDist) {
					sb.append("L");
					left = number;
				} else if (leftDist > rightDist) {
					sb.append("R");
					right = number;
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						left = number;
					} else {
						sb.append("R");
						right = number;
					}
				}
			}
		}
		answer = sb.toString();

		return answer;
	}
}
