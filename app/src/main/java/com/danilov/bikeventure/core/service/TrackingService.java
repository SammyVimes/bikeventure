package com.danilov.bikeventure.core.service;


import com.danilov.bikeventure.core.maps.Coordinate;
import com.danilov.bikeventure.core.tracking.Track;
import com.danilov.bikeventure.core.tracking.TrackPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Semyon on 29.09.2015.
 */
public class TrackingService extends BaseService {

    private Track currentTrack;
    private List<TrackPoint> points = new ArrayList<>();

    public void newTrack(final Track track) {
        this.currentTrack = track;
        track.save();
    }

    public void newPoint(final Coordinate coordinate) {
        TrackPoint trackPoint = new TrackPoint(currentTrack.getId(), coordinate);
        points.add(trackPoint);
    }

    public List<TrackPoint> getPoints() {
        return points;
    }

}
