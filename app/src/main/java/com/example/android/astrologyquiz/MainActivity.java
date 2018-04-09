package com.example.android.astrologyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays a quiz on astrology questions and returns a quiz score result.
 */

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitQuiz(View view) {

        //Check what the user selected for question 1
        RadioButton radioLibra = (RadioButton) findViewById(R.id.radioLibra);
        boolean hasLibra = radioLibra.isChecked();

        RadioButton radioAquarius = (RadioButton) findViewById(R.id.radioAquarius);
        boolean hasAquarius = radioAquarius.isChecked();

        RadioButton radioScorpio = (RadioButton) findViewById(R.id.radioScorpio);
        boolean hasScorpio = radioScorpio.isChecked();

        // Check what the user entered for question 2

        EditText symbolCapricorn = findViewById(R.id.symbol);
        String symbol = symbolCapricorn.getText().toString();

        String search = "goat";
        boolean hasGoat = symbol.toLowerCase().contains(search.toLowerCase());

        // Check what the user selected for question 3

        CheckBox reliableCheck = (CheckBox) findViewById(R.id.reliable_checkbox);
        boolean hasReliable = reliableCheck.isChecked();

        CheckBox intenseCheck = (CheckBox) findViewById(R.id.intense_checkbox);
        boolean hasIntense = intenseCheck.isChecked();

        CheckBox stubbornCheck = (CheckBox) findViewById(R.id.stubborn_checkbox);
        boolean hasStubborn = stubbornCheck.isChecked();

        // Check what the user selected for question 4

        RadioButton radioLeo = (RadioButton) findViewById(R.id.radioLeo);
        boolean hasLeo = radioLeo.isChecked();

        RadioButton radioVirgo = (RadioButton) findViewById(R.id.radioVirgo);
        boolean hasVirgo = radioVirgo.isChecked();

        RadioButton radioAries = (RadioButton) findViewById(R.id.radioAries);
        boolean hasAries = radioAries.isChecked();

        RadioButton radioGemini = (RadioButton) findViewById(R.id.radioGemini);
        boolean hasGemini = radioGemini.isChecked();

        // Check what the user selected for question 5

        RadioButton radioSagittarius = (RadioButton) findViewById(R.id.radioSagittarius);
        boolean hasSagittarius = radioSagittarius.isChecked();

        RadioButton radioCancer = (RadioButton) findViewById(R.id.radioCancer);
        boolean hasCancer = radioCancer.isChecked();

        RadioButton radioPisces = (RadioButton) findViewById(R.id.radioPisces);
        boolean hasPisces = radioPisces.isChecked();

        int score = calculateScore(hasLibra, hasAquarius, hasScorpio, hasGoat, hasReliable, hasIntense, hasStubborn, hasLeo, hasVirgo, hasAries, hasGemini, hasSagittarius, hasCancer, hasPisces);


        // Show score as a toast

        if (score == 0)
        {
            Toast.makeText(this, "Try again! You scored 0 out of 5!", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;

        } else {

        Toast.makeText(this, "Awesome! You scored " + score + " out of 5!", Toast.LENGTH_SHORT).show();
        // Exit this method early because there's nothing left to do
        return; }
    }


    /**
     * Calculates the score of the quiz.
     *
     * @param
     * @param
     * @return total score
     */
    private int calculateScore(boolean addLibra, boolean addAquarius, boolean addScorpio, boolean addGoat, boolean addReliable, boolean addIntense, boolean addStubborn, boolean addLeo, boolean addVirgo, boolean addAries, boolean addGemini, boolean addSagittarius, boolean addCancer, boolean addPisces) {
        int totalScore = 0;

        // Check question 1

        if (addLibra) {
            totalScore = totalScore + 0;
        }

        if (addAquarius) {
            totalScore = totalScore + 0;
        }

        if (addScorpio) {
            totalScore = totalScore + 1;
        }

        // Check question 2

        if (addGoat) {
            totalScore = totalScore + 1;
        }

        // Check question 3

        if (addIntense) {
            totalScore = totalScore + 0;
        }

        if (addReliable) {
            totalScore = totalScore + 0;
        }

        if (addStubborn) {
            totalScore = totalScore + 0;
        }

        if (addReliable && addStubborn && addIntense == false) {
            totalScore = totalScore + 1;
        }


        // Check question 4

        if (addLeo) {
            totalScore = totalScore + 0;
        }

        if (addVirgo) {
            totalScore = totalScore + 0;
        }

        if (addAries) {
            totalScore = totalScore + 1;
        }

        if (addGemini) {
            totalScore = totalScore + 0;
        }

        // Check question 5

        if (addSagittarius) {
            totalScore = totalScore + 0;
        }

        if (addCancer) {
            totalScore = totalScore + 1;
        }

        if (addPisces) {
            totalScore = totalScore + 0;
        }


        // Return the total score

        return totalScore;


    }



}
