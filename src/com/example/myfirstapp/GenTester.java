package com.example.myfirstapp;

import java.util.ArrayList;
import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GenTester extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gen_tester);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_gen_tester, menu);
		return true;
	}
	
	public static void main(String args[]){
		
		//Create sets of GenExercises for 3 types
		GenExercise Squats = new GenExercise("Squats");
		GenExercise Pushups = new GenExercise("Pushups");
		GenExercise Crunches = new GenExercise("Crunches");
		
		GenExercise Bootstrappers = new GenExercise("Bootstrappers");
		GenExercise handstandPushups = new GenExercise("Handstand Pushups");
		GenExercise sideCrunches = new GenExercise("Side Crunches");
		
		GenExercise lunges = new GenExercise("Lunges");
		GenExercise diamondPushups = new GenExercise("Diamond Pushups");
		GenExercise sitAndTucks = new GenExercise("Sit and Tucks");
		
		//Create arraylists of each of the 3 types of GenExercises
		ArrayList<GenExercise> lower = new ArrayList<GenExercise>();
		ArrayList<GenExercise> upper = new ArrayList<GenExercise>();
		ArrayList<GenExercise> core = new ArrayList<GenExercise>();
		
		//Add the GenExercises above to the arraylist of appropriate type
		lower.add(Squats);
		upper.add(Pushups);
		core.add(Crunches);
		
		lower.add(Bootstrappers);
		upper.add(handstandPushups);
		core.add(sideCrunches);
		
		lower.add(lunges);
		upper.add(diamondPushups);
		core.add(sitAndTucks);
		
		//Shuffle each arraylist so we can generate a random GenWorkout
		Collections.shuffle(lower);
		Collections.shuffle(upper);
		Collections.shuffle(core);
		
		//Create an arraylist to contain the random GenWorkout, add random elements from each type to it
		ArrayList<GenExercise> selectedGenExercises = new ArrayList<GenExercise>();
		selectedGenExercises.add(lower.get(0));
		selectedGenExercises.add(upper.get(0));
		selectedGenExercises.add(core.get(0));
		
		//Hardcode in GenSchema for now:
		GenSchema selectedGenSchema = new GenSchema(3, 25, 30);
		
		//Create new GenWorkout object with final random arrayList parameter, and output the GenWorkout contents
		GenWorkout GenWorkout = new GenWorkout(selectedGenExercises, selectedGenSchema);
		GenWorkout.showWorkout();
		
	}

}
