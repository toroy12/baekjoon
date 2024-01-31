package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N10866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new  ArrayDeque<>();
		
		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			
			int last = 0;
			
			switch(s) {
				case "push_back" :
					last = Integer.parseInt(st.nextToken());
					deque.offerLast(last);
					break;
				case "push_front" :
					last = Integer.parseInt(st.nextToken());
					deque.offerFirst(last);
					break;
				case "front" :
					if(deque.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(deque.peekFirst()).append('\n');
					break;
				case "back" :
					if(deque.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(deque.peekLast()).append('\n');
					break;
				case "size" :
					sb.append(deque.size()).append('\n');
					break;
				case "empty" :
					if(deque.isEmpty())
						sb.append(1).append('\n');
					else
						sb.append(0).append('\n');
					break;
				case "pop_front" :
					if(deque.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(deque.pollFirst()).append('\n');
					break;
				case "pop_back" :
					if(deque.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(deque.pollLast()).append('\n');
					break;
			}
			
			
		}
		System.out.println(sb);
	}
}
