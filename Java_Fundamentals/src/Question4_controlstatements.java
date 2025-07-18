import java.util.*;

public class Question4_controlstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		char c=sc.next().charAt(0);
		if(ch >c) {
			System.out.println(ch+","+c);
		}else {
			System.out.println(c+", "+ch);
		}
		sc.close();
	}

}

//public class Question4_controlstatements {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		char ch[]=s.toCharArray();
//		Arrays.sort(ch);
////		for(char chars:ch) {
////			System.out.print(chars+",");
////		}
//		for(int i=0;i<ch.length;i++) {
//			System.out.print(ch[i]);
//			if(i<ch.length-1) {
//				System.out.print(",");
//			}
//		}
//	}
//}


