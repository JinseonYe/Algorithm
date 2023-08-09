package programmers.lv1.핸드폰_번호_가리기;

public class 핸드폰_번호_가리기 {
	public static String solution(String phone_number) {
		String answer = "";
		String hidenPhoneNumber = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
		String phoneNumber = phone_number.substring(phone_number.length()-4,phone_number.length());
		answer = hidenPhoneNumber + phoneNumber;
		return answer;
	}
}
