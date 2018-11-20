package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishQuiz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz2);

        ActionBar actionBarretakequiz2 = getSupportActionBar();
        Button nBtnretakequiz2 = (Button)findViewById(R.id.retakequiz2);
        nBtnretakequiz2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz2.this, QuizTwo.class));
            }
        });

        Button nBtnnextlesson2 = (Button)findViewById(R.id.nextlesson2);
        nBtnnextlesson2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz2.this, LessonThree.class));
            }
        });

        Button nBtnseeanswers2 = (Button)findViewById(R.id.seeanswers2);
        nBtnseeanswers2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(FinishQuiz2.this, AnswerQuiz2.class));
            }
        });
    }
}
