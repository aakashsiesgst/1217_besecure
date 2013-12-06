package com.example.besecure;

import com.example.besecure.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.telephony.SmsManager;

public class StartPoint extends Activity {

	Button send;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_point);
		send = (Button) findViewById(R.id.button1);
		send.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String phoneNumber = "8976650862";
				String message = "Hey ! I am in danger. Help !";

				SmsManager smsManager = SmsManager.getDefault();
				smsManager.sendTextMessage(phoneNumber, null, message, null,
						null);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_point, menu);
		return true;
	}

}
