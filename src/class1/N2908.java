package class1;

import java.util.Scanner;

public class N2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String aa = String.valueOf(a);
		String bb = String.valueOf(b);
		
		String[] aaa = aa.split("");
		String[] bbb = bb.split("");
		String aaaaa = "";
		String bbbbb = "";
		
		for(int i = 2; i >= 0; i--) {
			aaaaa += aaa[i];
			bbbbb += bbb[i];
		}
		if(Integer.parseInt(aaaaa) > Integer.parseInt(bbbbb)) {
			
			System.out.println(aaaaa);
		}else {
			System.out.println(bbbbb);
		}
	}
}
