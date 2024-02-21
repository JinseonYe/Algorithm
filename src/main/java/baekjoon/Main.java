package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9};

		for (int i = 0; i < 9; i++) {
			if (num[i] == 1 || num[i] == 2 || num[i] == 3 || num[i] == 4) {
				System.out.println("Ye");
			} else if (num[i] == 5 || num[i] == 6 || num[i] == 7 ) {
				System.out.println("Jinseon");
			} else if (num[i] == 8 || num[i] == 9) {
				System.out.println("YeJinseon");
			}
		}
	}
}
