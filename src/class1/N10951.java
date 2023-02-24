package class1;

import java.io.*;

public class N10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a, b;
		String s;
		
		while ((s = br.readLine()) != null && !s.isEmpty()) {
			a = Integer.parseInt(s.split(" ")[0]);
			b = Integer.parseInt(s.split(" ")[1]);
					
			bw.write(a + b + "\n");
		}
		bw.flush();
		bw.close();
	}
}
