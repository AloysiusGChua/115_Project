package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFour5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four5);

        ActionBar actionBarQuizFour5 = getSupportActionBar();
        Button nBtnbackquiz45 = (Button)findViewById(R.id.quizfourback5);
        nBtnbackquiz45.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour5.this, QuizFour4.class));
            }
        });

        Button nBtnnextquiz45 = (Button)findViewById(R.id.quizfournext5);
        nBtnnextquiz45.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour5.this, TakeQuiz.class));
            }
        });
    }
}
