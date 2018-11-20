package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishQuiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz3);

        ActionBar actionBarretakequiz3 = getSupportActionBar();
        Button nBtnretakequiz3 = (Button)findViewById(R.id.retakequiz3);
        nBtnretakequiz3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz3.this, QuizThree.class));
            }
        });

        Button nBtnnextlesson3 = (Button)findViewById(R.id.nextlesson3);
        nBtnnextlesson3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz3.this, LessonFour.class));
            }
        });

        Button nBtnseeanswers3 = (Button)findViewById(R.id.seeanswers3);
        nBtnseeanswers3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz3.this, AnswerQuiz3.class));
            }
        });
    }
}
