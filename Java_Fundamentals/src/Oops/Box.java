package Oops;
import java.util.*;
public class Box{
	
	//declaration of variables 
	double height,width,depth;
	
	//Constructor writing 
	Box(double height,double width,double depth) {
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	
	//Volume function creation 
	public double volume() {
		return (double) (width*height*depth);
	}
	
	public static void main(TestEmployee[] args) {
		Scanner sc=new Scanner(System.in);
		double height=sc.nextInt();
		double width=sc.nextInt();
		double depth=sc.nextInt();
		
		//Box object creation
		
		Box a=new Box(width,height,depth);
		double vol=a.volume();
		System.out.println(vol);
		sc.close();
		
	}

}
