package edu.gs.testing.corejava.methodover;

abstract class Shape {

	protected String color;
	protected boolean filled;

	public Shape() {
		super();
	}

	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public abstract String toString();

}

class Circle extends Shape {
	protected double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// @Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}

}

class Rectangle extends Shape {
	protected double length;
	protected double width;

	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width, String color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {

		return length * width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + ", filled=" + filled + "]";
	}

}

public class TestAbstract {

	public static void main(String[] args) {

		// Shape shape = new Shape();
		Circle circle = new Circle(10.88, "red", false);
		System.out.println(circle);
		System.err.println(circle.getArea());

		Shape s1 = new Circle(1055, "black", true); // upcasting
		System.out.println(s1.getArea());

		Circle c2 = (Circle) s1;// downcasting

		Shape s2 = new Rectangle(12, 13, "red", false);

		s2 = c2;

		System.out.println(s2);
		System.out.println(s2.getArea());

		if (s2 instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) s2;
			rectangle.getLength();
		} else {
			System.out.println("This is not possible");
		}

	}

}
