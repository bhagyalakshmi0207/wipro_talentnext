package Strings;
import java.util.*;
public class Quest9_combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=sc.nextLine();
		System.out.println(Combine(s,str));

	}
	static String Combine(String a,String b) {
		StringBuilder sb=new StringBuilder();
		int len=Math.max(a.length(), b.length());
		for(int i=0;i<len;i++) {
			if(i<a.length()) {
				sb.append(a.charAt(i));
			}if(i<b.length()) {
				sb.append(b.charAt(i));
			}
		}return sb.toString();
	}

}
