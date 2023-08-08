package programmers.lv1.하샤드_수;

import java.util.stream.Stream;

public class 하샤드_수 {
	public boolean solution(int x) {
		boolean answer = true;
		int[] xList = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
		int sum = 0;
		for (int i=0; i<xList.length; i++) {
			sum += xList[i];
		}
		if (x % sum !=0) {
			answer = false;
		}
		return answer;
	}
}
