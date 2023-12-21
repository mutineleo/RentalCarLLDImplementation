package com.osama.cabbooking.strategies;


import com.osama.cabbooking.model.Location;

public class DefaultPricingStrategy implements PricingStrategy {

    public static final Double RATE_PER_KM = 10.0;
    @Override
    public Double findPrice(Location fromPoint, Location toPoint) {
        return fromPoint.distance(toPoint)*RATE_PER_KM;
    }
}
