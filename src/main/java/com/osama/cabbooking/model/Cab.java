package com.osama.cabbooking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cab {
    String id;
    String driverName;

    @Setter Trip currentTrip;
    @Setter Location currentLocation;
    @Setter Boolean isAvailable;

    public Cab(String id, String driverName) {
        this.id = id;
        this.driverName = driverName;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "id='" + id + '\'' +
                ", driverName='" + driverName + '\'' +
                ", currentTrip=" + currentTrip +
                ", currentLocation=" + currentLocation +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
