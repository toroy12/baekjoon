package class1;

import java.util.Scanner;

public class N1546 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] arr = new double[N];
		
		double maxScore = arr[0];
		double result = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
			
			if(arr[i] > maxScore) {
				maxScore = arr[i];
			}
		}
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = arr[i]/maxScore*100;
			result += arr[i];
		}
		System.out.println(result/N);
		
	}
}
