package Strings;

import java.util.*;
public class Question1_Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder a =new StringBuilder(s);
		a.reverse();
		if(s.equals(a.toString())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not");
		}	
sc.close();
	}
	
}

//////Another logic
//package Strings;
//
//import java.util.*;
//public class Question1_Palindrome {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//
//	String s=sc.nextLine();
//	String str="";
//	for(int i=s.length()-1;i>=0;i--) {
//		str=str+s.charAt(i);	
//	}
//	if(str.equals(s)) {
//		System.out.println("Palindrome");
//	}else {
//		System.out.println("Not");
//	}
//}
//
//}



///Another one in the form of boolean true or false
//package Strings;
//import java.util.*;
//public class Question1_Palindrome {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		boolean b=Palindrome(s);
//		System.out.println(b);
//
//	}
//	public static boolean Palindrome(String s) {
//		//use the binary search technique
//		int left=0;
//		int right=s.length()-1;
//		while(left<right) {
//			if(s.charAt(left) != s.charAt(right)){
//				return false;
//			}left++;
//			right--;
//				
//			}return true;
//		
//		
//	}
//
//}
//
