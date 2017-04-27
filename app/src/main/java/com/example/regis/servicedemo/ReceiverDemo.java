package com.example.regis.servicedemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class ReceiverDemo extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Os Started\n Time To start Service Demo  ",Toast.LENGTH_LONG).show();
        context.startService(new Intent(context,ServiceDemo.class));
    }
}
