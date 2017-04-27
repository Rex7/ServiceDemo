package com.example.regis.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;


public class ServiceDemo extends Service {

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {

        Toast.makeText(this, "Service is Stopped", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int flag, int id) {
        Log.v("message ", "Intent Name ");
        Toast.makeText(this, "My service is up and running", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }
}
