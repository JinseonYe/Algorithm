package programmers.lv1.없는_숫자_더하기;

public class 없는_숫자_더하기 {
	public int solution(int[] numbers) {
		int answer = 0;
		int sum =0;
		int total = 0;
		for(int i = 0; i<10; i++) {
			sum+=i;
		}

		for(int i = 0; i<numbers.length; i++) {
			total += numbers[i];
		}
		answer = sum - total;


		return answer;
	}
}
