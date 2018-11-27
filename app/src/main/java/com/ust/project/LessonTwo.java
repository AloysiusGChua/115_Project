package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ust.project.database.DatabaseHelper;

public class LessonTwo extends AppCompatActivity {

    SessionManager sessionManager;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        sessionManager = new SessionManager(getApplicationContext());
        databaseHelper = new DatabaseHelper(getApplicationContext());

        ActionBar actionBarLesson2 = getSupportActionBar();
        Button nBtncompletelesson2 = (Button)findViewById(R.id.completelessontwo);
        nBtncompletelesson2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                sessionManager.updateLectureProgress(2);
                databaseHelper.updateLessonState(2, 1);
                startActivity(new Intent(LessonTwo.this, TakeQuiz2.class));
            }
        });
    }
}
