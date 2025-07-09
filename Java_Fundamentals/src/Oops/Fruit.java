package Oops;
import java.util.*;
public class Fruit {
	String name;
	String taste;
	int size;
	public Fruit(String name,String taste,int size) {
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	String Eat() {
		return name +" "+taste;
	}
	
	static class Apple extends Fruit{
		Apple(String name,String taste,int size){
			super(name,taste,size);
		}
	}
	static class Orange extends Fruit{
		Orange(String name,String taste,int size){
			super(name,taste,size);
		}
		@Override
		String Eat() {
			return name +" "+taste+" "+size;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String taste=sc.nextLine();
		int size=sc.nextInt();
		
		Apple a=new Apple(name,taste,size);
		System.out.println(a.Eat());
		
		Orange b=new Orange(name,taste,size);
		System.out.println(b.Eat());
sc.close();
	}

}
