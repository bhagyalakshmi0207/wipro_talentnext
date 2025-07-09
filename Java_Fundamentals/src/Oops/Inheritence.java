package Oops;

public class Inheritence {
	
	static class Animal{ //Creating class Animal

	    //nested class Animal
		 void Eat() {
			System.out.println("eat");
		}
		 void Sleep() {
			System.out.println("sleep");
		}
		 public String toString() {
			 return "This is an Animal";
		 }
	}
	static class Bird extends Animal{ //Inheritence
		void Fly(){
			System.out.println("fly");
		}
		public String toString() {
			return "This is a Bird";
		}
		
	}
	
	public static void main(String[] args) {
		Animal a=new Animal();
		a.Eat();
		a.Sleep();
		System.out.println(a);
		Bird b=new Bird();
		b.Eat();
		b.Sleep();
		b.Fly();
		System.out.println(b);
	}

}



//package Oops;
//
//public class Inheritence {
//	
//	static class Animal{ //Creating class Animal
//
//	    // Static nested class Animal
//		static void Eat() {
//			System.out.println("eat");
//		}
//		static void Sleep() {
//			System.out.println("sleep");
//		}
//	}
//	public static class Bird extends Animal{ //Inheritence
//	
//		static void Fly(){
//			System.out.println("fly");
//		}
//		
//		
//	}
//	
//	public static void main(Main[] args) {
//		Animal.Eat();
//		Animal.Sleep();
//		Bird.Fly();
//	}
//
//}


