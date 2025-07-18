package Arrays;
import java.util.*;
public class Question7_Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Integer> a =new HashSet<>(); //Collection Frame works -don't allow duplicates
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		for(int nums:a) {
			System.out.print(nums +" , ");
		}
		sc.close();	}
}
