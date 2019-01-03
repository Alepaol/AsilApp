package agilapp.sms.com.measure.persistance;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DB extends SQLiteOpenHelper {
    private static  DB sInstance;
    private static final String DATABASE_NAME = "asilApp.db";
    private static final int DATABASE_VERSION = 1;
    static DB getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DB(context.getApplicationContext());
        }
        return sInstance;
    }

    private DB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_MEASUREMENT_TABLE= "CREATE TABLE " + MeasurementContract.MeasurementEntry.TABLE_NAME + "("+
                MeasurementContract.MeasurementEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                MeasurementContract.MeasurementEntry.DATE + "TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "+
                MeasurementContract.MeasurementEntry.DESCRIPTION + " TEXT NOTNULL, "+
                MeasurementContract.MeasurementEntry.MEASUREMENT_VALUE+" TEXT NOTNULL, "+
                MeasurementContract.MeasurementEntry.SENSOR+ "TEXT NOTNULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_MEASUREMENT_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MeasurementContract.MeasurementEntry.TABLE_NAME +";");
        onCreate(sqLiteDatabase);

    }
}
