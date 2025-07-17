package Strings;

import java.util.Optional;

public class Que2_optionalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address=null;
		String res=Optional.ofNullable(address).orElse("India");
		System.out.println(res);	

	}

}
