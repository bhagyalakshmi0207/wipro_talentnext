package Oops;

public class Shape {
	void Draw() {
		System.out.println("Drawing Shape");
	}
	void Erase() {
		System.out.println("Erasing Shape");
	}
	static class Triangle extends Shape{
		void Draw() {
			System.out.println("Drawing Triangle");
		}
		void Erase() {
			System.out.println("Erasing Traiangle");
		}
	}
	static class Circle extends Shape{
		void Draw() {
			System.out.println("Drawing Circle");
		}
		void Erase() {
			System.out.println("Erasing Circle");
		}
	}
	static class Square extends Shape{
		void Draw() {
			System.out.println("Drawing Square");
		}
		void Erase() {
			System.out.println("Erasing Square");
		}
	}
	
	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle t=new Triangle();
		Square sq=new Square();
		c.Draw();
		c.Erase();
		t.Draw();
		t.Erase();
		sq.Draw();
		sq.Erase();
		

	}

}
