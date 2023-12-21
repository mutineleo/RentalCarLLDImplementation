package com.osama.cabbooking.strategies;

import com.osama.cabbooking.model.Location;

public interface PricingStrategy {
    Double findPrice(Location fromPoint, Location toPoint);
}
