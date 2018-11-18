package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizTwo5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBarQuizTwo5 = getSupportActionBar();
        Button nBtnbackquiz25 = (Button)findViewById(R.id.quiztwoback5);
        nBtnbackquiz25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo5.this, QuizTwo4.class));
            }
        });

        Button nBtnnextquiz25 = (Button)findViewById(R.id.quiztwonext5);
        nBtnnextquiz25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo5.this, QuizTwo5.class));
            }
        });
    }
}
