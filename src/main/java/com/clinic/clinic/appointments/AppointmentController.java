package com.clinic.clinic.appointments;

import com.clinic.clinic.appointments.Appointment;
import com.clinic.clinic.appointments.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

//    @GetMapping("/by-patient/{patientId}")
//    public List<Appointment> getAppointmentsByPatientId(@PathVariable Long patientId) {
//        return appointmentService.getAppointmentsByPatientId(patientId);
//    }
//
//    @GetMapping("/by-doctor/{doctorId}")
//    public List<Appointment> getAppointmentsByDoctorId(@PathVariable Long doctorId) {
//        return appointmentService.getAppointmentsByDoctorId(doctorId);
//    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        return appointmentService.getAppointmentById(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointmentDetails) {
        return appointmentService.updateAppointment(id, appointmentDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteAppointment(id);
        return ResponseEntity.ok().build();
    }
}


