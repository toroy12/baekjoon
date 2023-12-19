package class2;

import java.util.Scanner;

public class N2609 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int max = 0;
		
		for(int i = 1; i <= n1 && i <= n2; i++) {
			
			if(n1 % i==0 && n2 % i==0) {
				max = i;
			}
		}
		
		int min = (n1 * n2) / max;
		
		System.out.println(max);
		System.out.println(min);
	}
}
