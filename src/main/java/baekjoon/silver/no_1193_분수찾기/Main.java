package baekjoon.silver.no_1193_분수찾기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int line = 1;
		int sum = 0;

		while (true) {
			if (X <= sum + line) {

				if (line % 2 == 1) {
					System.out.println((line - (X - sum - 1)) + "/" + (X - sum));
					break;
				} else {
					System.out.println((X - sum) + "/" + (line - (X - sum - 1)));
					break;
				}
			} else {
				sum += line;
				line++;
			}
		}
	}
}
