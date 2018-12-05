package com.ust.project.siklab.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "SIKLAB";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Answer.CREATE_TABLE);
        db.execSQL(Lesson.CREATE_TABLE);

        populateLesson(db);
        populateAnswer(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Answer.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Lesson.TABLE_NAME);
        onCreate(db);
    }

    public void populateLesson(SQLiteDatabase db) {
        int lessonCount = 5;

        for(int i = 0; i < lessonCount; i++) {
            ContentValues values = new ContentValues();
            values.put(Lesson.COL_LESSON_NUM, (i + 1));
            values.put(Lesson.COL_IS_LEARNED, 0);
            values.put(Lesson.COL_IS_QUIZ_TAKEN, 0);
            values.put(Lesson.COL_SCORE, 0);

            db.insert(Lesson.TABLE_NAME, null, values);
        }
    }

    public void populateAnswer(SQLiteDatabase db) {
        int lessonCount = 5;
        int questionCount = 5;

        for(int i = 0; i < lessonCount; i++) {
            for(int j = 0; j < questionCount; j++) {
                ContentValues values = new ContentValues();
                values.put(Answer.COL_LESSON_NUM, (i + 1));
                values.put(Answer.COL_ITEM_NUM, (j + 1));
                values.put(Answer.COL_ANSWER, 0);

                db.insert(Answer.TABLE_NAME, null, values);
            }
        }
    }

    public int updateAnswer(int lessonNum, int itemNum, int newAnswer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Answer.COL_ANSWER, newAnswer);

        return db.update(Answer.TABLE_NAME, values,
                Answer.COL_LESSON_NUM + "=? AND " + Answer.COL_ITEM_NUM + "=?",
                new String[]{String.valueOf(lessonNum), String.valueOf(itemNum)});
    }

    public int updateLessonState(int lessonNum, int isLearned) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Lesson.COL_IS_LEARNED, isLearned);

        return db.update(Lesson.TABLE_NAME, values, Lesson.COL_LESSON_NUM + "=?",
                new String[]{String.valueOf(lessonNum)});
    }

    public int updateLessonScore(int lessonNum, int score) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Lesson.COL_SCORE, score);

        return db.update(Lesson.TABLE_NAME, values, Lesson.COL_LESSON_NUM + "=?",
                new String[]{String.valueOf(lessonNum)});
    }

    public Lesson getLesson(int lessonNum) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Lesson.TABLE_NAME,
                new String[]{Lesson.COL_ID, Lesson.COL_LESSON_NUM, Lesson.COL_IS_LEARNED, Lesson.COL_IS_QUIZ_TAKEN, Lesson.COL_SCORE},
                Lesson.COL_LESSON_NUM + "=?",
                new String[]{String.valueOf(lessonNum)}, null, null, null, null);

        if(cursor != null) {
            cursor.moveToFirst();
        }

        Lesson lesson = new Lesson(
                cursor.getInt(cursor.getColumnIndex(Lesson.COL_ID)),
                cursor.getInt(cursor.getColumnIndex(Lesson.COL_LESSON_NUM)),
                cursor.getInt(cursor.getColumnIndex(Lesson.COL_IS_LEARNED)),
                cursor.getInt(cursor.getColumnIndex(Lesson.COL_IS_QUIZ_TAKEN)),
                cursor.getInt(cursor.getColumnIndex(Lesson.COL_SCORE))
        );

        cursor.close();

        return lesson;
    }

    public int getLessonStatus(int lessonNum) {
        Lesson lesson = getLesson(lessonNum);
        return lesson.getIs_learned();
    }

    public int getQuizStatus(int lessonNum) {
        Lesson lesson = getLesson(lessonNum);
        return lesson.getIs_quiz_taken();
    }

    public Answer getAnswerModel(int lessonNum, int itemNum) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Answer.TABLE_NAME,
                new String[]{Answer.COL_ID, Answer.COL_LESSON_NUM, Answer.COL_ITEM_NUM, Answer.COL_ANSWER},
                Answer.COL_LESSON_NUM + "=? AND " + Answer.COL_ITEM_NUM + "=?",
                new String[]{String.valueOf(lessonNum), String.valueOf(itemNum)}, null, null, null, null);

        if(cursor != null) {
            cursor.moveToFirst();
        }

        Answer answer = new Answer(
                cursor.getInt(cursor.getColumnIndex(Answer.COL_ID)),
                cursor.getInt(cursor.getColumnIndex(Answer.COL_LESSON_NUM)),
                cursor.getInt(cursor.getColumnIndex(Answer.COL_ITEM_NUM)),
                cursor.getInt(cursor.getColumnIndex(Answer.COL_ANSWER))
        );

        return answer;
    }

    public int getAnswer(int lessonNum, int itemNum) {
        Answer answer = getAnswerModel(lessonNum, itemNum);
        return answer.getAnswer();
    }
}