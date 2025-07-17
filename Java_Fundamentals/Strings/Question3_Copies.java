package Strings;
import java.util.*;
public class Question3_Copies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String a=sc.nextLine();
		Question3_Copies obj=new Question3_Copies();
		String res=obj.Copies(a);
		System.out.println(res);
		

	}
	public String Copies(String s) {
		int n=s.length();
		String second;
		if(s.length()>=2) {
			second=s.substring(0,2);
		}else {
			second=s;
		}
	
	String result=" ";
	for(int i=0;i<n;i++) {
		result +=second;
	}return result;
	}

}
