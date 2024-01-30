package class2;

import java.io.*;
import java.util.*;

public class N10773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		int result = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		
		for(int i = 0; i < stack.size(); i++) {
			result += stack.get(i);
		}
		
		System.out.println(result);
	}
}
