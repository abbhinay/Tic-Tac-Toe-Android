package com.example.abhinay.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneOnOne(View v){
        Intent i = new Intent(this, OneOnOne.class);
        startActivity(i);

    }

    public void unbeatable(View v){
        Log.d("killer", "unbeatable: inmain");
        Intent i = new Intent(this, Unbeatable.class);
        startActivity(i);
    }
}
