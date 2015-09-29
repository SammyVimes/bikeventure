package com.danilov.bikeventure.core.maps;

/**
 * Created by Semyon on 29.09.2015.
 */
public class Coordinate {

    private final double latitude;
    private final double longitude;

    public Coordinate(final double latitude, final double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
