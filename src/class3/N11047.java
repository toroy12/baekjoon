package class3;

import java.io.*;
import java.util.*;

public class N11047 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int result = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = N - 1; i >=0; i--) {
			if (K >= arr[i]) {
				result += K / arr[i];
				K %= arr[i];
			}
		}

		System.out.println(result);
	}
}
