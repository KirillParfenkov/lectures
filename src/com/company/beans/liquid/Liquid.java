package com.company.beans.liquid;

/**
 * Created by Kiryl_Parfiankou on 1/24/2017.
 */
public class Liquid {

    private String name;
    private int density;

    public Liquid(String name, int density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public int getDensity() {
        return density;
    }
}
