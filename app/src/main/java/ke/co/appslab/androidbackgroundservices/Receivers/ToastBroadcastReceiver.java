package ke.co.appslab.androidbackgroundservices.Receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import ke.co.appslab.androidbackgroundservices.Services.BackgroundService;

/**
 * Created by harun on 1/10/18.
 */

public class ToastBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serviceIntent= new Intent(context,BackgroundService.class);
        context.startService(serviceIntent);

    }
}
