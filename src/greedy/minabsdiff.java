package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class minabsdiff {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		String[] inputString = br.readLine().trim().split(" ");

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(inputString[i]);
		}

		System.out.println(minAbsoluteDiff(arr, n));
	}

	private static int minAbsoluteDiff(int[] arr, int n) {
		// TODO Auto-generated method stub

		Arrays.sort(arr);
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++)
			if (Math.abs(arr[i + 1] - arr[i]) < diff)
				diff = Math.abs(arr[i + 1] - arr[i]);

		return diff;
	}

}
