package com.smashdev.ssmash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {

	View begin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		begin = findViewById(R.id.bBegin);
		
		begin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Thread gameStart = new Thread() {
					public void run() {
						Intent openGameBoard = new Intent("com.smashdev.ssmash.GAME");
						startActivity(openGameBoard);
					}
				};
				gameStart.start();
				
			}
		});
	}

	
	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
