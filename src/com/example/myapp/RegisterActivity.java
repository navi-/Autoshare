package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;

public class RegisterActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//Intent intent = getIntent();
		
		/*TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);

		setContentView(textView);*/
    }
	
	public void register(View view) {
		Toast.makeText(this, "User registration with server.", Toast.LENGTH_SHORT).show();
	}
}