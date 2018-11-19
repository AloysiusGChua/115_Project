package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_three);

        ActionBar actionBarLesson3 = getSupportActionBar();
        Button nBtncompletelesson3 = (Button)findViewById(R.id.completelessonthree);
        nBtncompletelesson3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LessonThree.this, TakeQuiz.class));
            }
        });
    }
}
