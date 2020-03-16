package com.familyhouse.linens;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText showValue;
    int counter = 1;

    EditText showNumbers;
    int count = 1;

    EditText showCloth;
    int wash = 1;

    EditText showBath;
    int bath = 1;

    EditText showBlue;
    int blue = 1;

    EditText showTwin;
    int twin =  1;

    EditText showQueen;
    int queen = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        showValue = (EditText) findViewById(R.id.counterValue);
        showNumbers = (EditText) findViewById(R.id.counterValue2);
        showCloth = (EditText) findViewById(R.id.counterValue3);
        showBath = (EditText) findViewById(R.id.counterValue4);
        showBlue = (EditText) findViewById(R.id.counterValue5);
        showTwin = (EditText) findViewById(R.id.counterValue6);
        showQueen = (EditText) findViewById(R.id.counterValue7);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.house, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    public void countIN (View view) {
        counter++;
        showValue.setText(Integer.toString(counter));
    }

    public void countIN2 (View view) {
        count++;
        showNumbers.setText(Integer.toString(count));
    }

    public void countIN3 (View view) {
        wash++;
        showCloth.setText(Integer.toString(wash));
    }

    public void countIN4 (View view) {
        bath++;
        showBath.setText(Integer.toString(bath));
    }

    public void countIN5 (View view) {
        blue++;
        showBlue.setText(Integer.toString(blue));
    }

    public void countIN6 (View view) {
        twin++;
        showTwin.setText(Integer.toString(twin));
    }

    public void countIN7 (View view) {
        queen++;
        showQueen.setText(Integer.toString(queen));
    }

    public void countDE (View view) {
        counter--;
        showValue.setText(Integer.toString(counter));
    }

    public void countDE2 (View view) {
        count--;
        showNumbers.setText(Integer.toString(count));
    }

    public void countDE3 (View view) {
        wash--;
        showCloth.setText(Integer.toString(wash));
    }

    public void countDE4 (View view) {
        bath--;
        showBath.setText(Integer.toString(bath));
    }

    public void countDE5 (View view) {
        blue--;
        showBlue.setText(Integer.toString(blue));
    }

    public void countDE6 (View view) {
        twin--;
        showTwin.setText(Integer.toString(twin));
    }

    public void countDE7 (View view) {
        queen--;
        showQueen.setText(Integer.toString(queen));
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

