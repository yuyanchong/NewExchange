package com.swufe.application1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
    }

    public void convert(View view) {
        TextView tv=findViewById(R.id.textView3);
        TextView tv1=findViewById(R.id.editTextTextPersonName);
        tv.setText(String.valueOf(Float.parseFloat(tv1.getText().toString())*1.8+32));
    }
}