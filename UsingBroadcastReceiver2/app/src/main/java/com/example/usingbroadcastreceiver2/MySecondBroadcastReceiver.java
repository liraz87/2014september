package com.example.usingbroadcastreceiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by eladlavi on 12/28/14.
 */
public class MySecondBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "we are in SECOND onReceive: " +
                intent.getStringExtra("aa"), Toast.LENGTH_LONG).show();
        abortBroadcast();

    }
}
