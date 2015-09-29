package com.danilov.bikeventure.core.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Semyon on 29.09.2015.
 */
public class BaseService extends Service {

    @Nullable
    @Override
    public IBinder onBind(final Intent intent) {
        return new ServiceConnector.ServiceBinder<>(this);
    }

    @Override
    public int onStartCommand(final Intent intent, final int flags, final int startId) {
        super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }

    public static <T extends Service> ServiceConnector<T> bindService(final Class<T> serviceClazz, final Context context, final ServiceConnector.ServiceListener<T> listener) {
        ServiceConnector<T> serviceConnection = new ServiceConnector<T>(listener);
        Intent intent = new Intent(context, serviceClazz);
        Intent startServiceIntent = new Intent(context, serviceClazz);
        context.startService(startServiceIntent);
        context.bindService(intent, serviceConnection, BIND_AUTO_CREATE);
        return serviceConnection;
    }


}
