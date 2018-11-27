package com.ust.project;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.ArrayList;

public class SessionManager {
    SharedPreferences pref;
    Editor editor;
    Context context;

    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "SIKLAB_SESSION";
    private static final String LECTURE = "LECTURE";


    public SessionManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void updateLectureProgress(int lectureNumber) {
        editor.putInt(LECTURE, lectureNumber);
        editor.commit();
    }

    public int getLectureProgress() {
        return pref.getInt(LECTURE, 0);
    }
}