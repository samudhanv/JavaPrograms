package in.javahungry.cob;

public class ClassAndObjectDemo1 {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
				
		System.out.println("Rectangle Area= "+rectangle.calculateArea(120, 30));
		System.out.println("Rectangle Perimeter= "+rectangle.calculatePerimeter(100, 25));

	}
}

class Rectangle{
	
	//Declaring members
	private int length, breadth;	
	
	//Defining methods
	public int calculateArea(int l, int b) {
		length = l;
		breadth = b;
		return length * breadth;
	}
	
	public int calculatePerimeter(int x, int b) {
		length = x;
		breadth = b;
		return 2*(length+breadth);
	}			
}
