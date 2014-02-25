package com.smashdev.ssmash;


import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.GridView;
import android.app.Activity;


public class Game extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		
		
		Board someBoard = new Board();
		
		
		
		
		
	}
}