package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LessonMain extends AppCompatActivity {

    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_main);

        sessionManager = new SessionManager(getApplicationContext());
        int currentLesson = sessionManager.getLectureProgress();
        final int nextLesson = currentLesson + 1;

        ActionBar actionBar = getSupportActionBar();
        Button nBtn = (Button)findViewById(R.id.lessonone);
        nBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LessonMain.this, LessonOne.class));
            }
        });

        Button Btntwo = (Button)findViewById(R.id.lessontwo);
        Btntwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
            if (nextLesson >= 2) {
                startActivity(new Intent(LessonMain.this, LessonTwo.class));
            } else {
                Toast.makeText(getApplicationContext(), "You need to finish Lesson No. 1 first", Toast.LENGTH_SHORT).show();
            }
            }
        });

        Button Btnthree = (Button)findViewById(R.id.lessonthree);
        Btnthree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (nextLesson >= 3) {
                    startActivity(new Intent(LessonMain.this, LessonThree.class));
                } else {
                    Toast.makeText(getApplicationContext(), "You need to finish Lesson No. 2 first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button Btnfour = (Button)findViewById(R.id.lessonfour);
        Btnfour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (nextLesson >= 4) {
                    startActivity(new Intent(LessonMain.this, LessonFour.class));
                } else {
                    Toast.makeText(getApplicationContext(), "You need to finish Lesson No. 3 first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button Btnfive = (Button)findViewById(R.id.lessonfive);
        Btnfive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (nextLesson >= 5) {
                    startActivity(new Intent(LessonMain.this, LessonFive.class));
                } else {
                    Toast.makeText(getApplicationContext(), "You need to finish Lesson No. 4 first", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
