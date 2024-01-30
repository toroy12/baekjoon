package class2;

import java.io.*;
import java.util.*;

public class N10816 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		
		System.out.println(sb);
	}
	
	public static int lowerBound(int[] arr, int key) {
		
		int lo = 0;
		int hi=arr.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key <= arr[mid]) {
				hi =  mid;
			}else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
	
	public static int upperBound(int[] arr, int key) {
		
		int lo = 0;
		int hi=arr.length;
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid;
			}else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
}
