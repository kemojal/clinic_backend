package com.clinic.clinic.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    // CRUD methods

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Patient not found with id: " + id));
    }

    public Patient updatePatient(Long id, Patient patientDetails) {
        Patient patient = getPatientById(id);
        // Update patient details
        patient.setFirstName(patientDetails.getFirstName());
        patient.setLastName(patientDetails.getLastName());
        patient.setDateOfBirth(patientDetails.getDateOfBirth());
        patient.setSex(patientDetails.getSex());
        patient.setContactInfo(patientDetails.getContactInfo());
        patient.setInsuranceInfo(patientDetails.getInsuranceInfo());
        patient.setAddress(patientDetails.getAddress());
        patient.setOccupation(patientDetails.getOccupation());
        patient.setEmergencyContact(patientDetails.getEmergencyContact());
        patient.setUpdatedAt(LocalDateTime.now());
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public Patient findByUsername(String username) {
        return patientRepository.findByUsername(username);

    }
}


