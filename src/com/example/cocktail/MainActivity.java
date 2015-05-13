package com.example.cocktail;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

  
public class MainActivity extends Activity {  
  
 MultiSelectionSpinner spinner1;  
 MultiSelectionSpinner spinner2;
 
 
 @Override  
 protected void onCreate(Bundle savedInstanceState) {  
  super.onCreate(savedInstanceState);  
  setContentView(R.layout.activity_main);  
  String[] soft = { "Jus d'orange", "Sirop de grenadine", "Lait" };  
  String[] alcool = { "Vodka", "Rhum", "Liqueur de Café", "Vin blanc" }; 
  spinner1 = (MultiSelectionSpinner) findViewById(R.id.mySpinner1);  
  spinner2 = (MultiSelectionSpinner) findViewById(R.id.mySpinner2);  
  spinner1.setItems(soft); 
  spinner2.setItems(alcool);  

 }  
  
  public void onClick(View v){  
   String s = spinner1.getSelectedItemsAsString() + ", " + spinner2.getSelectedItemsAsString();  
   Toast.makeText(getApplicationContext(), s , Toast.LENGTH_LONG).show();  
  }  
}  