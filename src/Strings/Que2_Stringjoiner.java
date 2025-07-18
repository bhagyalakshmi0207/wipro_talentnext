package Strings;
import java.util.*;
public class Que2_Stringjoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
	
	StringJoiner a=new StringJoiner("-","[","]");
	for(int i=0;i<n;i++) {
		a.add(sc.nextLine());
	}
	StringJoiner b=new StringJoiner("-","[","]");
	 for (int i = 0; i < n; i++) {
         b.add(sc.nextLine());
     }
	StringJoiner merges1=new StringJoiner("-","[","]");
		merges1.merge(a);
		merges1.merge(b);
		System.out.println(merges1);
	StringJoiner merges2=new StringJoiner("-","[","]");
		merges2.merge(b);
		merges2.merge(a);
		System.out.println(merges2);
	}
}
