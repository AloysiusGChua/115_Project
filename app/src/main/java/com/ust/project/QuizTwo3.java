package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizTwo3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two3);

        ActionBar actionBarQuizTwo3 = getSupportActionBar();
        Button nBtnbackquiz23 = (Button)findViewById(R.id.quiztwoback3);
        nBtnbackquiz23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo3.this, QuizTwo2.class));
            }
        });

        Button nBtnnextquiz23 = (Button)findViewById(R.id.quiztwonext3);
        nBtnnextquiz23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizTwo3.this, QuizTwo4.class));
            }
        });
    }
}
