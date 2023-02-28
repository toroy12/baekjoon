package class2;

import java.util.*;

public class N1436 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int number = 666;
		int cnt = 1;
		
		while(cnt != n) {
			number++;
			if(String.valueOf(number).contains("666")) {
				cnt++;
			}
		}
		System.out.println(number);
	}
}
