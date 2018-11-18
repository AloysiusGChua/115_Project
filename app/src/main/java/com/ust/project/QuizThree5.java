package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizThree5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three5);

        ActionBar actionBarQuizThree5 = getSupportActionBar();
        Button nBtnbackquiz35 = (Button)findViewById(R.id.quizthreeback5);
        nBtnbackquiz35.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree5.this, QuizThree4.class));
            }
        });

        Button nBtnnextquiz35 = (Button)findViewById(R.id.quizthreenext5);
        nBtnnextquiz35.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree5.this, QuizThree5.class));
            }
        });
    }
}
