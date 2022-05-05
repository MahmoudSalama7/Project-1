package myfirst;
public class triangle extends geometricObject implements Comparable<triangle> {
	
	private double side1;
	private double side2;
	private double side3;
	private double s;
	public triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		s=(side1+side2+side3)/2;}
	
	public double getArea() {return Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));		}

	public double getPerimeter() {return side1+side2+side3;	}
	
	public double getSide1() {	return side1;}
	
	public void setSide1(double side1) {	this.side1 = side1;}
	
	public double getSide2() {	return side2;	}

	public void setSide2(double side2) {	this.side2 = side2;	}

	public double getSide3() {return side3;}

	public void setSide3(double side3) {this.side3 = side3;}
	
	public String toString() {
		return "triangle side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ",Area=" + getArea()
				+ ", Perimeter=" + getPerimeter() + ", Filled= " + isFilled() ;}
	
	public int compareTo(triangle o) {
    if(this.getArea()<o.getArea()) {		
    	return -1;}
    else if(this.getArea()>o.getArea()) {
    	return 1;}
    else return 0;}
}
