package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFive3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five3);

        ActionBar actionBarQuizFive3 = getSupportActionBar();
        Button nBtnbackquiz53 = (Button)findViewById(R.id.quizfiveback3);
        nBtnbackquiz53.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive3.this, QuizFive2.class));
            }
        });

        Button nBtnnextquiz53 = (Button)findViewById(R.id.quizfivenext3);
        nBtnnextquiz53.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive3.this, QuizFive4.class));
            }
        });
    }
}
