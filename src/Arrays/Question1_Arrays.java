package Arrays;
import java.util.*;
public class Question1_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int total=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt(); //reading values into the array.
			total +=arr[i];
		}System.out.println(total);
		double average=total/n; //Average Value  ////This is directly calculated by using the total
		System.out.println(average);
		//(or) use this another one 
		double avg=(arr[0]+arr[arr.length-1])/2;
		System.out.println(avg);
		
		
sc.close();
	}

}
