package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GenSchema extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gen_schema);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_gen_schema, menu);
		return true;
	}
	
	private int sets;
	private int reps;
	private int time;
	
	public GenSchema(int sets, int reps, int time){
		this.sets = sets;
		this.reps = reps;
		this.time = time;
		
	}
	
	public String printSchema(){
		String finalSchema = "Perform " + sets + " sets of " + reps + " reps of each of these exercises, with " + time + " seconds between sets:";
		return finalSchema;
	}
	
}
