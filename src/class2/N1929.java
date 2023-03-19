package class2;

import java.util.Scanner;

public class N1929 {
	public static boolean[] p;
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		p = new boolean[N + 1];
		get_prime();
				
		StringBuilder sb = new StringBuilder();
		for(int i = M; i <= N; i++) {

			if(!p[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
 
	public static void get_prime() {

		p[0] = p[1] = true;

		for(int i = 2; i <= Math.sqrt(p.length); i++) {
			if(p[i]) continue;
			for(int j = i * i; j < p.length; j += i) {
				p[j] = true;
			}
		}
	}
}