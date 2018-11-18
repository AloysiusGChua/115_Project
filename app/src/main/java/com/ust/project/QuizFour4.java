package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFour4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four4);

        ActionBar actionBarQuizFour4 = getSupportActionBar();
        Button nBtnbackquiz44 = (Button)findViewById(R.id.quizfourback4);
        nBtnbackquiz44.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour4.this, QuizFour3.class));
            }
        });

        Button nBtnnextquiz44 = (Button)findViewById(R.id.quizfournext4);
        nBtnnextquiz44.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour4.this, QuizFour5.class));
            }
        });
    }
}
