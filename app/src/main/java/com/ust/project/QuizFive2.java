package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFive2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five2);

        ActionBar actionBarQuizFive2 = getSupportActionBar();
        Button nBtnbackquiz52 = (Button)findViewById(R.id.quizfiveback2);
        nBtnbackquiz52.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive2.this, QuizFive.class));
            }
        });

        Button nBtnnextquiz52 = (Button)findViewById(R.id.quizfivenext2);
        nBtnnextquiz52.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive2.this, QuizFive3.class));
            }
        });
    }
}
