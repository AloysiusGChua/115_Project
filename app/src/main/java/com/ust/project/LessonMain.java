package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class LessonMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_main);

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
                startActivity(new Intent(LessonMain.this, LessonTwo.class));
            }
        });

        Button Btnthree = (Button)findViewById(R.id.lessonthree);
        Btnthree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LessonMain.this, LessonThree.class));
            }
        });

        Button Btnfour = (Button)findViewById(R.id.lessonfour);
        Btnfour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LessonMain.this, LessonFour.class));
            }
        });

        Button Btnfive = (Button)findViewById(R.id.lessonfive);
        Btnfive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LessonMain.this, LessonFive.class));
            }
        });

    }

}
