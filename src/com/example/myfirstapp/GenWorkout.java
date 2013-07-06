package com.example.myfirstapp;



import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GenWorkout extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gen_workout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_gen_workout, menu);
		return true;
	}
	
	ArrayList<GenExercise> exerciseList = new ArrayList<GenExercise>();
	GenSchema schema;
	
	public GenWorkout(ArrayList<GenExercise> exercises, GenSchema schema){
		this.exerciseList = exercises;
		this.schema = schema;
	}
	
	public String showWorkout(){
		String finalSchema = schema.printSchema();
		String finalExercises = exerciseList.get(0).printName();
		
		String listString = "";
		
		for (GenExercise s : exerciseList)
		{
		    listString += "\n" + s.printName() + " ";
		}
		
			String newFinal = finalSchema.concat(listString);
			return newFinal;
	}

}
