package Oops;
import java.util.*;

public class CalculatorQ2 {
	
	
	public static int Powerint(int num1,int num2) {
		return (int)Math.pow(num1,num2);
	}
	public static double Powerdouble(double num3,double num4) {
		return (double)Math.pow(num3, num4);
	}

	public static void main(TestEmployee[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double num3=sc.nextDouble();
		double num4=sc.nextDouble();
		int res=CalculatorQ2.Powerint(num1,num2);
		double result=CalculatorQ2.Powerdouble(num3,num4);
		System.out.println(res);
		System.out.println(result);
sc.close();
	}

}
