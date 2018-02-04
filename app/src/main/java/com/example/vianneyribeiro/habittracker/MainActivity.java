package com.example.vianneyribeiro.habittracker;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HabitDbHelper habitDbHelper = new HabitDbHelper(this);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = formatter.format(date);

        habitDbHelper.insertHabit(dateString, HabitContract.HabitEntry.RUNNING_5K,
                "Corrida tranquila sem maiores problemas");
        habitDbHelper.insertHabit(dateString, HabitContract.HabitEntry.RUNNING_10K,
                "A batata da perna começa a doer");
        habitDbHelper.insertHabit(dateString, HabitContract.HabitEntry.RUNNING_20K,
                "Desistência após 14 Km");

        Cursor cursor = habitDbHelper.readHabits();
        while (cursor.moveToNext()) {
            Log.v(TAG, "habit: " + cursor.getInt(0) + " " + cursor.getString(1) +
                    " " + cursor.getInt(2) + " " + cursor.getString(3));
        }
    }
}
