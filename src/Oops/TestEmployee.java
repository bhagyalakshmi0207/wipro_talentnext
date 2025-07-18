package Oops;

public class TestEmployee{
	
	public static void main(java.lang.String[] args) {
		Employee emp=new Employee("Bhagya",7967900,2022,"INJDS576");
		System.out.println("Name: "+emp.getName());
		System.out.println("Annal Salary: "+emp.getSalary());
		System.out.println("Year of Start: "+emp.getYear());
		System.out.println("Insurance Number: "+emp.insurancenumber);

	}

}
