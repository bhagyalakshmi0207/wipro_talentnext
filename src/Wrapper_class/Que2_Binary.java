package Wrapper_class;
import java.util.*;
public class Que2_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(args.length==0) {
			System.out.println("Command line argument");
			return;
		}try {
		System.out.println("Binary: "+Integer.toBinaryString(a));
		System.out.println("Octal: "+Integer.toOctalString(a));
		System.out.println("Hexa : "+Integer.toHexString(a));
		}catch(NumberFormatException e) {
			System.out.println("Invalid Input");
		}
	}
	
	
	

}
