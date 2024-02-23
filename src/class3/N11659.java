package class3;

import java.io.*;
import java.util.*;

public class N11659 {
	
	static int[] sum;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		sum = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			sb.append(sum[j] - sum[i-1]).append('\n'); 
		}
		System.out.println(sb);
	}
}
