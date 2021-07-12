package com.swa.oop3;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape shape;
        
		Square s = new Square();
        shape = s;
        s.setValues(50,4);
        System.out.println("Area of square : " + shape.getArea()); 
        
        Triangle t = new Triangle();       
        shape = t;
        t.setValues(32,5);
        System.out.println("Area of triangle : " + shape.getArea());
        
        Circle c = new Circle();
        shape = c;   
        c.setValues(5);   
        System.out.println("Area of circle : " + shape.getArea());
	}

}