package com.example.lab3;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private Switch aSwitch;
    private ConstraintLayout constraintLayout;
    private CheckBox checkBox;
    private Spinner spinner;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        aSwitch = findViewById(R.id.switch1);
        constraintLayout = findViewById(R.id.container);
        checkBox = findViewById(R.id.checkBox);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);


        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    constraintLayout.setBackgroundColor(Color.RED);
                } else {
                    constraintLayout.setBackgroundColor(Color.WHITE);
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    launchActivty2();
                }
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner.getSelectedItem().equals("Dog")) {
                    imageView.setImageResource(R.drawable.dog_meme);
                } else if (spinner.getSelectedItem().equals("Cat")) {
                    imageView.setImageResource(R.drawable.cat_meme);
                } else {
                    imageView.setImageResource(R.drawable.hamster_meme);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

        private void launchActivty2() {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }
    }

