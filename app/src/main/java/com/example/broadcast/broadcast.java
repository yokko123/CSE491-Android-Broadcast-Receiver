package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.widget.Toast;

public class broadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if("com.example.EXAMPLE_ACTION".equals(intent.getAction())){
           String receivedText = intent.getStringExtra("com.example.EXTRA_TEXT");
            Toast.makeText(context, receivedText, Toast.LENGTH_SHORT).show();

        }

    }
}
