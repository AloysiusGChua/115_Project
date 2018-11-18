package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFour3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four3);

        ActionBar actionBarQuizFour3 = getSupportActionBar();
        Button nBtnbackquiz43 = (Button)findViewById(R.id.quizfourback3);
        nBtnbackquiz43.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour3.this, QuizFour2.class));
            }
        });

        Button nBtnnextquiz43 = (Button)findViewById(R.id.quizfournext3);
        nBtnnextquiz43.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour3.this, QuizFour4.class));
            }
        });
    }
}
