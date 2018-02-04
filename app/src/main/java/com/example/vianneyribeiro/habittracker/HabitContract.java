package com.example.vianneyribeiro.habittracker;

import android.provider.BaseColumns;

/**
 * Created by vianneyribeiro on 2/3/18.
 */

public final class HabitContract {

    public HabitContract(){}

    public static abstract class HabitEntry implements BaseColumns{

        public static final String TABLE_NAME = "corrida";




        // Colunas
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_DATE = "data";
        public static final String COLUMN_COMMENT = "comentario";
        public static final String COLUMN_DISTANCE = "distancia";

        //Distancias
        public final static int RUNNING_5K = 0;
        public final static int RUNNING_10K = 1;
        public final static int RUNNING_20K = 2;



    }





}
