package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.location.*;

public class ApplicationMain extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myapp.MESSAGE";
	public String message = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void sendMessage (View view)
	{
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
	
		public void findPeople (View view)
	{
		final LocationManager locationManager;
		/*Get current position and retrive the details of surrounding people*/
		locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
		
		LocationListener locationListener = new LocationListener() {
			
			@Override
			public void onLocationChanged(Location location) {
				message = String.format("Your Location \n Longitude: %1$s \n Latitude: %2$s", location.getLongitude(), location.getLatitude());
				Toast.makeText(ApplicationMain.this, message, Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {}
			
			@Override
			public void onProviderEnabled(String provider) {}
			
			@Override
			public void onProviderDisabled(String provider) {
				Toast.makeText(ApplicationMain.this, "Provider disabled by the user. GPS turned off", Toast.LENGTH_SHORT).show();
			}
		  };
		
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
		
		locationManager.removeUpdates(locationListener);
		//locationManager = null;
		
		/*Get location name using Map api and Latitude and Longitude*/
		//	Toast.makeText(MyFirstActivity.this, message, Toast.LENGTH_SHORT).show();			
		
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		/*EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);*/
		
		//Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}

}