package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class gridChallenge {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		String[] inputString = br.readLine().trim().split(" ");
		System.out.println(challenge(inputString));
	}

	public static String challenge(String[] grid) {
		int n = grid.length;
		for (int i = 0; i < n; i++) {
			char[] c = grid[i].toCharArray();
			Arrays.sort(c);
			grid[i] = new String(c);
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < grid[i].length(); j++) {
				if (grid[i - 1].charAt(j) > grid[i].charAt(j))
					return "NO";
			}
		}
		return "YES";
	}

}
