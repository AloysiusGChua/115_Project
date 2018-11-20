package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishQuiz4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz4);

        ActionBar actionBarretakequiz4 = getSupportActionBar();
        Button nBtnretakequiz4 = (Button)findViewById(R.id.retakequiz4);
        nBtnretakequiz4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz4.this, QuizFour.class));
            }
        });

        Button nBtnnextlesson4 = (Button)findViewById(R.id.nextlesson4);
        nBtnnextlesson4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz4.this, LessonFive.class));
            }
        });

        Button nBtnseeanswers4 = (Button)findViewById(R.id.seeanswers4);
        nBtnseeanswers4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz4.this, AnswerQuiz4.class));
            }
        });
    }
}
