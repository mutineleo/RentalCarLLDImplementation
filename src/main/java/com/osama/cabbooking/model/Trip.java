package com.osama.cabbooking.model;

import lombok.NonNull;

enum TripStatus {
    IN_PROGRESS,
    FINISHED
}
public class Trip {
    private Rider rider;
    private Cab cab;
    private Location fromPoint;
    private Location toPoint;
    private TripStatus status;

    public Trip(@NonNull final Rider rider, @NonNull final Cab cab, @NonNull final Location fromPoint, @NonNull final Location toPoint) {
        this.rider = rider;
        this.cab = cab;
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.status = TripStatus.IN_PROGRESS;
    }

    public void endTtrip() {
        this.status = TripStatus.FINISHED;
    }

}
