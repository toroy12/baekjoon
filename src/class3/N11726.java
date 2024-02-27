package class3;

import java.io.*;

public class N11726 {
	
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		
		dp[0] = dp[1] = 1;
		
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		
		for(int i = 2; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		
		return dp[n];
	}
}
