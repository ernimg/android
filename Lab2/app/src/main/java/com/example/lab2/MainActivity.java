package com.example.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button activity2;
    private Button activity3;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    activity2 = findViewById(R.id.button);

    activity3 = findViewById(R.id.button2);



          Bundle bundle = getIntent().getExtras();
          if (bundle != null){
              String text = bundle.getString("message");

              textView = findViewById(R.id.textView);
              textView.setText(text);
          }


    activity2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            launchActivty2();
        }
    });
        activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivty3();
            }
        });


    }

    private void launchActivty2(){
        Intent intent = new Intent(this,Main2Activity.class);
        String text = "test aktywność 1, przejście ";
        intent.putExtra("message",text);
        startActivity(intent);
    }
    private void launchActivty3(){
        Intent intent = new Intent(this,Main4Activity.class);
        String text = "Przechodzisz z aktywności ";
        intent.putExtra("message",text);
        startActivity(intent);
    }
}
