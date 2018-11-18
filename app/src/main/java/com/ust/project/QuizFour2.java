package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFour2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four2);

        ActionBar actionBarQuizFour2 = getSupportActionBar();
        Button nBtnbackquiz42 = (Button)findViewById(R.id.quizfourback2);
        nBtnbackquiz42.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour2.this, QuizFour.class));
            }
        });

        Button nBtnnextquiz42 = (Button)findViewById(R.id.quizfournext2);
        nBtnnextquiz42.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour2.this, QuizFour3.class));
            }
        });
    }
}
