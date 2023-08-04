package programmers.lv0.세_개의_구분자;

import java.util.ArrayList;

public class 세_개의_구분자 {
	class Solution {
		public String[] solution(String myStr) {
			String[] answer = {};
			String[] removeABC  = myStr.split("[a,b,c]");
			ArrayList<String> listRemoveABC = new ArrayList<>();

			for(int i=0; i<removeABC.length; i++){
				if(!removeABC[i].equals("")){
					listRemoveABC.add(removeABC[i]);
				}
			}

			if(listRemoveABC.size() == 0) listRemoveABC.add("EMPTY");
			answer = listRemoveABC.toArray(new String[0]);

			return answer;
		}
	}
}
