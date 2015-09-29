package com.danilov.bikeventure;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.danilov.bikeventure.core.maps.Coordinate;
import com.danilov.bikeventure.core.service.ServiceConnector;
import com.danilov.bikeventure.core.service.TrackingService;
import com.danilov.bikeventure.core.tracking.Track;
import com.danilov.bikeventure.core.tracking.TrackPoint;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsTestActivity extends FragmentActivity implements OnMapReadyCallback, ServiceConnector.ServiceListener<TrackingService> {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_test);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        TrackingService.bindService(TrackingService.class, this, this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(final LatLng latLng) {
                if (service != null) {
                    service.newPoint(new Coordinate(latLng.latitude, latLng.longitude));
                    updateMap();
                }
            }
        });
    }

    private Polyline line = null;

    private void updateMap() {
        if (line != null) {
            line.remove();
        }
        List<TrackPoint> points = service.getPoints();
        PolylineOptions polylineOptions = new PolylineOptions();
        for (TrackPoint point : points) {
            polylineOptions.add(new LatLng(point.getLatitude(), point.getLongitude()));
        }
        polylineOptions.color(Color.RED);
        line = mMap.addPolyline(polylineOptions);
    }

    private TrackingService service;
    private Track track;

    @Override
    public void onServiceConnected(final TrackingService service) {
        this.service = service;
        track = new Track(System.currentTimeMillis());
        service.newTrack(track);
    }

    @Override
    public void onServiceDisconnected(final TrackingService service) {

    }

}
