package class3;

import java.io.*;
import java.util.*;

public class N1764 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < N; i++) {
			 map.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < M; i++) {
			String s = br.readLine();
			map.put(s, map.getOrDefault(s, 0) +  1);
			
			if (map.get(s) == 2) list.add(s);
		}
		
		StringBuilder sb = new StringBuilder();
		Collections.sort(list);
		sb.append(list.size()).append('\n');
		
		for(String s : list) {
			sb.append(s).append('\n');
		}
		System.out.println(sb);
	}
}
