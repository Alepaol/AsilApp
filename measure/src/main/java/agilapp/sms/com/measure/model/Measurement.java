package agilapp.sms.com.measure.model;

import java.util.Date;

/**
 * this class represents the data Measurement, he is used for identify and model a  measurement
 */

public abstract  class Measurement {
    /**
     * Unique id of measurement
     */
    private final String measureId ;
    /**
     * description of measurement
     */
    private String description;

    /**
     * date of measurement
     */
    private Date measurementDate;
    /**
     * Sensor that detect this measurement
     */
    private String sensor;




    public Measurement(String measureId,Date measurementDate,String sensor,String description) {
        this.description=description;
        this.measureId = measureId;
        this.measurementDate=measurementDate;
        this.sensor=sensor;

    }



    public void setDescription(String description) {
        this.description = description;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public void setMeasurementDate(Date measurementDate) {
        this.measurementDate = measurementDate;
    }


    public Date getMeasurementDate() {
        return measurementDate;
    }


    public String getMeasureId() {
        return measureId;
    }

    public String getDescription() {
        return description;
    }

    public String getSensor() {
        return sensor;
    }







}
