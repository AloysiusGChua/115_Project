package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizTwo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two4);

        ActionBar actionBarQuizTwo4 = getSupportActionBar();
        Button nBtnbackquiz24 = (Button)findViewById(R.id.quiztwoback4);
        nBtnbackquiz24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo4.this, QuizTwo3.class));
            }
        });

        Button nBtnnextquiz24 = (Button)findViewById(R.id.quiztwonext4);
        nBtnnextquiz24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo4.this, QuizTwo5.class));
            }
        });
    }
}
