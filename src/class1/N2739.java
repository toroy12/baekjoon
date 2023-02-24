package class1;

import java.util.Scanner;

public class N2739{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0; 
		
		for(int i = 1; i < 10; i++) {
			
			result = num * i;
			
			System.out.println(num + " * " + i + " = "  + result);
		}
	}
}