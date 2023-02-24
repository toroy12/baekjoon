package class1;

import java.util.Scanner;

public class N1152 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().trim().split(" ");
		int result = input.length; 
		
		if(input[0].equals("")) {
			result--;
		}
		
		System.out.println(result);
	}
}
