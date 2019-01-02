package agilapp.sms.com.measure.model;

import android.icu.util.Measure;

import java.util.Date;

import static android.icu.util.MeasureUnit.INCH_HG;

public class BloodPressureMeasurement extends Measurement {
    /**
     * pressure max
    **/
    private Measure maxPressure;
    /**
     * pressure min
     */
    private Measure minPressure;
    public BloodPressureMeasurement(String measureId, Date measurementDate, String sensor,Measure maxPressure,Measure minPressure,String description) {
        super(measureId, measurementDate,description, sensor);
        this.maxPressure =maxPressure;
        this.minPressure=minPressure;
    }

    public void setMaxPressure(Number value) {
        this.maxPressure = new Measure(value,INCH_HG);
    }
    public void setMinPressure(Number value) {
        this.maxPressure = new Measure(value,INCH_HG);
    }



    public Measure getMaxPressure() {
        return maxPressure;
    }

    public Measure getMinPressure() {
        return minPressure;
    }
}
