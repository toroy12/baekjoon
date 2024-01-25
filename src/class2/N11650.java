package class2;

import java.io.*;
import java.util.*;

public class N11650 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String[][] arr = new String[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] s1, String[] s2) {
				int compareFirst = Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				if (compareFirst == 0) {
					return Integer.parseInt(s1[1]) - Integer.parseInt(s2[1]);
				} else {
					return compareFirst;
				}
			}
		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
