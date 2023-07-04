package programmers.lv0.치킨_쿠폰;

class Solution {
	public int solution(int chicken) {
		int answer = 0;
		int coupon = 0;
		int serviceChicken = 0;

		for (int i = 0; i < chicken; i++) {
			coupon++;
			if(coupon/10 != 0 && coupon%10 == 0) {
				serviceChicken++;
				chicken++;
			}
			answer = serviceChicken;
		}
		return answer;
	}
}
