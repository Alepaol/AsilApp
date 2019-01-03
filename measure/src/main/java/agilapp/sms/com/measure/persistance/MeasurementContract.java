package agilapp.sms.com.measure.persistance;

import android.provider.BaseColumns;

public class MeasurementContract {
    public static final class MeasurementEntry implements BaseColumns {
        static final String TABLE_NAME="measurements";
        static final String DESCRIPTION="description";
        static final String MEASUREMENT_VALUE="measurement_value";
        static final String DATE="date";
        static final String SENSOR="sensor_id";
    }
}
