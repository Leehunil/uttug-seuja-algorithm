import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String word = sc.next();
            char start = 'a';
            int count = 0;
            for(int i = 0; i < word.length(); i++) {
            	if(word.charAt(i) == start) {
                	count++;
                } else {
                	break;
                }
                start++;
            }
            
            System.out.println("#" + test_case + " " + count);
		}
	}
}
