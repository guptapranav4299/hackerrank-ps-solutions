package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class maxPerimeter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		Integer[] sticks = new Integer[size];

		for (int i = 0; i < size; i++)
			sticks[i] = scn.nextInt();

		int[] res = maxPerimeter(sticks);

		for (int i = res.length - 1; i >= 0; i--)
			System.out.println(res[i]);
	}

	static int[] maxPerimeter(Integer[] sticks) {
		Arrays.sort(sticks, Collections.reverseOrder());
		for (int i = 0; i < sticks.length - 2; i++) {
			if (sticks[i] < sticks[i + 1] + sticks[i + 2])
				return new int[] { sticks[i], sticks[i + 1], sticks[i + 2] };
		}
		return new int[] { -1 };
	}

}
