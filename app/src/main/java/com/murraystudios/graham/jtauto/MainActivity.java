package com.murraystudios.graham.jtauto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


                ImageButton eSettings = (ImageButton) findViewById(R.id.emergencySettingsButton);
                        eSettings.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent emergenencyIntent = new Intent(MainActivity.this, EmergencyTabbed2.class);
                                MainActivity.this.startActivity(emergenencyIntent);

                            }
                        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:2408182015"));
                startActivity(dialIntent);

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
