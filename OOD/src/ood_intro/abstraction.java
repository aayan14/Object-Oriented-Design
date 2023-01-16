package ood_intro;

public class abstraction {
	
	public static void main(String[] args) {
		Square sq = new Square(5);
		System.out.println(sq.area());
		
		Rectangle rec = new Rectangle(5, 6);
		System.out.println(rec.area());
		
		Circle cir = new Circle(7);
		System.out.println(cir.area());
		
		Triangle tri = new Triangle(6,5);
		System.out.println(tri.area());
	}
	
	
}

abstract class Shape{
	
	public abstract int area();
	
	public Shape(){
		System.out.println("Shape Created!!");
	}
}

class Square extends Shape{
	
	int side;
	public Square(int side){
		super();
		System.out.println("Shape is square");
		this.side = side;
	}
	
	@Override
	public int area(){
		
		return this.side * this.side;
	}
}

class Rectangle extends Shape{
	
	int l, b;
	public Rectangle(int l, int b){
		super();
		System.out.println("Shape is Rectangle");
		this.l = l;
		this.b = b;
	}
	
	public int area(){
		return this.l * this.b;
	}
	
}

class Circle extends Shape{
	
	int r;
	public Circle(int r){
		super();
		System.out.println("Shape is Circle");
		this.r = r;
	}
	
	public int area(){
		return (int) (this.r * this.r * 3.14);
	}
	
}
class Triangle extends Shape{
	
	int h, b;
	public Triangle(int h, int b){
		super();
		System.out.println("Shape is Triangle");
		this.h = h;
		this.b = b;
	}
	
	public int area(){
		return (int) (this.h * this.b * 0.5);
	}
	
}