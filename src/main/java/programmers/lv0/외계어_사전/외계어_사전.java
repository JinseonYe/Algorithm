package programmers.lv0.외계어_사전;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 외계어_사전 {
	class Solution {
		public int solution(String[] spell, String[] dic) {
			boolean wordCheck = false;
			for (int i=0; i<dic.length; i++){
				int correct = 0;
				for (int j=0; j<spell.length; j++){
					if(dic[i].length() == spell.length && dic[i].contains(spell[j])) {
						correct++;
					}
					if(correct == spell.length) {
						wordCheck = true;
						break;
					}
				}
			}
			return wordCheck ? 1 : 2;
		}
	}
}
