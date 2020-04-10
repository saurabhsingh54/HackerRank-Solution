import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String l1 = sc.next();
		String l2 = sc.next();

		int sum = l1.length() + l2.length();
		System.out.println(sum);
		
		
		int c = l1.compareTo(l2);
		if(c <= 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		
		
		String cap1 = l1.substring(0,1).toUpperCase() + l1.substring(1);
		String cap2 = l2.substring(0,1).toUpperCase() + l2.substring(1);
		System.out.print(cap1+" "+cap2);
	}

}
