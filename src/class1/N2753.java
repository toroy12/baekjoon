package class1;

import java.util.Scanner;

public class N2753 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input_year = sc.nextInt();
		
		if(input_year % 4 == 0) {
			if(input_year % 100 != 0 || input_year % 400 == 0) {
				System.out.println("1");
				return;
			}
		}
		System.out.println("0");
	}
}