package com.company.beans.capacity;

import com.company.beans.Figure;
import com.company.beans.liquid.Liquid;

/**
 * Created by Kiryl_Parfiankou on 1/24/2017.
 */
public class SlopingCapacity implements Capacity {

    private Figure topFigure;
    private Figure bottomFigure;
    private double height;
    protected double volume;
    private Liquid liquid;

    public SlopingCapacity(Figure topFigure, Figure bottomFigure, double height) {

        this.topFigure = topFigure;
        this.bottomFigure = bottomFigure;
        this.height = height;

        if (topFigure != null &&  bottomFigure != null) {
            volume = calculateVolume();
        }
    }

    public double getVolume() {
        return volume;
    }

    protected double calculateVolume() {
        return (topFigure.getArea() + bottomFigure.getArea() +
                Math.sqrt(topFigure.getArea() * bottomFigure.getArea())) * height / 3;

    }

    @Override
    public void fill(Liquid liquid) {
        this.liquid = liquid;
    }
}
