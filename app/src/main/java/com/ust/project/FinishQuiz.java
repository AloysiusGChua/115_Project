package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz);

        ActionBar actionBarretakequiz1 = getSupportActionBar();
        Button nBtnretakequiz1 = (Button)findViewById(R.id.retakequiz);
        nBtnretakequiz1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz.this, QuizOne.class));
            }
        });

        Button nBtnnextlesson1 = (Button)findViewById(R.id.nextlesson);
        nBtnnextlesson1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz.this, LessonTwo.class));
            }
        });

        Button nBtnseeanswers1 = (Button)findViewById(R.id.seeanswers);
        nBtnseeanswers1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz.this, AnswerQuiz1.class));
            }
        });
    }
}
