package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizTwo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two2);

        ActionBar actionBarQuizTwo2 = getSupportActionBar();
        Button nBtnbackquiz22 = (Button)findViewById(R.id.quiztwoback2);
        nBtnbackquiz22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo2.this, QuizTwo.class));
            }
        });

        Button nBtnnextquiz22 = (Button)findViewById(R.id.quiztwonext2);
        nBtnnextquiz22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo2.this, QuizTwo3.class));
            }
        });
    }
}
