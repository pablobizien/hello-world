package com.example.cocktail;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Proposition_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proposition);
	}
	
	
	public void onClick(View v){  
		   Toast.makeText(getApplicationContext(), "Que faire sur ce bouton ?" , Toast.LENGTH_LONG).show();  
		  
}

	public void onClickCocktail(View v){  
		   Toast.makeText(getApplicationContext(), "Comment le réaliser ?" , Toast.LENGTH_LONG).show();  
		  
}

	
}