package com.techina.android;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class SplashActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.splash);
		TextView tv = (TextView)findViewById(R.id.textView1);
		tv.setText("呵呵");
	
	}
}
