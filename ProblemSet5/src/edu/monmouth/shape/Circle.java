package edu.monmouth.shape;

public class Circle implements Shape{
	private int radius;
	
	public Circle(int radius){
		setRadius(radius);
	}
	
	public int getRadius() {
		//this.radius = radius;
		return radius;
	}
	
	public void setRadius(int radius) {
		if(radius < 0) {
			radius = 0;
		}
		else {
			this.radius = radius;
		}
	}
	@Override
	public String toString() {
		return ("radius: "+ this.radius);
	}
	
	public double area() {
		return radius * radius * Math.PI;
		
	}

}
