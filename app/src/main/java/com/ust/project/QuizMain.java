package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        ActionBar actionBarQuiz = getSupportActionBar();

        Button nBtnquizone = (Button)findViewById(R.id.quizone);
        nBtnquizone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizMain.this, TakeQuiz.class));
            }
        });

        Button nBtnquiztwo = (Button)findViewById(R.id.quiztwo);
        nBtnquiztwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizMain.this, TakeQuiz2.class));
            }
        });

        Button nBtnquizthree = (Button)findViewById(R.id.quizthree);
        nBtnquizthree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizMain.this, TakeQuiz3.class));
            }
        });

        Button nBtnquizfour = (Button)findViewById(R.id.quizfour);
        nBtnquizfour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizMain.this, TakeQuiz4.class));
            }
        });

        Button nBtnquizfive = (Button)findViewById(R.id.quizfive);
        nBtnquizfive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizMain.this, TakeQuiz5.class));
            }
        });

    }
}
