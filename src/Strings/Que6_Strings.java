package Strings;
import java.util.*;
public class Que6_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ob=sc.nextLine();
		System.out.println(Num(s,ob));
	}
	static String Num(String a,String b) {
		if(a.length()>b.length()) {
			return a+b+a;
		}else {
			return b+a+b;
		}
	}

}
