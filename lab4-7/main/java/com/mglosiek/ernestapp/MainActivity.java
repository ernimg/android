package com.mglosiek.ernestapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kosmalski.goodapp.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonCompedium;
    private Button buttonNote;
    private Button buttonTimer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCompedium = (Button) findViewById(R.id.button3);
        buttonCompedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtlasActuvity();
            }
        });

        buttonNote = (Button) findViewById(R.id.button4);
        buttonNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoteActuvity();
            }
        });

        buttonTimer = (Button) findViewById(R.id.button6);
        buttonTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimerActuvity();
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "ErnestApp to aplikacja dla piłkarzy\nStworzona przez Ernest Mgłosiek", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }



    private void openTimerActuvity() {
        Intent intentTimer = new Intent(this,TimerActivity.class);
        startActivity(intentTimer);
    }

    private void openNoteActuvity() {
        Intent intentNote = new Intent(this,MealActivity.class);
        startActivity(intentNote);
    }

    private void openAtlasActuvity() {

        Intent intentAtlas = new Intent(this,CompendiumActivity.class);
        startActivity(intentAtlas);
    }

}
