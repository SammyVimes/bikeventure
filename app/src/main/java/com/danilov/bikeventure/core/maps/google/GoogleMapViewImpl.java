package com.danilov.bikeventure.core.maps.google;

import android.os.Bundle;

import com.danilov.bikeventure.core.maps.IMap;
import com.danilov.bikeventure.core.maps.IMapView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

/**
 * Created by semyon on 29.09.15.
 */
public class GoogleMapViewImpl implements IMapView {

    private MapView mapView;
    private GoogleMapImpl googleMap = null;

    public void getMapAsync(final MapCallback callback) {
        mapView.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(final GoogleMap gmap) {
                if (googleMap == null) {
                    googleMap = new GoogleMapImpl(gmap);
                }
                callback.onMapReady(googleMap);
            }
        });
    }

    public void onSaveInstanceState(final Bundle outState) {
        mapView.onSaveInstanceState(outState);
    }

    public void onLowMemory() {
        mapView.onLowMemory();
    }

    public void onDestroy() {
        mapView.onDestroy();
    }

    public void onPause() {
        mapView.onPause();
    }

    public void onResume() {
        mapView.onResume();
    }

    public void onCreate(final Bundle savedInstanceState) {
        mapView.onCreate(savedInstanceState);
    }

    @Deprecated
    public IMap getMap() {
        if (googleMap == null) {
            googleMap = new GoogleMapImpl(mapView.getMap());
        }
        return googleMap;
    }

}
