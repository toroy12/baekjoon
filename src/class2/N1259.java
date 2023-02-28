package class2;

import java.util.Scanner;

public class N1259 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.next();
			
			if (str.equals("0")) {
				break;
			} else {

				String[] arr = str.split("");
				int[] a = new int[arr.length];
				int[] b = new int[arr.length];

				String result = "";
				int c = arr.length;

				for (int i = 0; i < arr.length; i++) {
					a[i] = Integer.parseInt(arr[i]);
					b[i] = Integer.parseInt(arr[c - 1]);
					c--;
				}

				for (int i = 0; i < arr.length; i++) {
					if (a[i] == b[i]) {
						result = "yes";
					} else {
						result = "no";
						break;
					}
				}
				System.out.println(result);
			}
		}
	}
}
