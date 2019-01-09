package com.example.kuvar.neverendingandroidservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SensorRestarterBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(SensorRestarterBroadcastReceiver.class.getSimpleName(), "Service Stops! Oooooooooooooppppssssss!!!!");
        Toast.makeText(context,"Service Stops! Oooooooooooooppppssssss!!!!",Toast.LENGTH_SHORT).show();
        context.startService(new Intent(context, SensorService.class));
    }
}
