package class1;

import java.util.ArrayList;
import java.util.Scanner;

public class N10952 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		ArrayList<Integer> result = new ArrayList<Integer>();

		do {

			a = sc.nextInt();
			b = sc.nextInt();

			if (!((a == 0) && (b == 0))) {

				result.add(a + b);

			} else {
				for (Integer num : result) {

					System.out.println(num);

				}

			}

		} while (!((a == 0) && (b == 0)));
	}
}