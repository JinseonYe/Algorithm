package programmers.lv1.부족한_금액_계산하기;

public class 부족한_금액_계산하기 {
	public long solution(long price, long money, long count) {
		long temp = 0;
		for(int i = 1; i <= count; i++)
		{
			temp += i * price;
		}

		if (temp > money)
			return temp-money;

		else return 0;

	}
}
