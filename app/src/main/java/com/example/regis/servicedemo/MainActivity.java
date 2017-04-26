package com.example.regis.servicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void startingService(View view){
        Intent i = new Intent(getBaseContext(),ServiceDemo.class);
        startService(i);
    }
    public void stoppingService(View view){
        Intent i = new Intent(this,ServiceDemo.class);
        stopService(i);
    }

}
