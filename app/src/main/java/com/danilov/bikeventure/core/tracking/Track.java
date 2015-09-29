package com.danilov.bikeventure.core.tracking;

import android.os.Parcel;
import android.os.Parcelable;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

/**
 * Created by Semyon on 29.09.2015.
 */
@Table(name = "track")
public class Track extends Model implements Parcelable {

    @Column(name = "is_synced")
    private boolean isSynced = false;

    @Column(name = "start_timestamp")
    private Long startTimestamp;

    @Column(name = "end_timestamp")
    private Long endTimestamp;

    @Column(name = "track_state")
    private TrackState trackState;

    private transient List<TrackPoint> trackPoints;

    public Track(final Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        trackState = TrackState.PAUSED;
    }

    public Track() {
    }

    public boolean isSynced() {
        return isSynced;
    }

    public void setIsSynced(final boolean isSynced) {
        this.isSynced = isSynced;
    }

    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(final Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(final Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public TrackState getTrackState() {
        return trackState;
    }

    public void setTrackState(final TrackState trackState) {
        this.trackState = trackState;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void setTrackPoints(final List<TrackPoint> trackPoints) {
        this.trackPoints = trackPoints;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(isSynced ? (byte) 1 : (byte) 0);
        dest.writeValue(this.startTimestamp);
        dest.writeValue(this.endTimestamp);
        dest.writeInt(this.trackState == null ? -1 : this.trackState.ordinal());
    }

    protected Track(Parcel in) {
        this.isSynced = in.readByte() != 0;
        this.startTimestamp = (Long) in.readValue(Long.class.getClassLoader());
        this.endTimestamp = (Long) in.readValue(Long.class.getClassLoader());
        int tmpTrackState = in.readInt();
        this.trackState = tmpTrackState == -1 ? null : TrackState.values()[tmpTrackState];
    }

    public static final Parcelable.Creator<Track> CREATOR = new Parcelable.Creator<Track>() {
        public Track createFromParcel(Parcel source) {
            return new Track(source);
        }

        public Track[] newArray(int size) {
            return new Track[size];
        }
    };

}
