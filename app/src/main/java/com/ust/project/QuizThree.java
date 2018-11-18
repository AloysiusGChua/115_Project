package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three);

        ActionBar actionBarQuizThree = getSupportActionBar();
        Button nBtnnextquiz3 = (Button)findViewById(R.id.quizthreenext);
        nBtnnextquiz3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizThree.this, QuizThree2.class));
            }
        });
    }
}
