package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ust.project.database.DatabaseHelper;


public class LessonOne extends AppCompatActivity {

    SessionManager sessionManager;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        sessionManager = new SessionManager(getApplicationContext());
        databaseHelper = new DatabaseHelper(getApplicationContext());

        ActionBar actionBarLesson1 = getSupportActionBar();
        Button nBtncompletelesson1 = (Button)findViewById(R.id.completelessonone);
        nBtncompletelesson1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                sessionManager.updateLectureProgress(1);
                databaseHelper.updateLessonState(1, 1);
                startActivity(new Intent(LessonOne.this, TakeQuiz.class));
            }
        });
    }
}
