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
		Optional<Employee> emp=Optional.ofNullable(obj);
		Optional<String> a=emp.map(e ->e.name);
		System.out.println(a.orElse("Invalid Exception"));
		
	}

}
