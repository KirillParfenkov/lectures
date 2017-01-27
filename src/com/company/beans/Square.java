package com.company.beans;

/**
 * Created by Kiryl_Parfiankou on 1/24/2017.
 */
public class Square extends Figure {

    private int a;

    public Square(int a) {
        this.a = a;
        area = a * a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return area;
    }
}