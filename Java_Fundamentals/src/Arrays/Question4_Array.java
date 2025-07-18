package Arrays;
import java.util.*;
public class Question4_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		for(int i=0;i<n;i++) {
//			System.out.print((char) arr[i]+" ");
//		}
		for(int nums:arr) {
			System.out.print((char)nums+" , ");
		}
sc.close();
	}

}
