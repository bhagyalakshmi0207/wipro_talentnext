package Wrapper_class;
import java.util.*;
public class Que3_Binaryno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b=Integer.toBinaryString(a);
		if(b.length()<8) {
			String c=String.format("%8s",b).replace(" ","0");
			System.out.println(String.valueOf(c));
		}
			
		

	}

}
