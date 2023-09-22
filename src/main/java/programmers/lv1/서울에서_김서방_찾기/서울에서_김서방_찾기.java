package programmers.lv1.서울에서_김서방_찾기;

public class 서울에서_김서방_찾기 {
	public String solution(String[] seoul) {
		String answer = "";

		int x = 0;

		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				x = i;
			}
		}
		answer = "김서방은 " + x + "에 있다";
		return answer;
	}
}
