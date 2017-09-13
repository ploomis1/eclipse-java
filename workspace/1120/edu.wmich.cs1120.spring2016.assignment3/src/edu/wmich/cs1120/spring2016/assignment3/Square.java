package edu.wmich.cs1120.spring2016.assignment3;

public class Square extends Rectangle{
	
	public Square(double length){
		super(length,length);
	}
	
	public double getArea(){
		
		return (super.getLength()*super.getWidth() );	
		}
		public void printClassName(){
			System.out.println("My instance type is Square");
		}
		public static void staticPrintClassName(){
			System.out.println("My static type is Square");
		}
		public void getDimensions(){
			System.out.println(super.getLength()+" "+ super.getWidth());
		}
}
