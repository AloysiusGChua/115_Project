package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFive4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five4);

        ActionBar actionBarQuizFive4 = getSupportActionBar();
        Button nBtnbackquiz54 = (Button)findViewById(R.id.quizfiveback4);
        nBtnbackquiz54.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive4.this, QuizFive3.class));
            }
        });

        Button nBtnnextquiz54 = (Button)findViewById(R.id.quizfivenext4);
        nBtnnextquiz54.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive4.this, QuizFive5.class));
            }
        });
    }
}
