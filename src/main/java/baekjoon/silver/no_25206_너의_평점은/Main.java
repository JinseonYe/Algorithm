package baekjoon.silver.no_25206_너의_평점은;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 학점 * 과목평점
		double multiplyCreditAndGrade = 0;
		// 총학점
		double totalCredit = 0;

		for (int i = 0; i < 20; i++) {

			String name = scanner.next();
			double credit = scanner.nextDouble();
			String grade = scanner.next();

			if (grade.equals("A+")){
				multiplyCreditAndGrade += credit * 4.5;
				totalCredit += credit;
			} else if (grade.equals("A0")) {
				multiplyCreditAndGrade += credit * 4.0;
				totalCredit += credit;
			}else if (grade.equals("B+")) {
				multiplyCreditAndGrade += credit * 3.5;
				totalCredit += credit;
			}else if (grade.equals("B0")) {
				multiplyCreditAndGrade += credit * 3.0;
				totalCredit += credit;
			}else if (grade.equals("C+")) {
				multiplyCreditAndGrade += credit * 2.5;
				totalCredit += credit;
			}else if (grade.equals("C0")) {
				multiplyCreditAndGrade += credit * 2.0;
				totalCredit += credit;
			}else if (grade.equals("D+")) {
				multiplyCreditAndGrade += credit * 1.5;
				totalCredit += credit;
			}else if (grade.equals("D0")) {
				multiplyCreditAndGrade += credit * 1.0;
				totalCredit += credit;
			}else if (grade.equals("F")) {
				multiplyCreditAndGrade += credit * 0.0;
				totalCredit += credit;
			}
		}

		System.out.printf("%.6f", multiplyCreditAndGrade / totalCredit);
	}
}