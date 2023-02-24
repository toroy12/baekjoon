package class1;

import java.util.Scanner;

public class N11720 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String X = sc.next();
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			result += Character.digit(X.charAt(i), 10);
		}
		System.out.println(result);
	}
}
