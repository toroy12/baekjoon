package class1;

import java.util.Scanner;

public class N2920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] input = new int[8];
		
		String result = "";
		
		for(int i = 0; i < input.length; i++) {
			
			input[i] = sc.nextInt();
			result += input[i];
		}
		
		if(result.equals("12345678")) {
			System.out.println("ascending");
		}else if(result.equals("87654321")) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
