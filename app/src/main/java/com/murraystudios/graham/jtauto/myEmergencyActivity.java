package com.murraystudios.graham.jtauto;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by Graham on 12/15/2015.
 */
public class myEmergencyActivity extends Activity {

    Toast newToast = new Toast(getApplicationContext());

    @Override
    public Context getApplicationContext() {


        newToast.makeText(getApplicationContext(), "INTENT SUCESS", Toast.LENGTH_LONG).show();


        return null;
    }
}