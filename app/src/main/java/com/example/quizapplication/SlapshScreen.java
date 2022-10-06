package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SlapshScreen extends AppCompatActivity {


    Handler Hamd;
    Runnable Rumbdle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slapsh_screen);

        Hamd = new Handler();
        Rumbdle = new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(SlapshScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Hamd.postDelayed(Rumbdle, 3000);
    }
}