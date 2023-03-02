package class2;

import java.util.*;

public class N1654 {
	
	public static long count(long mid, int[] arr) {
		
		int cnt = 0;
		
		for(int x : arr) {
			cnt += x / mid;
		}
		
		return cnt;
	}
	
	public static long search(int n, int[] arr) {
		
		long lt = 1;
		long rt = Arrays.stream(arr).max().getAsInt();
		
			
			while(lt <= rt) {
		          long mid = (lt + rt)/2; 

		         if(count(mid, arr) >= n) {
		                 lt = mid + 1;
		        } else {
		              rt = mid - 1;
		       }
		}
		return rt;
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[k];
		
		for(int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(search(n,arr));
	}
}
