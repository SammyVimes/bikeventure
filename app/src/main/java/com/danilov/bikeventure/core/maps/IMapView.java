package com.danilov.bikeventure.core.maps;

/**
 * Created by semyon on 29.09.15.
 */
public interface IMapView {

    interface MapCallback {

        void onMapReady(final IMap map);

    }

}
