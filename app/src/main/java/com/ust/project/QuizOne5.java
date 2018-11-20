package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizOne5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one5);

        ActionBar actionBarQuizOne5 = getSupportActionBar();
        Button nBtnback5 = (Button)findViewById(R.id.quizoneback5);
        nBtnback5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne5.this, QuizOne4.class));
            }
        });

        Button nBtnnext5 = (Button)findViewById(R.id.quizonenext5);
        nBtnnext5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne5.this, FinishQuiz.class));
            }
        });
    }
}
