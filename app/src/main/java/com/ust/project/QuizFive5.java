package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFive5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five5);

        ActionBar actionBarQuizFive5 = getSupportActionBar();
        Button nBtnbackquiz55 = (Button)findViewById(R.id.quizfiveback5);
        nBtnbackquiz55.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive5.this, QuizFive4.class));
            }
        });

        Button nBtnnextquiz55 = (Button)findViewById(R.id.quizfivenext5);
        nBtnnextquiz55.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive5.this, TakeQuiz.class));
            }
        });
    }
}
