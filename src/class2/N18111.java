package class2;

import java.io.*;
import java.util.*;

public class N18111 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		int min = Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				max = Math.max(max, arr[i][j]);
				min = Math.min(min, arr[i][j]);
			}
		}
		
		int time = Integer.MAX_VALUE;
		int height = -1;
		
		for(int  i = min; i <= max; i++) {
			int cnt = 0;
			int inventory = B;
			
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < M; k++) {
					int diff = arr[j][k] - i;
					
					if(diff > 0) {
						cnt += Math.abs(diff) * 2;
						inventory += Math.abs(diff);
					}else {
						cnt += Math.abs(diff);
						inventory -= Math.abs(diff);
					}
				}
			}
			
			if(inventory >= 0) {
				if(cnt <= time) {
					time = cnt;
					height = i;
				}
			}
		}
		
		System.out.println(time + " " + height);
	}
}
