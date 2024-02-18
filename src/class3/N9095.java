package class3;

import java.io.*;

public class N9095 {
	
	static int[] dp;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			dp = new int[11];
			
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			
			for (int j = 4; j <= n; j++) {
				dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
			}
			
			sb.append(dp[n]).append('\n');
		}
		System.out.println(sb);
	}
}
