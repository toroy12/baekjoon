package class1;

import java.util.Scanner;

public class N1330 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(">");
		}else if(num1 == num2) {
			System.out.println("==");
		}else if(num1 < num2) {
			System.out.println("<");
		}
	}
}
