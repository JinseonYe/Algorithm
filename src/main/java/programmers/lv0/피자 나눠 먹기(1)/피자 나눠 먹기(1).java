class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n % 7 == 0)
            answer = n / 7;
        else
            answer = n / 7 +1;

        return answer;

        // n-1을 7로 나눠서 나온 몫 +1을 리턴하기
    }
}