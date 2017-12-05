package com.abhishek.firebaseexamplefcm;

import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.iid.zzi;

/**
 * Created by abhishek on 5/12/17.
 * service extending FireBaseInstanceIdService that handles the creation, rotation and updating
 * the registration tokens. It makes sure that the given message is send to specific devices/device group;
 */

public class MyAndroidFirebaseInstanceIDService extends FirebaseInstanceIdService
{
    public static final String TAG = "MyAndroidFirebaseInstanceIDService";

    @Override
    public void onTokenRefresh()
    {
        // get hold of the registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        
        //Log the token
        Log.d(TAG, "onTokenRefresh: " +refreshedToken);
    }

    private void sendRegistrationToServer(String token)
    {
        //Implement this method to store the token in the server.
        //TODO: IMEI - Token lookuptable on the server side.
    }

}
