package baekjoon.bronze.no2739_구구단;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			int result = n * i;
			System.out.println(n + " * " + (i) + " = " + result);
		}
	}
}
