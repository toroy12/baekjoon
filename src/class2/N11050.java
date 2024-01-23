package class2;

import java.io.*;
import java.util.StringTokenizer;

public class N11050 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int result1 = 1;
		int result2 = 1;
		int result3 = 1;
		
		for(int i = 1; i <= N; i++) {
			result1 *= i;
		}
		
		for(int i = 1; i <= K; i++) {
			result2 *= i;
		}
		
		for(int i = 1; i <= N-K; i++) {
			result3 *= i;
		}
		
		int result = result1 / (result2 * result3);
		System.out.println(result);
	}
}
