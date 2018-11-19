package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        ActionBar actionBarLesson1 = getSupportActionBar();
        Button nBtncompletelesson1 = (Button)findViewById(R.id.completelessonone);
        nBtncompletelesson1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LessonOne.this, TakeQuiz.class));
            }
        });
    }
}
