package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizThree3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three3);

        ActionBar actionBarQuizThree3 = getSupportActionBar();
        Button nBtnbackquiz33 = (Button)findViewById(R.id.quizthreeback3);
        nBtnbackquiz33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree3.this, QuizThree2.class));
            }
        });

        Button nBtnnextquiz33 = (Button)findViewById(R.id.quizthreenext3);
        nBtnnextquiz33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree3.this, QuizThree4.class));
            }
        });
    }
}
