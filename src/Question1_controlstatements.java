
import java.util.*;
public class Question1_controlstatements {
	public static boolean lastdigit(int n,int m) {
		int temp=n % 10;
		int another=m % 10;
		return temp == another;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean b=lastdigit(n,m);
		System.out.println(b);
	    sc.close();
	}
	
	
}
