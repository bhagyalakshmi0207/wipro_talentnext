package Strings;
import java.util.*;
public class Ques7_chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(Charac(a));
	}
	static String Charac(String s) {
		if(s.length()==0) {
			return "";
		}if(s.startsWith("x")) {
			s=s.substring(1);
		}
		if(s.endsWith("x")) {
			s=s.substring(0,s.length()-1);
		}return s;
	}
}
