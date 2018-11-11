package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        Button nBtn = (Button)findViewById(R.id.lessons);
        nBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, LessonMain.class));
            }
        });

        ActionBar actionBarProgress = getSupportActionBar();
        Button nBtnProgress = (Button)findViewById(R.id.progress);
        nBtnProgress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, ProgressMain.class));
            }
        });

        ActionBar actionBarQuiz = getSupportActionBar();
        Button nBtnQuiz = (Button)findViewById(R.id.quizzes);
        nBtnQuiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, QuizMain.class));
            }
        });
    }
}
