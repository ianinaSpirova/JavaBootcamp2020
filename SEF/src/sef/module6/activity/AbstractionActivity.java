package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        //length
        Shape p1 = new Rectangle(5, 6);
        Shape p2 = new Square(5);
        p1.setColor("Blue");
        p2.setColor("Red");
        System.out.println("Color is: " + p1.getColor());
        System.out.println("Area is: " + p1.calculateArea());
        System.out.println("Perimeter is: " + p1.calculatePerimeter());
        System.out.println("Color is: " + p2.getColor());
        System.out.println("Area is: " + p2.calculateArea());
        System.out.println("Perimeter is: " + p2.calculatePerimeter());
    }
}