package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizThree2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three2);

        ActionBar actionBarQuizThree2 = getSupportActionBar();
        Button nBtnbackquiz32 = (Button)findViewById(R.id.quizthreeback2);
        nBtnbackquiz32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree2.this, QuizThree.class));
            }
        });

        Button nBtnnextquiz32 = (Button)findViewById(R.id.quizthreenext2);
        nBtnnextquiz32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree2.this, QuizThree3.class));
            }
        });
    }
}
