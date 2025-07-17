package Strings;

import java.util.Optional;

public class Que3_optionalclass {
	
	public static class Employee{
		String name;
	
	public Employee(String name) {
		this.name=name;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=null;
		
		// Wrap the whole employee object safely in Optional
		Optional<Employee> emp=Optional.ofNullable(obj); //If obj is not null → wraps it inside Optional and If obj is null → creates an empty Optional
		
		//If a has a value (i.e., obj is not null), it applies the function e -> e.name.
		//If a is empty, map() does nothing — and nameOptional also becomes empty (safe).
		
		Optional<String> a=emp.map(e ->e.name); //e is a temporary variable and It accesses the name field of the Employee object e.
		
		System.out.println(a.orElse("Invalid Exception"));
		//If a has a value (i.e., name is not null), it prints it. and If a is empty (either obj == null or obj.name == null), it prints "Unknown".


		
	}

}
