package Abstraction;
import java.util.Random;
	abstract class Compartment{ //Class creation
		abstract String notice(); //Function creation
	}
	
	 class FirstClass extends Compartment{
		@Override
		public String notice() {
			return "First one :First Class Compartment ";
		}
	}
	
	 class Ladies extends Compartment{
		@Override
		String notice() {
			return "Ladies one : Ladies Compartment";
		}
	}
	
	 class General extends Compartment{
		@Override
		String notice() {
			return "General one :General Compartment ";
		}
	}
	
	 class Luggage extends Compartment{
		 @Override
		String notice() {
			return "Luggage one :Luggage Compartment ";
		}
	 }
	
public class Compartmentest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] a=new Compartment[10];
		Random ran=new Random();
		for(int i=0;i<a.length;i++) {
				int type=ran.nextInt(4)+1;
				switch(type) {
				case 1: a[i]=new FirstClass();break;
				case 2:a[i]=new Ladies();break;
				case 3:a[i]=new General();break;
				case 4:a[i]=new Luggage();break;
				
				
				}
				System.out.println("Compartment : "+(i+1));
				
				System.out.println(a[i].notice());
		}
		

	}
}


