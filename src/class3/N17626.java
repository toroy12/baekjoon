package class3;

import java.io.*;

public class N17626 {
	
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new int[n+1];
		dp[1] = 1;
		
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		
		int cnt = 0;
		
		for(int i = 2; i <= n; i++) {
			cnt = Integer.MAX_VALUE;
			
			for (int j = 1; j * j <= i; j++) {
                int temp = i - j * j;
                cnt = Math.min(cnt, dp[temp]);
            }
			dp[i] = cnt + 1;
		}
		
		return dp[n];
	}
}
