package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N15829 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int L = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		int p = 1234567891;
		long r = 1;
		long s = 0;
		
		for(int i = 0; i < L; i++) {
			s += ((S.charAt(i)-'a'+1)*r)%p;
			r = (r*31)%p;
		}
		System.out.println(s%p);
	}
}
