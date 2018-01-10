package ke.co.appslab.androidbackgroundservices.Receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

/**
 * Created by harun on 1/10/18.
 */

public class ResponseBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //get the broadcast message
        int resultCode=intent.getIntExtra("resultCode",RESULT_CANCELED);
        if (resultCode==RESULT_OK){
            String message=intent.getStringExtra("toastMessage");
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
        }
    }
}
