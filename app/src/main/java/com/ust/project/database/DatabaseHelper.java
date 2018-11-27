package com.ust.project.database;

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
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Answer.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Lesson.TABLE_NAME);
        onCreate(db);
    }


    public long addAnswer(int lessonNum, int itemNum, int answer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Answer.COL_LESSON_NUM, lessonNum);
        values.put(Answer.COL_ITEM_NUM, itemNum);
        values.put(Answer.COL_ANSWER, answer);

        long id = db.insert(Answer.TABLE_NAME, null, values);

        db.close();

        return id;
    }

    public int updateAnswer(int id, int newAnswer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Answer.COL_ANSWER, newAnswer);

        return db.update(Answer.TABLE_NAME, values, Answer.COL_ID + "=?",
                new String[]{String.valueOf(id)});
    }

    public int updateLessonState(int lessonNum, int isLearned) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Lesson.COL_IS_LEARNED, isLearned);

        return db.update(Lesson.TABLE_NAME, values, Lesson.COL_LESSON_NUM + "=?",
                new String[]{String.valueOf(lessonNum)});
    }

    public int updateLessonQuizState(int lessonNum, int isQuizTaken) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Lesson.COL_IS_QUIZ_TAKEN, isQuizTaken);

        return db.update(Lesson.TABLE_NAME, values, Lesson.COL_LESSON_NUM + "=?",
                new String[]{String.valueOf(lessonNum)});
    }
}

//public class DatabaseHelper extends SQLiteOpenHelper {
//
//    private static final int DATABASE_VERSION = 1;
//    private static final String DATABASE_NAME = "SIKLAB";
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL(Answer.CREATE_TABLE);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + Answer.TABLE_NAME);
//        onCreate(db);
//    }
//
//    public long insertAnswer(int lesson_num, int item_num, int answer) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//
//        values.put(Answer.COL_LESSON_NUM, lesson_num);
//        values.put(Answer.COL_ITEM_NUM, item_num);
//        values.put(Answer.COL_ANSWER, answer);
//
//        long id = db.insert(Answer.TABLE_NAME, null, values);
//
//        db.close();
//
//        return id;
//    }
//
//    public Answer getAnswer(int lesson_num, int item_num) {
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.query(Answer.TABLE_NAME,
//                new String[]{Answer.COL_ID, Answer.COL_LESSON_NUM, Answer.COL_ITEM_NUM, Answer.COL_ANSWER},
//                Answer.COL_LESSON_NUM + "=? AND " + Answer.COL_ITEM_NUM + "=?",
//                new String[]{String.valueOf(lesson_num), String.valueOf(item_num)}, null, null, null, null);
//
//        if(cursor != null) {
//            cursor.moveToFirst();
//        }
//
//        Answer answer = new Answer(
//          cursor.getInt(cursor.getColumnIndex(Answer.COL_ID)),
//          cursor.getInt(cursor.getColumnIndex(Answer.COL_LESSON_NUM)),
//          cursor.getInt(cursor.getColumnIndex(Answer.COL_ITEM_NUM)),
//          cursor.getInt(cursor.getColumnIndex(Answer.COL_ANSWER))
//        );
//
//        cursor.close();
//
//        return answer;
//    }
//
//    public int updateAnswer(int lesson_num, int item_num, int answer) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(Answer.COL_ANSWER, answer);
//
//        return db.update(Answer.TABLE_NAME, values, Answer.COL_LESSON_NUM + "=? AND " + Answer.COL_ITEM_NUM + "=?",
//                new String[]{String.valueOf(lesson_num), String.valueOf(item_num)});
//    }
//
//    public void deleteAnswer(int lesson_num, int item_num) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(Answer.TABLE_NAME, Answer.COL_LESSON_NUM + "=? AND " + Answer.COL_ITEM_NUM + "=?",
//                new String[]{String.valueOf(lesson_num), String.valueOf(item_num)});
//        db.close();
//    }
//}
