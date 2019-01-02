package agilapp.sms.com.measure.model;

import java.util.List;

public interface MeasureManager {
    void saveMeasurement(Measurement measurement);
    void deleteMeasurement(Measurement measurement);
    Measurement getMeasurement(long id);
    List<Measurement> getAllMeasurement();

}
