package class1;

import java.util.Scanner;

public class N2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String abc = String.valueOf(A * B * C);
		String[] ch = abc.split("");

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (i == Integer.parseInt(ch[j])) {
					arr[i] = arr[i] + 1;
				}
			}
			System.out.println((arr[i]));
		}
	}
}
