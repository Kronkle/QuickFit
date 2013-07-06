package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GenExercise extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gen_exercise);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_gen_exercise, menu);
		return true;
	}
	
String name;
	
	public GenExercise(String exname){
		this.name = exname;
	}
	
	public String printName(){
		return this.name;
	}
	

}
