package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.location.*;

public class MyFirstActivity extends Activity
{

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
    }

	public void create_account (View view)
	{
		Intent intent = new Intent(this, RegisterActivity.class);
		startActivity(intent);
		/*
			Location lastKnownLocation = locationManager.getLastKnownLocation(locationManager.NETWORK_PROVIDER);
			
			String message = String.format(
                    "Your Location \n Longitude: %1$s \n Latitude: %2$s",
                    lastKnownLocation.getLongitude(), lastKnownLocation.getLatitude());
			
			Toast.makeText(MyFirstActivity.this, message, Toast.LENGTH_SHORT).show();
*/
	}
	
	public void verify_login (View view)
	{
	// Code to verify login
		/*After login verification*/
		Intent intent = new Intent(this, ApplicationMain.class);
		startActivity(intent);
	}
}
