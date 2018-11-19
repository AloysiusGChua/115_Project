package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_four);

        ActionBar actionBarLesson4 = getSupportActionBar();
        Button nBtncompletelesson4 = (Button)findViewById(R.id.completelessonfour);
        nBtncompletelesson4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LessonFour.this, TakeQuiz.class));
            }
        });
    }
}
