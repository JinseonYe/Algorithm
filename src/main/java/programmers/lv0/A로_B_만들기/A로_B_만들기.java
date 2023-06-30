package programmers.lv0.A로_B_만들기;

import java.util.Arrays;

class Solution {
	public int solution(String before, String after) {
		char[] arr1 = before.toCharArray();
		char[] arr2 = after.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		before = new String(arr1);
		after = new String(arr2);

		return before.equals(after) ? 1 : 0;
	}
}
