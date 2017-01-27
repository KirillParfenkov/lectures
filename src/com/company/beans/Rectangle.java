package com.company.beans;

/**
 * Created by Kiryl_Parfiankou on 1/24/2017.
 */
public class Rectangle extends Figure {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.area = a * b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public double getArea() {
        return area;
    }
}
