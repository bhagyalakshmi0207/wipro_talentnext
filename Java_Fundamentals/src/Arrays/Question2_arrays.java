package Arrays;
import java.util.*;
public class Question2_arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<max) {
				min=arr[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
sc.close();
	}

}
