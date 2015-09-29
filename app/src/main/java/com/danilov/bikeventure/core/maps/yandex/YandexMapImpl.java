package com.danilov.bikeventure.core.maps.yandex;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.danilov.bikeventure.core.maps.IMap;

import java.util.HashMap;
import java.util.List;

import ru.yandex.yandexmapkit.MapController;
import ru.yandex.yandexmapkit.MapModel;
import ru.yandex.yandexmapkit.OverlayManager;
import ru.yandex.yandexmapkit.StartupController;
import ru.yandex.yandexmapkit.map.FileCache;
import ru.yandex.yandexmapkit.map.MapLayer;
import ru.yandex.yandexmapkit.map.OnMapListener;
import ru.yandex.yandexmapkit.map.Tile;
import ru.yandex.yandexmapkit.net.Downloader;
import ru.yandex.yandexmapkit.overlay.balloon.BalloonItem;
import ru.yandex.yandexmapkit.utils.GeoPoint;
import ru.yandex.yandexmapkit.utils.ScreenPoint;

/**
 * Created by semyon on 29.09.15.
 */
public class YandexMapImpl implements IMap {

    private MapController mapController;

    public YandexMapImpl(final MapController mapController) {
        this.mapController = mapController;
    }

    public View initializeScreenButtons() {
        return mapController.initializeScreenButtons();
    }

    public GeoPoint getMapCenter() {
        return mapController.getMapCenter();
    }

    public void zoomIn() {
        mapController.zoomIn();
    }

    public MapLayer getCurrentMapLayer() {
        return mapController.getCurrentMapLayer();
    }

    public MapLayer getMapLayerByLayerId(final int i) {
        return mapController.getMapLayerByLayerId(i);
    }

    public void surfaceDestroyed() {
        mapController.surfaceDestroyed();
    }

    public void showJamsButton(final boolean b) {
        mapController.showJamsButton(b);
    }

    public void setPositionNoAnimationTo(final GeoPoint geoPoint) {
        mapController.setPositionNoAnimationTo(geoPoint);
    }

    public void onScroll(final float v, final float v1, final float v2, final float v3) {
        mapController.onScroll(v, v1, v2, v3);
    }

    public void setPositionAnimationTo(final GeoPoint geoPoint) {
        mapController.setPositionAnimationTo(geoPoint);
    }

    public void notifyRepaint() {
        mapController.notifyRepaint();
    }

    public void setNightMode(final boolean b) {
        mapController.setNightMode(b);
    }

    public void onSingleTapUp(final float v, final float v1) {
        mapController.onSingleTapUp(v, v1);
    }

    public void removeMapListener(final OnMapListener onMapListener) {
        mapController.removeMapListener(onMapListener);
    }

    public void showRegion(final int i, final int i1, final int i2, final int i3) {
        mapController.showRegion(i, i1, i2, i3);
    }

    public void setRotateNoAnimtionTo(final float v) {
        mapController.setRotateNoAnimtionTo(v);
    }

    public void setZoomCurrent(final float v) {
        mapController.setZoomCurrent(v);
    }

    public void onDown(final float v, final float v1) {
        mapController.onDown(v, v1);
    }

    public void hideBalloon() {
        mapController.hideBalloon();
    }

    public boolean onTrackballEvent(final MotionEvent motionEvent) {
        return mapController.onTrackballEvent(motionEvent);
    }

    public void showZoomButtons(final boolean b) {
        mapController.showZoomButtons(b);
    }

    public static FileCache getFileCache() {
        return MapController.getFileCache();
    }

    public void onTwoFingersSingleTap(final float v, final float v1) {
        mapController.onTwoFingersSingleTap(v, v1);
    }

    public void onLongPress(final float v, final float v1) {
        mapController.onLongPress(v, v1);
    }

    public void addMapListener(final OnMapListener onMapListener) {
        mapController.addMapListener(onMapListener);
    }

    public Context getContext() {
        return mapController.getContext();
    }

    public void sizeChanged(final int i, final int i1) {
        mapController.sizeChanged(i, i1);
    }

    public void setPositionNoAnimationTo(final GeoPoint geoPoint, final float v) {
        mapController.setPositionNoAnimationTo(geoPoint, v);
    }

    public void showFindMeButton(final boolean b) {
        mapController.showFindMeButton(b);
    }

    public float getZoomCurrent() {
        return mapController.getZoomCurrent();
    }

    public void onUp(final float v, final float v1) {
        mapController.onUp(v, v1);
    }

    public void showBalloon(final BalloonItem balloonItem) {
        mapController.showBalloon(balloonItem);
    }

    public void onDoubleTap(final float v, final float v1) {
        mapController.onDoubleTap(v, v1);
    }

    public ViewGroup getParentViewGroup() {
        return mapController.getParentViewGroup();
    }

    public boolean isEnabled() {
        return mapController.isEnabled();
    }

    public boolean isTileVisible(final Tile tile) {
        return mapController.isTileVisible(tile);
    }

    public void onFling(final float v, final float v1) {
        mapController.onFling(v, v1);
    }

    public OverlayManager getOverlayManager() {
        return mapController.getOverlayManager();
    }

    public void onScaleEnd() {
        mapController.onScaleEnd();
    }

    public void setExtraStartupParams(final HashMap hashMap) {
        mapController.setExtraStartupParams(hashMap);
    }

    public void setViewport(final int i, final int i1, final int i2, final int i3) {
        mapController.setViewport(i, i1, i2, i3);
    }

    public void onScale(final float v, final float v1, final float v2) {
        mapController.onScale(v, v1, v2);
    }

    public void surfaceCreated() {
        mapController.surfaceCreated();
    }

    public List getListMapLayer() {
        return mapController.getListMapLayer();
    }

    public void setEnabled(final boolean b) {
        mapController.setEnabled(b);
    }

    public void showScaleView(final boolean b) {
        mapController.showScaleView(b);
    }

    public void onScaleBegin(final float v, final float v1) {
        mapController.onScaleBegin(v, v1);
    }

    public void setPositionAnimationTo(final GeoPoint geoPoint, final float v) {
        mapController.setPositionAnimationTo(geoPoint, v);
    }

    public void setHDMode(final boolean b) {
        mapController.setHDMode(b);
    }

    public boolean isJamsVisible() {
        return mapController.isJamsVisible();
    }

    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return mapController.onTouchEvent(motionEvent);
    }

    public ScreenPoint getScreenPoint(final GeoPoint geoPoint) {
        return mapController.getScreenPoint(geoPoint);
    }

    public boolean isHDMode() {
        return mapController.isHDMode();
    }

    public MapLayer getServiceMapLayer() {
        return mapController.getServiceMapLayer();
    }

    public void zoomOut(final float v, final float v1) {
        mapController.zoomOut(v, v1);
    }

    public MapModel getMapModel() {
        return mapController.getMapModel();
    }

    public void setJamsVisible(final boolean b) {
        mapController.setJamsVisible(b);
    }

    public Downloader getDownloader() {
        return mapController.getDownloader();
    }

    public MapLayer getMapLayerByLayerRequestName(final String s) {
        return mapController.getMapLayerByLayerRequestName(s);
    }

    public View getMapView() {
        return mapController.getMapView();
    }

    public void setCurrentMapLayer(final MapLayer mapLayer) {
        mapController.setCurrentMapLayer(mapLayer);
    }

    public boolean isNightMode() {
        return mapController.isNightMode();
    }

    public int getHeight() {
        return mapController.getHeight();
    }

    public StartupController getStartupController() {
        return mapController.getStartupController();
    }

    public String getApiKey() {
        return mapController.getApiKey();
    }

    public Rect getViewport() {
        return mapController.getViewport();
    }

    public int getWidth() {
        return mapController.getWidth();
    }

    public void setRotateAnimtionTo(final float v) {
        mapController.setRotateAnimtionTo(v);
    }

    public void setZoomToSpan(final double v, final double v1) {
        mapController.setZoomToSpan(v, v1);
    }

    public void zoomIn(final float v, final float v1) {
        mapController.zoomIn(v, v1);
    }

    public GeoPoint getGeoPoint(final ScreenPoint screenPoint) {
        return mapController.getGeoPoint(screenPoint);
    }

    public void zoomOut() {
        mapController.zoomOut();
    }
}
