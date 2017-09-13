package edu.wmich.cs1120.spring2016.assignment3;

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh1= new Shape();
		//sh1.printClassName();
		
		Rectangle r = new Rectangle(5,10);
		
		System.out.println(r.getPerimeter());
		System.out.println(r.getArea());
		r.staticPrintClassName();
		r.printClassName();
		
		Shape r2 = new Rectangle(5,10);
		
		
		Square sq= new Square(10);
		
		
		
		Rectangle sq2 = new Square(10);
		
		Shape sq3 = new Square(10);
		
		
		
		
		
	}

}
