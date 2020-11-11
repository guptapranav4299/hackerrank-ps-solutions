package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class calorie {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		String[] inputString = br.readLine().trim().split(" ");

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(inputString[i]);
		}

		System.out.println(miles(arr, n));
	}

	public static long miles(int[] arr, int n) {
		Arrays.sort(arr);
		long miles = 0;
		int j = 0;

		for (int i = n - 1; i >= 0; i--) {
			miles = miles + (long) (arr[i] * Math.pow(2, j));
			j++;
		}
		return miles;
	}

}
