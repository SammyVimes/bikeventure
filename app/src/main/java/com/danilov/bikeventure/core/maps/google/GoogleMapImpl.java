package com.danilov.bikeventure.core.maps.google;

import android.graphics.Bitmap;
import android.location.Location;

import com.danilov.bikeventure.core.maps.IMap;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;

/**
 * Created by semyon on 29.09.15.
 */
public class GoogleMapImpl implements IMap {

    private GoogleMap googleMap;

    public GoogleMapImpl(final GoogleMap googleMap) {
        this.googleMap = googleMap;
    }

    public CameraPosition getCameraPosition() {
        return googleMap.getCameraPosition();
    }

    public void setOnInfoWindowClickListener(final GoogleMap.OnInfoWindowClickListener listener) {
        googleMap.setOnInfoWindowClickListener(listener);
    }

    public int getMapType() {
        return googleMap.getMapType();
    }

    public void moveCamera(final CameraUpdate update) {
        googleMap.moveCamera(update);
    }

    @Deprecated
    public Location getMyLocation() {
        return googleMap.getMyLocation();
    }

    public void setOnMapClickListener(final GoogleMap.OnMapClickListener listener) {
        googleMap.setOnMapClickListener(listener);
    }

    public void setMyLocationEnabled(final boolean enabled) {
        googleMap.setMyLocationEnabled(enabled);
    }

    public void setTrafficEnabled(final boolean enabled) {
        googleMap.setTrafficEnabled(enabled);
    }

    public void setOnMapLoadedCallback(final GoogleMap.OnMapLoadedCallback callback) {
        googleMap.setOnMapLoadedCallback(callback);
    }

    public TileOverlay addTileOverlay(final TileOverlayOptions options) {
        return googleMap.addTileOverlay(options);
    }

    public void setOnMyLocationButtonClickListener(final GoogleMap.OnMyLocationButtonClickListener listener) {
        googleMap.setOnMyLocationButtonClickListener(listener);
    }

    public Polyline addPolyline(final PolylineOptions options) {
        return googleMap.addPolyline(options);
    }

    public void setOnMarkerClickListener(final GoogleMap.OnMarkerClickListener listener) {
        googleMap.setOnMarkerClickListener(listener);
    }

    public boolean isMyLocationEnabled() {
        return googleMap.isMyLocationEnabled();
    }

    public void setOnMarkerDragListener(final GoogleMap.OnMarkerDragListener listener) {
        googleMap.setOnMarkerDragListener(listener);
    }

    public void setInfoWindowAdapter(final GoogleMap.InfoWindowAdapter adapter) {
        googleMap.setInfoWindowAdapter(adapter);
    }

    public Projection getProjection() {
        return googleMap.getProjection();
    }

    public Polygon addPolygon(final PolygonOptions options) {
        return googleMap.addPolygon(options);
    }

    @Deprecated
    public void setOnMyLocationChangeListener(final GoogleMap.OnMyLocationChangeListener listener) {
        googleMap.setOnMyLocationChangeListener(listener);
    }

    public void animateCamera(final CameraUpdate update, final int durationMs, final GoogleMap.CancelableCallback callback) {
        googleMap.animateCamera(update, durationMs, callback);
    }

    public void setPadding(final int left, final int top, final int right, final int bottom) {
        googleMap.setPadding(left, top, right, bottom);
    }

    public void setOnIndoorStateChangeListener(final GoogleMap.OnIndoorStateChangeListener listener) {
        googleMap.setOnIndoorStateChangeListener(listener);
    }

    public void snapshot(final GoogleMap.SnapshotReadyCallback callback, final Bitmap bitmap) {
        googleMap.snapshot(callback, bitmap);
    }

    public boolean setIndoorEnabled(final boolean enabled) {
        return googleMap.setIndoorEnabled(enabled);
    }

    public Marker addMarker(final MarkerOptions options) {
        return googleMap.addMarker(options);
    }

    public void setMapType(final int type) {
        googleMap.setMapType(type);
    }

    public void animateCamera(final CameraUpdate update, final GoogleMap.CancelableCallback callback) {
        googleMap.animateCamera(update, callback);
    }

    public void setBuildingsEnabled(final boolean enabled) {
        googleMap.setBuildingsEnabled(enabled);
    }

    public void setOnCameraChangeListener(final GoogleMap.OnCameraChangeListener listener) {
        googleMap.setOnCameraChangeListener(listener);
    }

    public float getMaxZoomLevel() {
        return googleMap.getMaxZoomLevel();
    }

    public void setContentDescription(final String description) {
        googleMap.setContentDescription(description);
    }

    public boolean isBuildingsEnabled() {
        return googleMap.isBuildingsEnabled();
    }

    public Circle addCircle(final CircleOptions options) {
        return googleMap.addCircle(options);
    }

    public boolean isIndoorEnabled() {
        return googleMap.isIndoorEnabled();
    }

    public void animateCamera(final CameraUpdate update) {
        googleMap.animateCamera(update);
    }

    public GroundOverlay addGroundOverlay(final GroundOverlayOptions options) {
        return googleMap.addGroundOverlay(options);
    }

    public void setLocationSource(final LocationSource source) {
        googleMap.setLocationSource(source);
    }

    public UiSettings getUiSettings() {
        return googleMap.getUiSettings();
    }

    public void stopAnimation() {
        googleMap.stopAnimation();
    }

    public IndoorBuilding getFocusedBuilding() {
        return googleMap.getFocusedBuilding();
    }

    public void clear() {
        googleMap.clear();
    }

    public float getMinZoomLevel() {
        return googleMap.getMinZoomLevel();
    }

    public boolean isTrafficEnabled() {
        return googleMap.isTrafficEnabled();
    }

    public void setOnMapLongClickListener(final GoogleMap.OnMapLongClickListener listener) {
        googleMap.setOnMapLongClickListener(listener);
    }

    public void snapshot(final GoogleMap.SnapshotReadyCallback callback) {
        googleMap.snapshot(callback);
    }

}
