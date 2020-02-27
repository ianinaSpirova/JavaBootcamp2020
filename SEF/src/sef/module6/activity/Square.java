package sef.module6.activity;

public class Square extends Shape {
    private double sidelength;


    //Default constructor
    public Square() {

    }

    //Parametrized constructor
    Square(double sidelength) {
        this.sidelength = sidelength;
    }

    public double calculateArea() {
        double area = sidelength*sidelength;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * 2 * sidelength;
        return perimeter;
    }
}
