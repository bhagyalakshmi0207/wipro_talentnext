package Arrays;
import java.util.*;
public class Question5_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2 && arr[i] !=max1) {
				max2=arr[i];
				}
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2 && arr[i] !=min1) {
					min2=arr[i];
				}
			
		}
		System.out.println("Largest: "+max1);
		System.out.println("Second Max: "+max2);
		System.out.println("2nd Smallest: "+min2);
		System.out.println("Smallest: "+min1);
		
		sc.close();

	}

}
