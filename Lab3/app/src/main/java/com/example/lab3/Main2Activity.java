package com.example.lab3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button button;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button2);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        final Context context = this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton1.isChecked()) {
                    Toast.makeText(context, "ZAZNACZ 1", Toast.LENGTH_SHORT).show();


                } else if (radioButton2.isChecked()) {
                    Toast.makeText(context, "ZAZNACZ 2", Toast.LENGTH_SHORT).show();

                }
                radioButton2.setChecked(false);
                radioButton1.setChecked(false);
            }
        });


    }
}
