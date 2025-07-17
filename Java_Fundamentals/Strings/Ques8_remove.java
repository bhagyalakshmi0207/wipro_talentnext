package Strings;
import java.util.*;
public class Ques8_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(Newone(str));
	}
	static String Newone(String s) {
		StringBuilder a=new StringBuilder();
		int n=s.length();
		for(int i=0;i<s.length();i++) { 
			if(s.charAt(i)=='*'||(i>0 && s.charAt(i-1)=='*') ||(i<n-1 && s.charAt(i+1)=='*')) { //for current and previous and next
				continue;
			}
			a.append(s.charAt(i));
		}return a.toString();
	}

}
