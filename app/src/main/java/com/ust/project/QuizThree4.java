package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizThree4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three4);

        ActionBar actionBarQuizThree4 = getSupportActionBar();
        Button nBtnbackquiz34 = (Button)findViewById(R.id.quizthreeback4);
        nBtnbackquiz34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree4.this, QuizThree3.class));
            }
        });

        Button nBtnnextquiz34 = (Button)findViewById(R.id.quizthreenext4);
        nBtnnextquiz34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree4.this, QuizThree5.class));
            }
        });
    }
}
