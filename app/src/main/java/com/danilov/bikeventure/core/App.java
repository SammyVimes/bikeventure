package com.danilov.bikeventure.core;

import android.app.Application;
import android.util.Log;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Semyon on 29.09.2015.
 */
public class App extends Application {

    private static final String TAG = "BikeVentureApp";

    @Override
    public void onCreate() {
        super.onCreate();
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(final Thread thread, final Throwable ex) {
                Log.e(TAG, "Exception occured!", ex);
                defaultUncaughtExceptionHandler.uncaughtException(thread, ex);
            }
        });
        ActiveAndroid.initialize(this);
    }
}
