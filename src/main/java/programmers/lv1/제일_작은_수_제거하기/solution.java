package programmers.lv1.제일_작은_수_제거하기;

import java.util.Arrays;

public class solution {
    public int[] solution(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			return new int[]{-1};
		} else {
			int[] answer = new int[arr.length-1];
			int count = 0;
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				min = Math.min(min, arr[i]);
			}

			for (int i = 0; i < arr.length; i++) {
				if(min == arr[i]){
					continue;
				} else{
					answer[count] = arr[i];
					count += 1;
				}
			}
			return answer;
		}
    }
}
