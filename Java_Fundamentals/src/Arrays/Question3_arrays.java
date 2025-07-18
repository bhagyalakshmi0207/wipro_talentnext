package Arrays;
import java.util.*;
public class Question3_arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int b=Linearsearch(num,target);
		if(b==-1) {
			
			System.out.println("-1");
		}else {
			System.out.println(b);
		}sc.close();

	}
	public static int Linearsearch(int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target)  return i;
		}return -1;
	}

}
