package class2;

import java.util.*;

public class N1966 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int t = sc.nextInt();
		
		while(t-- > 0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			LinkedList<int[]> q = new LinkedList<>();
			
			for(int i = 0; i < n; i++) {
				q.offer(new int[] {i, sc.nextInt()});
			}
			
			int count = 0;
			
			while(!q.isEmpty()) {
				
				int[] front = q.poll();
				boolean isMax = true;
				
				for(int i = 0; i < q.size(); i++) {
					if(front[1] < q.get(i)[1]) {
						q.offer(front);
						for(int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						
						isMax = false;
						break;
					}
				}
				
				if(isMax == false) {
					continue;
				}
				
				count++;
				if(front[0] == m) {
					break;
				}
			}
			
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}
}