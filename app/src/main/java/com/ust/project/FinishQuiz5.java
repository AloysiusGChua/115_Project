package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishQuiz5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz5);

        ActionBar actionBarretakequiz5 = getSupportActionBar();
        Button nBtnretakequiz5 = (Button)findViewById(R.id.retakequiz5);
        nBtnretakequiz5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz5.this, QuizFive.class));
            }
        });

        Button nBtnnextlesson5 = (Button)findViewById(R.id.nextlesson5);
        nBtnnextlesson5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz5.this, MainActivity.class));
            }
        });

        Button nBtnseeanswers5 = (Button)findViewById(R.id.seeanswers5);
        nBtnseeanswers5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz5.this, AnswerQuiz5.class));
            }
        });
    }
}
