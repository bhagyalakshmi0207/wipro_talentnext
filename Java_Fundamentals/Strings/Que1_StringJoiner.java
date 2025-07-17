package Strings;
//import java.util.Arrays;
import java.util.*;

public class Que1_StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> arr=new ArrayList<>();
			for(int i=0;i<n;i++) {
				arr.add(sc.nextLine());
			}
			
;		StringJoiner  a=new StringJoiner("," ,"{","}");
		for(String name:arr) {
			a.add(name);
		}System.out.println(a);
		

	}

}
