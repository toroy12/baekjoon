package class3;

import java.io.*;
import java.util.*;

public class N2606 {
	
	static int node[][];
	static int check[];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		node = new int[n+1][n+1];
		check = new int[n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			node[a][b] = node[b][a] = 1;
		}
		
		bfs(1);
	}
	
	static void bfs(int n) { 
		Queue<Integer> q = new LinkedList<>();
		
		check[n] =1;
		q.offer(n);
		int cnt = 0; 
		
		while(!q.isEmpty()) {
			int x = q.poll();
			
			for(int i=1;i<node.length;i++) { 
				if(node[x][i]==1 && check[i]!=1) {
					q.offer(i);
					check[i] = 1;
					cnt++;
				}
			}
		}
		System.out.println(cnt); 
	}
}
