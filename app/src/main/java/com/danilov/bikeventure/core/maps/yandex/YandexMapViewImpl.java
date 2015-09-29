package com.danilov.bikeventure.core.maps.yandex;

import android.view.View;

import com.danilov.bikeventure.core.maps.IMapView;

import ru.yandex.yandexmapkit.MapController;
import ru.yandex.yandexmapkit.MapView;

/**
 * Created by semyon on 29.09.15.
 */
public class YandexMapViewImpl implements IMapView {

    private MapView yandexMapView;

    public View getSurfaceView() {
        return yandexMapView.getSurfaceView();
    }

    public static boolean isShareMemory() {
        return MapView.isShareMemory();
    }

    public void showBuiltInScreenButtons(final boolean b) {
        yandexMapView.showBuiltInScreenButtons(b);
    }

    public void showJamsButton(final boolean show) {
        yandexMapView.showJamsButton(show);
    }

    public void showFindMeButton(final boolean show) {
        yandexMapView.showFindMeButton(show);
    }

    public void showZoomButtons(final boolean show) {
        yandexMapView.showZoomButtons(show);
    }

    public void showScaleView(final boolean show) {
        yandexMapView.showScaleView(show);
    }

    public MapController getMapController() {
        return yandexMapView.getMapController();
    }

    public String getApiKey() {
        return yandexMapView.getApiKey();
    }

}
