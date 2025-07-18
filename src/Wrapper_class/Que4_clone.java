package Wrapper_class;
import java.util.*;
public class Que4_clone {
	
	//Class Creation
	public static class Employee{ 
		String name;
		int id;
		String role;
		int salary;

		//Constructor
	public Employee(String name,int id,String role,int salary){
		this.name=name;
		this.id=id;
		this.role=role;
		this.salary=salary;
	}
	//Constructor for new clone one
	public Employee(Employee e) {
        this.name = e.name;
        this.id = e.id;
        this.role = e.role;
        this.salary = e.salary;
    }
	public void display() {
		System.out.println("Name :"+name+" id: "+id+" role :"+role+" salary : "+salary);
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int a=sc.nextInt();
		sc.nextLine();
		String s2=sc.nextLine();
		int b=sc.nextInt();
		sc.nextLine();
		
		//Main Obj creation 
		Employee obj=new Employee(s,a,s2,b);
		
		// clone obj creation
		Employee ob2=new Employee(obj);

		ob2.name=sc.nextLine();
		ob2.id=sc.nextInt();
		
		System.out.println("Original Employee: ");
		obj.display();
		
		System.out.println("Cloned One: ");
		ob2.display();
		
		
		
		

	}

}
