package agilapp.sms.com.measure.persistance;

import java.util.List;

import agilapp.sms.com.measure.model.Measurement;

public interface MeasurementDao {
    public List<Measurement> getAllStudents();
    public Measurement getStudent(int rollNo);
    public void updateMeasurement(Measurement measurement);
    public void deleteMeasurement(Measurement measurement);
}
