package com.clinic.clinic.appointments;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Appointments")
public class Appointment {
    @Id
    @SequenceGenerator(
            name = "appointment_sequence",
            sequenceName =  "appointment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "appointment_sequence"
    )
    private Long appointmentId;

//    @ManyToOne
//    @JoinColumn(name = "doctor_id")
//    private Doctor doctor;

//    @ManyToOne
//    @JoinColumn(name = "patient_id")
//    private Patient patient;
@Column(name = "doctor_id")
private Long doctorId;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "appointment_date", nullable = false)
    private LocalDateTime appointmentDate;

    @Column(name = "appointment_reason")
    private String appointmentReason;

    @Column(name = "summary")
    private String summary;

    @Column(name = "chief_complaint")
    private String chiefComplaint;

    @Column(name = "blood_pressure", length = 20)
    private String bloodPressure;

    @Column(name = "temperature", length = 10)
    private String temperature;

    @Column(name = "weight", length = 10)
    private String weight;

    @Column(name = "height", length = 10)
    private String height;

    @Column(name = "heart_rate", length = 10)
    private String heartRate;

    @Column(name = "blood_oxygen_level", length = 10)
    private String bloodOxygenLevel;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "prescription")
    private String prescription;

    @Column(name = "follow_up")
    private boolean followUp;

    @Column(name = "follow_up_date")
    private LocalDateTime followUpDate;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    // Constructors, getters, and setters


    public Appointment() {
    }

    public Appointment(Long patientId, LocalDateTime appointmentDate, String appointmentReason, String summary, String chiefComplaint, String bloodPressure, String temperature, String weight, String height, String heartRate, String bloodOxygenLevel, String diagnosis, String prescription, boolean followUp, LocalDateTime followUpDate) {

        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.appointmentReason = appointmentReason;
        this.summary = summary;
        this.chiefComplaint = chiefComplaint;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
        this.bloodOxygenLevel = bloodOxygenLevel;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.followUp = followUp;
        this.followUpDate = followUpDate;
        this.createdAt = LocalDateTime.now();
    }

    public Appointment(Long appointmentId, Long doctorId, Long patientId, LocalDateTime appointmentDate, String appointmentReason, String summary, String chiefComplaint, String bloodPressure, String temperature, String weight, String height, String heartRate, String bloodOxygenLevel, String diagnosis, String prescription, boolean followUp, LocalDateTime followUpDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.appointmentReason = appointmentReason;
        this.summary = summary;
        this.chiefComplaint = chiefComplaint;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
        this.bloodOxygenLevel = bloodOxygenLevel;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.followUp = followUp;
        this.followUpDate = followUpDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }


    //    public Doctor getDoctor() {
//        return doctor;
//    }
//
//    public void setDoctor(Doctor doctor) {
//        this.doctor = doctor;
//    }
//
//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentReason() {
        return appointmentReason;
    }

    public void setAppointmentReason(String appointmentReason) {
        this.appointmentReason = appointmentReason;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getBloodOxygenLevel() {
        return bloodOxygenLevel;
    }

    public void setBloodOxygenLevel(String bloodOxygenLevel) {
        this.bloodOxygenLevel = bloodOxygenLevel;
    }

    public String getDiagnosis() {
        return diagnosis;
    }


    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public boolean isFollowUp() {
        return followUp;
    }

    public void setFollowUp(boolean followUp) {
        this.followUp = followUp;
    }

    public LocalDateTime getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(LocalDateTime followUpDate) {
        this.followUpDate = followUpDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


}

