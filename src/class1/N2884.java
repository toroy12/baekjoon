package class1;

import java.util.Scanner;

public class N2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int minute = sc.nextInt();
		int second = sc.nextInt();
		
		if(second < 45) {
			if(minute == 0) {
				minute = 23;
				second += 15;
			}else {
				minute -= 1;
				second += 15;
			}
		}else {
			second -= 45;
		}
		
		System.out.printf("%d %d", minute, second);
	}
}