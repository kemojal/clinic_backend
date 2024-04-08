package com.clinic.clinic.patient;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Patients")
public class Patient {
    @Id
    @SequenceGenerator(
            name = "patient_sequence",
            sequenceName =  "patient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    private Long patientId;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 50)
    private String username;


    @Transient
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(length = 10)
    private String sex;

    @Column(name = "contact_info", columnDefinition = "JSONB")
    @ColumnTransformer(write = "?::jsonb")
    private String contactInfo;

    @Column(name = "insurance_info", columnDefinition = "JSONB")
    @ColumnTransformer(write = "?::jsonb")
    private String insuranceInfo;

    @Column(length = 255)
    private String address;

    @Column(length = 100)
    private String occupation;

    @Column(name = "emergency_contact", columnDefinition = "JSONB")
    @ColumnTransformer(write = "?::jsonb")
    private String emergencyContact;


    @Transient
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    // Constructors, getters, and setters

    public Patient() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Patient(String firstName, String lastName, String username, LocalDate dateOfBirth, String sex, String contactInfo, String insuranceInfo, String address, String occupation, String emergencyContact, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.contactInfo = contactInfo;
        this.insuranceInfo = insuranceInfo;
        this.address = address;
        this.occupation = occupation;
        this.emergencyContact = emergencyContact;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Patient(Long patientId, String firstName, String lastName, String username, LocalDate dateOfBirth, String sex, String contactInfo, String insuranceInfo, String address, String occupation, String emergencyContact, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.contactInfo = contactInfo;
        this.insuranceInfo = insuranceInfo;
        this.address = address;
        this.occupation = occupation;
        this.emergencyContact = emergencyContact;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Patient(String firstName, String lastName, String username, LocalDate dateOfBirth, String sex, String contactInfo, String insuranceInfo, String address, String occupation, String emergencyContact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.contactInfo = contactInfo;
        this.insuranceInfo = insuranceInfo;
        this.address = address;
        this.occupation = occupation;
        this.emergencyContact = emergencyContact;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getInsuranceInfo() {
        return insuranceInfo;
    }

    public void setInsuranceInfo(String insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
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
