package com.osama.cabbooking.database;

import com.osama.cabbooking.exceptions.CabAlreadyExistsException;
import com.osama.cabbooking.exceptions.CabNotFoundException;
import com.osama.cabbooking.exceptions.NoCabsAvailableException;
import com.osama.cabbooking.model.Cab;
import com.osama.cabbooking.model.Location;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CabsManager {
    Map<String, Cab> cabs = new HashMap<>();

    public void createCab(@NonNull final Cab newCab) {
        if (cabs.containsKey(newCab.getId())) {
            throw new CabAlreadyExistsException();
        }
        cabs.put(newCab.getId(), newCab);
    }

    public Cab getCab(@NonNull final String cabId) {
        if (!cabs.containsKey(cabId)) {
            throw new CabNotFoundException();
        }
        return cabs.get(cabId);
    }

    public void updateCabLocation(@NonNull final String cabId, @NonNull final Location newLocation) {
        if (!cabs.containsKey(cabId)) {
            throw new CabNotFoundException();
        }
        cabs.get(cabId).setCurrentLocation(newLocation);
    }

    public void updateCabAvailability(@NonNull final String cabId, @NonNull final Boolean newAvailability) {
        if (!cabs.containsKey(cabId)) {
            throw new CabNotFoundException();
        }
        cabs.get(cabId).setIsAvailable(newAvailability);
    }

    public List<Cab> getCabs(@NonNull final Location fromPoint, @NonNull final Double distance) {
        List<Cab> nearbyCabs = new ArrayList<>();
        if (cabs.isEmpty()) {
            throw new NoCabsAvailableException();
        }
        for (Cab cab : cabs.values()) {
            if (cab.getIsAvailable() && cab.getCurrentLocation().distance(fromPoint) <= distance) {
                nearbyCabs.add(cab);
            }
        }
        return nearbyCabs;
    }

}
