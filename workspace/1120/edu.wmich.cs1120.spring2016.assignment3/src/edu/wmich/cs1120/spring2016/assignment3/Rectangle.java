package edu.wmich.cs1120.spring2016.assignment3;

public class Rectangle extends Shape {
	private double length;
	private double  width;
	
	
	public Rectangle(double l, double w){
		length=l;
		width=w;
	}
	public double getLength(){
		return length;
	} 
	public double getWidth(){
		return width;
	}
	
	@Override
	public double getArea(){
		double area =length*width;
		return area;
	}
	@Override
	public void printClassName(){
		System.out.println("My instance type is Rectangle");
	}
	
	public static void staticPrintClassName(){
		System.out.println("My static type is Rectangle");
	}

	
	
	public double getPerimeter(){
		
		double perimeter=((2*length)+(2*width));
		return perimeter;
		
	}

}
