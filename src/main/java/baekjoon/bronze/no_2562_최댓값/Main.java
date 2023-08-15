package baekjoon.bronze.no_2562_최댓값;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		int count = 0;
		int max = 0;
		int index = 0;

		for (int value: n) {
			count++;

			if (value > max) {
				max = value;
				index = count;
			}
		}

		System.out.println(max + "\n" + index);
	}
}
