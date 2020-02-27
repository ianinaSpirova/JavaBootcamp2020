package sef.module6.activity;

public class Rectangle extends Shape {
    private double length;
    private double breadth;


    //Default constructor
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
        // this.area = 0;
        // this.perimeter = 0;
    }

    //Parametrized constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        double area = length * breadth;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}

