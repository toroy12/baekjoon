package class3;

import java.io.*;
import java.util.*;

public class N11723 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 0; i < M; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int last = 0;
			
			String s = st.nextToken();
			
			switch(s) {
				case "add" :
					last = Integer.parseInt(st.nextToken());
					result |= (1 << last);
					break;
				case "check" :
					last = Integer.parseInt(st.nextToken());
					sb.append((result & (1 << last)) != 0 ? 1 : 0).append('\n');
					break;
				case "remove" :
					last = Integer.parseInt(st.nextToken());
					result &= ~(1 << last);
					break;
				case "toggle" :
					last = Integer.parseInt(st.nextToken());
					result ^= (1 << last);
					break;
				case "all" :
					result = (1 << 21) - 1;
					break;
				case "empty" :
					result = 0;
					break;
			}
		}
		
		System.out.println(sb);
	}
}
