package class3;

import java.io.*;
import java.util.*;

public class N9375 {

	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			
			HashMap<String, Integer> map = new HashMap<>();
			
			int N = Integer.parseInt(br.readLine());
			
			while(N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				st.nextToken();
				
				String kind = st.nextToken();
				
				if(map.containsKey(kind)) {
					map.put(kind, map.get(kind) + 1);
				}else {
					map.put(kind, 1);
				}
			}
			
			int result = 1;
			
			for(int i : map.values()) {
				result *= (i + 1);
			}
			
			sb.append(result - 1).append('\n');
		}
		
		System.out.println(sb);
	}
}
