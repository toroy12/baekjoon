package class2;

import java.util.*;

public class N1181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		HashSet<String> str = new HashSet<>(N);
		
		for(int i = 0; i < N; i++) {
			str.add(sc.next());
		}
		
		List<String> list = new ArrayList<String>(str);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) {
					return -1;
				}else if(o1.length() > o2.length()) {
					return 1;
				}else {
					return o1.compareTo(o2);
				}
			}
		});
		
		for(String i : list) {
			System.out.println(i);
		}
	}
}
