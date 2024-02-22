package class3;

import java.io.*;

public class N9461 {
	
	static Long[] dp;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		dp = new Long[101];
		
		dp[0] = 0L;
		dp[1] = dp[2] = dp[3] = 1L;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			sb.append(solution(Integer.parseInt(br.readLine()))).append('\n');
		}
		System.out.println(sb);
	}
	
	static long solution(int N) {
		
		if(dp[N] == null) {
			dp[N] = solution(N - 2) + solution(N - 3);
		}
		
		return dp[N];
	}
}
