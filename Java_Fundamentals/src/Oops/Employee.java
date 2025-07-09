package Oops;

public class Employee extends Person {
	double salary;
	int year;
	String insurancenumber;
	
	//Constructor creation
	public Employee(String name,double salary,int year,String insurancenumber) {
		super(name);
		this.salary=salary;
		this.year=year;
		this.insurancenumber=insurancenumber;
	}
	//get method
	public double getSalary() {
		return salary;
	}
	public int getYear() {
		return year;
	}
	public String getInsuranceno() {
		return insurancenumber;
	}
	
	//setter method
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setInsurance(String insurancenumber) {
		this.insurancenumber=insurancenumber;
	}
	public static void main(TestEmployee[] args) {
		// TODO Auto-generated method stub

	}

}
