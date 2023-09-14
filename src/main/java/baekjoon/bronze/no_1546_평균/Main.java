package baekjoon.bronze.no_1546_평균;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < arr.length; i++) {
			double score = Double.parseDouble(st.nextToken());
			arr[i] = score;
		}

		Arrays.sort(arr);
		double max = arr[arr.length-1];

		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			double newScore = arr[i]/max*100;
			sum += newScore;
		}

		double average = sum/n;

		bw.write(String.valueOf(average));

		bw.flush();
		bw.close();
	}
}
