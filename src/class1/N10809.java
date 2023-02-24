package class1;

import java.util.Scanner;

public class N10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		int[] result = new int[26];

		for (int i = 0; i < result.length; i++) {
			result[i] = -1;
		}

		for (int j = 0; j < input.length(); j++) {
			int b = input.charAt(j);

			if (result[b - 97] == -1) {
				result[b - 97] = j;
			}
		}

		for (int k : result) {
			System.out.print(k + " ");
		}
	}
}
