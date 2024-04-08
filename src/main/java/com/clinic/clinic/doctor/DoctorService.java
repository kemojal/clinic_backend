package com.clinic.clinic.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    // Create
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Read
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Doctor not found with id: " + id));
    }

    // Update
    public Doctor updateDoctor(Long id, Doctor doctorDetails) {
        Doctor doctor = getDoctorById(id);
        doctor.setUsername(doctorDetails.getUsername());
        doctor.setPassword(doctorDetails.getPassword());
        doctor.setFullName(doctorDetails.getFullName());
        doctor.setEmail(doctorDetails.getEmail());
        doctor.setPhone(doctorDetails.getPhone());
        doctor.setSpecialty(doctorDetails.getSpecialty());
        doctor.setUpdatedAt(LocalDateTime.now());
        return doctorRepository.save(doctor);
    }

    // Delete
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    public Doctor findByUsername(String username) {
        return doctorRepository.findByUsername(username);
    }
}

