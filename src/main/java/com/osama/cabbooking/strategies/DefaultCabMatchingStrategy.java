package com.osama.cabbooking.strategies;

import com.osama.cabbooking.model.Cab;
import com.osama.cabbooking.model.Location;
import com.osama.cabbooking.model.Rider;
import lombok.NonNull;

import java.util.List;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {

    @Override
    public Cab matchCabToRider(@NonNull final Rider rider, @NonNull final List<Cab> candidateCabs, @NonNull final Location fromPoint, @NonNull final Location toPoint) {
        if (candidateCabs.isEmpty()) {
            return null;
        }
        return candidateCabs.get(0);
    }

}
