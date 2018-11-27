package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProgressMain extends AppCompatActivity {

    TextView lessonTracker;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_main);

        sessionManager = new SessionManager(getApplicationContext());

        ActionBar actionBarProgress = getSupportActionBar();
        lessonTracker = (TextView) findViewById(R.id.lesson_tracker);
        lessonTracker.setText(Integer.toString(sessionManager.getLectureProgress()));
    }
}
