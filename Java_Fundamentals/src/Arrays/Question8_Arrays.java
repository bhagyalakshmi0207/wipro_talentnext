package Arrays;

import java.util.*;

public class Question8_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Sum(a));
		sc.close();
		

	}
	public static int Sum(int[] a) {
		boolean skip=false;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==6) {
				skip=true;
				continue;
			}
			if(skip && a[i]==7) {
				skip=false;
				continue;
			}
			if(!skip) {
				sum +=a[i];
		     }	
		}return sum;
		
	}

}
