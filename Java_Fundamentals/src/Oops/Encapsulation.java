package Oops;
import java.util.*;
public class Encapsulation {
	//Author class 
   static class Author{
		private String name;
		private String email;
		private char gender;
		
		//Constructor Creation
		Author(String name,String email,char gender){
				this.name=name;
				this.email=email;
				this.gender=gender;
		}
		//getter -read and setter-write methods to access and store the data
		public String getName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public char getGender() {
			return gender;
		}
		//Setter
		public void setName(String name) {
			this.name=name;
		}
		public void setEmail(String email) {
			this.email=email;
		}
		public void setGender(char gender) {
			this.gender=gender;
		}
		//To display author info line by line and overrides the toString()
		public String toString() {
			return "Author Name: "+name+"\n"+"Email: "+email+"\n"+"Gender: "+gender;
			
		}
		
	}
    
    //Book class
   static class Book{
    	private String name;
    	private Author author;
    	private double price;
    	private int qtyInStock;
    	Book(String name,Author author,double price,int qtyInStock){
    		this.name=name;
    		this.author=author;
    		this.price=price;
    		this.qtyInStock=qtyInStock;
    	}
    	//Getter
    	public String getName() {
    		return name;
    	}
    	public Author getAuthor() {
    		return author;
    	}
    	public double getPrice() {
    		return price;
    	}
    	public int getStock(){
    		return qtyInStock;
    	}
    	//Setter Method to assign values
    	public void setName(String name) {
    		this.name=name;
    	}
    	public void setAuthor(Author author) {
    		this.author=author;
    	}
    	public void setPrice(double price) {
    		this.price=price;
    	}
    	public void setStock(int qtyInStock) {
    		this.qtyInStock=qtyInStock;
    	}

		// to display info line by line and calling toString()
    	public String toString() {
    		return "Book Name: "+name+"\n"+"Price: "+price+"\n"+"Stock: "+qtyInStock+"\n"+author.toString();
    		
    	}
    }	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter author Details");
		
		System.out.println("Author Name:");
		String name=sc.nextLine();
		
		System.out.println("Email: ");
		String email=sc.nextLine();
		
		System.out.println("Gender: ");
		char gender=sc.next().charAt(0);
		
		//author object
		Author author=new Author(name,email,gender);
		
		sc.nextLine();
		
		System.out.println("Enter Book Details: ");
		
		System.out.println("enter Book Name: ");
		String nam=sc.nextLine();
		
		System.out.println("Enter Price: ");
		double price =sc.nextDouble();
		
		System.out.println("Stock: ");
		int Stock=sc.nextInt();
		
		//Book Object
		Book b=new Book(nam,author,price,Stock);
		//to display book details
		System.out.println("\n ---Book Details---");
		System.out.println(b);
		sc.close();
		
		

	}
	

}
