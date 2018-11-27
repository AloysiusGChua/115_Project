package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ust.project.database.DatabaseHelper;

public class LessonFive extends AppCompatActivity {

    SessionManager sessionManager;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five);

        sessionManager = new SessionManager(getApplicationContext());
        databaseHelper = new DatabaseHelper(getApplicationContext());

        ActionBar actionBarLesson5 = getSupportActionBar();
        Button nBtncompletelesson5 = (Button)findViewById(R.id.completelessonfive);
        nBtncompletelesson5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                sessionManager.updateLectureProgress(5);
                databaseHelper.updateLessonState(5, 1);
                startActivity(new Intent(LessonFive.this, TakeQuiz5.class));
            }
        });

    }
}
