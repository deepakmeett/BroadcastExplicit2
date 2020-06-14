package com.example.broadcastexplicit2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class ExplicitBroadcast2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText( context, "ExampleReceiver2 triggered", Toast.LENGTH_SHORT ).show();

    }
}
