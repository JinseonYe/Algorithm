package programmers.lv1.포켓몬;

import java.util.HashSet;

public class 포켓몬 {
	public int solution(int[] nums) {
		int answer = 0;
		int n = nums.length/2;

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
			hashSet.add(nums[i]);
		}
		if(n < hashSet.size()) answer = n;
		else answer = hashSet.size();
		return answer;
	}
}
