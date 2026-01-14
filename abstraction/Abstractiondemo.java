public class Abstractiondemo{
	public static void main(String[]args){
		
		Circle c1 = new Circle(6);
		Rectangle r1 = new Rectangle(4,6);
		
		c1.display();
		r1.display();
		
		System.out.println("-------------");
		
		c1.calculatearea();
		r1.calculatearea();
	}
}

abstract class Shape{
	
	abstract void calculatearea();
	
	void display(){
		System.out.println("This is a geometric shape.");
	}
}

class Circle extends Shape{
	
	double radius;
	
	Circle(double r){
		this.radius = r;
	}
	
	@Override
	void calculatearea(){
		double area = 3.14 * radius * radius;
		System.out.println("The area of circle is : " + area);
	}
}

class Rectangle extends Shape{
	int length;
	int breadth;
	
	Rectangle(int l, int b){
		this.length = l;
		this.breadth = b;
	}
	
	@Override
	void calculatearea(){
		int area = length * breadth;
		System.out.println("The area of rectangle is : " + area);
	}
}
