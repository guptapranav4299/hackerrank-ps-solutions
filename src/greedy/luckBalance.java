package greedy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class luckBalance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[][] contests = new int[n][2];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < 2; j++)
				contests[i][j] = scn.nextInt();
		System.out.println(luckBalance(k, contests));

	}

	private static int luckBalance(int k, int[][] contests) {
		// TODO Auto-generated method stub
		int sum = 0;
		int rows = contests.length;

		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < rows; i++) {
			sum += contests[i][0];
			if (contests[i][1] == 1)
				res.add(contests[i][0]);
		}

		Collections.sort(res);

		int importantLost = res.size() - k - 1;

		while (importantLost > -1) {
			sum -= 2 * (res.get(importantLost));
			importantLost--;
		}
		return sum;
	}

}
