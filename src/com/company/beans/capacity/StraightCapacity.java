package com.company.beans.capacity;

import com.company.beans.Figure;
import com.company.beans.liquid.Liquid;

/**
 * Created by Kiryl_Parfiankou on 1/24/2017.
 */
public class StraightCapacity implements Capacity {

    private Figure figure;
    private double height;
    protected double volume;
    private Liquid liquid;

    public StraightCapacity(Figure figure, double height) {

        this.figure = figure;
        this.height = height;

        if (figure != null) {
            volume = calculateVolume();
        }
    }

    public double getVolume() {
        return volume;
    }

    protected double calculateVolume() {
        return figure.getArea() * height;
    }

    @Override
    public void fill(Liquid liquid) {
        this.liquid = liquid;
    }


}