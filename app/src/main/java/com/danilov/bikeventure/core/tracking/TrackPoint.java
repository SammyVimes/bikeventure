package com.danilov.bikeventure.core.tracking;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.danilov.bikeventure.core.maps.Coordinate;

/**
 * Created by Semyon on 29.09.2015.
 */
@Table(name = "track_points")
public class TrackPoint extends Model {

    @Column(name = "track_id")
    private long trackId;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "synced")
    private boolean synced = false;

    public TrackPoint(final long trackId, final double latitude, final double longitude) {
        this.trackId = trackId;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public TrackPoint(final long trackId, final Coordinate coordinate) {
        this.trackId = trackId;
        this.latitude = coordinate.getLatitude();
        this.longitude = coordinate.getLongitude();
    }

    public TrackPoint() {

    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(final long trackId) {
        this.trackId = trackId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(final double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(final double longitude) {
        this.longitude = longitude;
    }

    public boolean isSynced() {
        return synced;
    }

    public void setSynced(final boolean synced) {
        this.synced = synced;
    }

}
