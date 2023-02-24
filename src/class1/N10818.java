package class1;

import java.util.Scanner;

public class N10818 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num;
		
		int min = sc.nextInt();
		int max = min;
		
		for(int i = 1; i < N; i++) {
			
			num = sc.nextInt();
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.printf("%d %d", min, max);
	}
}
