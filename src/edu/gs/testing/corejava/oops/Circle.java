package edu.gs.testing.corejava.oops;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double r) {
		radius = r;
	}
	
	

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
}
