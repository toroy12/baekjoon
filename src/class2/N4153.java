package class2;

import java.util.Scanner;

public class N4153 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			
			System.out.println(calc(a, b, c));
		}
	}
	
	static String calc(int a, int b, int c) {
		
		String result = "wrong";
		int temp = 0;
		
		if(b > a && b > c) {
			temp = a;
			a = b;
			b = temp;
		}else if(c > a && c > b) {
			temp = a;
			a = c;
			c = temp;
		}
		
		if(c > b) {
			temp = b;
			b = c;
			c = temp;
		}
		
		if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			result = "right";
		}
		
		return result;
	}
}
