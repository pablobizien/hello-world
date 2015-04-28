package com.example.cocktail;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

  
public class MainActivity extends Activity {  
  
 MultiSelectionSpinner spinner;  
  
 @Override  
 protected void onCreate(Bundle savedInstanceState) {  
  super.onCreate(savedInstanceState);  
  setContentView(R.layout.activity_main);  
  String[] array = { "one", "two", "three" };  
  spinner = (MultiSelectionSpinner) findViewById(R.id.mySpinner1);  
  spinner.setItems(array);  
 }  
  
  public void onClick(View v){  
   String s = spinner.getSelectedItemsAsString();  
   Toast.makeText(getApplicationContext(), s , Toast.LENGTH_LONG).show();  
  }  
}  