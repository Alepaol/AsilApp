package agilapp.sms.com.measure.model;

import android.media.Image;

import java.util.Date;

public class ECGMeasurement extends Measurement {
    private Image graph;
    public ECGMeasurement(String measureId, Date measurementDate, String sensor,String description) {
        super(measureId, measurementDate, sensor,description);
        this.graph=graph;
    }
}
