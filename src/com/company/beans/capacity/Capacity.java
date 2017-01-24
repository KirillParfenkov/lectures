package com.company.beans.capacity;

import com.company.beans.liquid.Liquid;

/**
 * Created by Kiryl_Parfiankou on 1/24/2017.
 */
public interface Capacity {

    void fill(Liquid liquid);
    double getMass();
}
