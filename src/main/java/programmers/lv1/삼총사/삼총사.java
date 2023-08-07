package programmers.lv1.삼총사;

public class 삼총사 {
	class Solution {
		public int solution(int[] number) {
			int answer = 0;
			for (int i=0; i<number.length; i++) {
				int one = number[i];
				for (int j=number.length-1; j>i+1; j--) {
					int twe = number[j];
					for (int k=j-1; k>i; k--) {
						int three = number[k];
						if(one+twe+three == 0) {
							answer++;
						}
					}
				}
			}
			return answer;
		}
	}
}
