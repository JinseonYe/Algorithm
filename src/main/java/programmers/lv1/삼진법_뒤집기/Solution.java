package programmers.lv1.삼진법_뒤집기;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        String str = "";
        String totalStr = "";
        while (n > 0) {
            str = Long.toString(n % 3);
            sb.append(str);
            n = n / 3;
        }
        totalStr = sb.toString();
        n = Long.parseLong(totalStr);
        long a = 0;
        while (n > 0) {
            if (a == 0) {
                answer += n % 10 * 1;
                a = 1;
            } else {
                answer += n % 10 * a * 3;
                a *= 3;
            }
            n = n / 10;
        }
        return answer;
    }
}
