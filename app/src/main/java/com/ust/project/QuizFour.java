package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four);

        ActionBar actionBarQuizFour = getSupportActionBar();
        Button nBtnnextquiz4 = (Button)findViewById(R.id.quizfournext);
        nBtnnextquiz4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizFour.this, QuizFour2.class));
            }
        });
    }
}
