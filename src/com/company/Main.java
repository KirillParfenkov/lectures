package com.company;

import com.company.beans.Rectangle;
import com.company.beans.capacity.Capacity;
import com.company.beans.capacity.StraightCapacity;
import com.company.beans.liquid.Liquid;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Liquid liquid = new Liquid("name", 123);

        Rectangle rectangle = new Rectangle(1,2);


        StraightCapacity straightCapacity = new StraightCapacity(rectangle, 1);
        straightCapacity.fill(liquid);


        List<Capacity> capacities = new ArrayList<>();
        capacities.add(straightCapacity);

        Collections.sort(capacities, new Comparator<Capacity>() {
            @Override
            public int compare(Capacity o1, Capacity o2) {
                return 0;
            }
        });

        for(Capacity capacity: capacities) {
            System.out.println(capacities.toString()):
        }

    }
}
