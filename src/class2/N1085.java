package class2;

import java.util.Scanner;

public class N1085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int result = 0;
		
		if(w-x > h-y) {
			if(x > y) {
				if(h-y > y) {
					result = y;
				}else {
					result = h-y;
				}
			}else {
				if(h-y > x) {
					result = x;
				}else {
					result = h-y;
				}
			}
		}else {
			if(x > y) {
				if(w-x > y) {
					result = y;
				}else {
					result = w-x;
				}
			}else {
				if(w-x > x) {
					result = x;
				}else {
					result = w-x;
				}
			}
		}
		System.out.println(result);
	}
}
