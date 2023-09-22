package com.cs407.lab2calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMult(View view){
        Log.i("INFO", "Mult");
        EditText e1 = (EditText) findViewById(R.id.int1);
        EditText e2 = (EditText) findViewById(R.id.int2);

        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();

        int fv1 = Integer.parseInt(v1);
        int fv2 = Integer.parseInt(v2);
        goToActivity(String.valueOf(fv1 * fv2));
    }

    public void clickDiv(View view){
        Log.i("INFO", "Div");
        EditText e1 = (EditText) findViewById(R.id.int1);
        EditText e2 = (EditText) findViewById(R.id.int2);

        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();

        int fv1 = Integer.parseInt(v1);
        int fv2 = Integer.parseInt(v2);
        if (fv2 == 0) {
            goToActivity("Divide by 0 Error");
        } else {
            goToActivity(String.valueOf((double)fv1 / (double)fv2));
        }

    }

    public void clickPlus(View view){
        Log.i("INFO", "Plus");
        EditText e1 = (EditText) findViewById(R.id.int1);
        EditText e2 = (EditText) findViewById(R.id.int2);

        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();

        int fv1 = Integer.parseInt(v1);
        int fv2 = Integer.parseInt(v2);
        goToActivity(String.valueOf(fv1 + fv2));
    }

    public void clickMin(View view){
        Log.i("INFO", "Min");
        EditText e1 = (EditText) findViewById(R.id.int1);
        EditText e2 = (EditText) findViewById(R.id.int2);

        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();

        int fv1 = Integer.parseInt(v1);
        int fv2 = Integer.parseInt(v2);
        goToActivity(String.valueOf(fv1 - fv2));
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this,ResultScreen.class);
        intent.putExtra("Message",s);
        startActivity(intent);
    }
}