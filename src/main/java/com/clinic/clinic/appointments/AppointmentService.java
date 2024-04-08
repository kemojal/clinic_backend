package com.clinic.clinic.appointments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;



    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);

    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

//    public List<Appointment> getAppointmentsByPatientId(Long patientId) {
//        return appointmentRepository.findByPatientId(patientId);
//    }
//
//    public List<Appointment> getAppointmentsByDoctorId(Long doctorId) {
//        return appointmentRepository.findByDoctorId(doctorId);
//    }

    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Appointment not found with id: " + id));
    }

    public Appointment updateAppointment(Long id, Appointment appointmentDetails) {
        Appointment appointment = getAppointmentById(id);
        // Update appointment details
        // appointment.setXXX(appointmentDetails.getXXX());
        appointment.setUpdatedAt(LocalDateTime.now());
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}



