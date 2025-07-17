package Strings;
import java.util.*;
public class Question4_Halfstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(Sub(a));
		sc.close();
		
	}static String Sub(String s) {
		
		if(s.length()%2==0) {
			return s.substring(0,s.length()/2);
		}else {
			return null;
		}

	}

}
