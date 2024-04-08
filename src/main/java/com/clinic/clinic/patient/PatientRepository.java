package com.clinic.clinic.patient;

import com.clinic.clinic.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByUsername(String username);
}


