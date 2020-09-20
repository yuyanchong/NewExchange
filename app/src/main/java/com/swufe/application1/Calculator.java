package com.swufe.application1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void addpoints(View view) {
        TextView tv =findViewById(R.id.textView6);
        tv.setText(String.valueOf(Integer.parseInt(tv.getText().toString())+Integer.parseInt(view.getTag().toString())));
    }
    //add something
    public void clear(View view) {
        TextView tv = findViewById(R.id.textView6);
        tv.setText("0");
    }
}