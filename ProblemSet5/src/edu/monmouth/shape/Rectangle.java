package edu.monmouth.shape ;

public class Rectangle implements Shape{
	private int length;
	private int width;
	
	public Rectangle(int length, int width){
		setWidth(width);
		setLength(length);
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		if(width < 0) {
			width = 0;
		}
		else {
			this.width = width;
		}
		
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		if(length < 0) {
			length = 0;
		}
		else {
			this.length = length;
		}
	}
	@Override
	public String toString() {
		return ("length: "+this.length + ", width: " + this.width);
		
		
	}
	
	public double area() {
		return length*width;
		
	}
}
