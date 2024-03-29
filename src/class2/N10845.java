package class2;

import java.io.*;
import java.util.*;

public class N10845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int last = 0;
		
		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch(s) {
				case "push" :
					last = Integer.parseInt(st.nextToken());
					q.offer(last);
					break;
				case "pop" :
					if(q.isEmpty()) 
						sb.append(-1).append('\n');
					else 
						sb.append(q.poll()).append('\n');
						break;			
				case "size" :
					sb.append(q.size()).append("\n");
					break;
				case "empty" :
					if(q.isEmpty()) 
						sb.append(1).append("\n");
					else 
						sb.append(0).append("\n");
					break;
				case "front" :
					if(q.isEmpty()) 
						sb.append(-1).append("\n");
					else 
						sb.append(q.peek()).append("\n");
					break;
				case "back" :
					if(q.isEmpty()) 
						sb.append(-1).append("\n");
					else 
						sb.append(last).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}
}
