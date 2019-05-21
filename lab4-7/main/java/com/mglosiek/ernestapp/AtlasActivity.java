package com.mglosiek.ernestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.kosmalski.goodapp.R;

public class AtlasActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String text;
    RadioGroup radioGroup;
    int trainPartInt;
    Long levelInt;
    int inHallInt;
    Button buttonShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atlas);

        Spinner spinner =findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.level, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        buttonShow = (Button)findViewById(R.id.buttonShow);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            ImageView img= (ImageView) findViewById(R.id.imageView);
            TextView textView = findViewById(R.id.textView3);
            @Override
            public void onClick(View v) {
                if (levelInt == 0 && trainPartInt == 1 && inHallInt ==0 ) {
                    img.setImageResource(R.drawable.d1);
                    textView.setText(R.string.d1);
                }

                else if (levelInt == 0 && trainPartInt == 2 && inHallInt ==0 ) {
                    img.setImageResource(R.drawable.s1);
                    textView.setText(R.string.s1);
                }

                else if (levelInt == 0 && trainPartInt == 3 && inHallInt ==0 ) {
                    img.setImageResource(R.drawable.def1);
                    textView.setText(R.string.def1);
                }

                else if (levelInt == 0 && trainPartInt == 1 && inHallInt ==1 ) {
                    img.setImageResource(R.drawable.d2);
                    textView.setText(R.string.d2);
                }

                else if (levelInt == 0 && trainPartInt == 2 && inHallInt ==1 ) {
                    img.setImageResource(R.drawable.s2);
                    textView.setText(R.string.s2);
                }

                else if (levelInt == 0 && trainPartInt == 3 && inHallInt ==1 ) {
                    img.setImageResource(R.drawable.def2);
                    textView.setText(R.string.def2);
                }

                else if (levelInt == 1 && trainPartInt == 1 && inHallInt ==0 ) {
                    img.setImageResource(R.drawable.d3);
                    textView.setText(R.string.d3);
                }

                else if (levelInt == 1 && trainPartInt == 2 && inHallInt ==0 ) {
                    img.setImageResource(R.drawable.s3);
                    textView.setText(R.string.s3);
                }

                else if (levelInt == 1 && trainPartInt == 3 && inHallInt ==0 ) {
                    img.setImageResource(R.drawable.def1);
                    textView.setText(R.string.def1);
                }

                else if (levelInt == 1 && trainPartInt == 1 && inHallInt ==1 ) {
                    img.setImageResource(R.drawable.d2);
                    textView.setText(R.string.d2);
                }

                else if (levelInt == 1 && trainPartInt == 2 && inHallInt ==1 ) {
                    img.setImageResource(R.drawable.s2);
                    textView.setText(R.string.s2);
                }

                else if (levelInt == 1 && trainPartInt == 3 && inHallInt ==1 ) {
                    img.setImageResource(R.drawable.def2);
                    textView.setText(R.string.def2);
                }

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        levelInt=id;

        //text = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),text+String.valueOf(bodyPartInt)+String.valueOf(id)+String.valueOf(inHomeInt),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case  R.id.radioDribling:
                if (checked)
                    trainPartInt=1;

                break;




            case R.id.radioShot:
                if (checked)
                    trainPartInt=2;
                   // Toast.makeText(getApplicationContext(),"Klata"+String.valueOf(bodyPartInt)+String.valueOf(levelInt),Toast.LENGTH_LONG).show();
                break;

            case R.id.radioDefend:
                if (checked)
                    trainPartInt=3;
                   // Toast.makeText(getApplicationContext(),"Nogi"+String.valueOf(bodyPartInt)+String.valueOf(levelInt),Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked)
                    inHallInt=1;

            else
                    inHallInt=0;

        }
    }

//    ImageView img= (ImageView) findViewById(R.id.imageView);
//                img.setImageResource(R.drawable.ic_launcher_background);
//    TextView textView = findViewById(R.id.textView3);
//                textView.setText(" wpisz swoje parametry");

}
