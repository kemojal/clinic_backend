package com.clinic.clinic.appointments;

import com.clinic.clinic.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
//    List<Appointment> findByPatientId(Long patientId);
//    List<Appointment> findByDoctorId(Long doctorId);
}



