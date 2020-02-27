package sef.module17.activity;

public class jtestactivity {
    public static void main(String[] args) {
        jtestactivity JT = new jtestactivity();
        JT.add(3, 5);
        System.out.println("Hello!:" + JT.add(3, 5));
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
