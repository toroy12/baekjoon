package class2;

import java.io.*;
import java.util.*;

public class N7568 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				if(Integer.parseInt(arr[i][0]) < Integer.parseInt(arr[j][0]) && Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[j][1])) {
					rank++;
				}
			}
		sb.append(rank).append(' ');
		}
		System.out.println(sb);
	}
}
