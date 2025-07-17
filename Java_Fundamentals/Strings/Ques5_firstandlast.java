package Strings;
import java.util.*;
public class Ques5_firstandlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(First(a));
		sc.close();

	}
	static String First(String s){
		if(s.length()<=2) {
			return "";
		}
		return s.substring(1,s.length()-1);
		
	}

}
