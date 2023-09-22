package com.cs407.lab2calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        textView = (TextView) findViewById(R.id.Result);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Message"));
    }

    public void returnHome(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}