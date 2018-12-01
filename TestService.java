package com.rohit.test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class TestService extends Service {
    private static final String TAG = "TestService";
    public TestService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("TestService", "StartingTheService");
        Toast.makeText(this, "Starting The Service", Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: Ending the Service" );
        Toast.makeText(this, "Ending the Service", Toast.LENGTH_LONG).show();
    }
}
