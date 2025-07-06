package Arrays;
import java.util.*;
public class Question6_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		//It gives the output in new line 
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		} 
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
