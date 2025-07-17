package Strings;

import java.util.Scanner;

public class Quest10_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		System.out.println(Instring(s,n));

	}
	static String Instring(String s,int n) {
		if(s==null ||n<0 ||n>s.length()) return "";
		String str=s.substring(s.length()-n);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(str);
		}return sb.toString();
	}

}
