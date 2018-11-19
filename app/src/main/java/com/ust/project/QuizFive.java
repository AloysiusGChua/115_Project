package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five);

        ActionBar actionBarQuizFive = getSupportActionBar();
        Button nBtnnextquiz5 = (Button)findViewById(R.id.quizfivenext);
        nBtnnextquiz5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFive.this, QuizFive2.class));
            }
        });
    }
}
