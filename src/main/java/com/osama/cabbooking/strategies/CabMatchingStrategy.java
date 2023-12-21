package com.osama.cabbooking.strategies;

import com.osama.cabbooking.model.Cab;
import com.osama.cabbooking.model.Location;
import com.osama.cabbooking.model.Rider;

import java.util.List;

public interface CabMatchingStrategy {
    Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);

}
