package class3;

import java.io.*;
import java.util.*;

public class N1620 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		for(int i = 1; i <= N; i++) {
			String s = br.readLine();
			map1.put(i, s);
			map2.put(s, i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			String S = br.readLine();
			
			if(49 <= S.charAt(0) && S.charAt(0) <= 57) {
				sb.append(map1.get(Integer.parseInt(S))).append("\n");
			}else {
				sb.append(map2.get(S)).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
