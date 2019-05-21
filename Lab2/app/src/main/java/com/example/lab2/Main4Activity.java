package com.example.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    private Button activity1;
    private Button activity2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        activity1 = findViewById(R.id.button);
        activity2 = findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("message");

        textView = findViewById(R.id.textView);
        textView.setText(text);

        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivty1();
            }
        });
        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivty2();
            }
        });


    }

    private void launchActivty2(){
        Intent intent = new Intent(this,Main2Activity.class);
        String text = "Przechodzisz z aktywności 3";
        intent.putExtra("message",text);
        startActivity(intent);
    }
    private void launchActivty1(){
        Intent intent = new Intent(this,MainActivity.class);
        String text = "Przechodzisz z aktywności 3";
        intent.putExtra("message",text);
        startActivity(intent);
    }
    }

