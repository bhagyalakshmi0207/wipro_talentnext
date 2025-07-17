package Strings;
import java.util.*;

public class Que1_optionalclass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] names=new String[5];
		
		Optional<String> n=Optional.ofNullable(names[0]); //It is used to throw the null pointer exception
		if(n.isPresent()) { //isPresent checks the element is there or not 
			System.out.println(n.get().length());
		}else {
			System.out.println("Not Null");
		}
 
	}

}
