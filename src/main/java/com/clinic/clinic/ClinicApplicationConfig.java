package com.clinic.clinic;

import com.clinic.clinic.appointments.Appointment;
import com.clinic.clinic.appointments.AppointmentRepository;
import com.clinic.clinic.doctor.Doctor;
import com.clinic.clinic.doctor.DoctorRepository;
import com.clinic.clinic.patient.Patient;
import com.clinic.clinic.patient.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class ClinicApplicationConfig {

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository, DoctorRepository doctorRepository, AppointmentRepository appointmentRepository)  {
        return args -> {

            Patient patient1 = new Patient(
                    "John",
                    "Doe",
                    "john.doe",
                    LocalDate.of(1980, Month.JANUARY, 1),
                    "Male",
                    "{\"phone\": \"123-456-7890\", \"email\": \"john.doe@example.com\"}",
                    "{\"insurance_provider\": \"Provider A\", \"policy_number\": \"ABC123\"}",
                    "123 Main St, City, Country",
                    "Doctor",
                    "{\"name\": \"Jane Doe\", \"relationship\": \"Spouse\", \"phone\": \"987-654-3210\"}",
                    LocalDateTime.now(),
                    LocalDateTime.now()
            );

            Patient patient2 = new Patient(
                    "Jane",
                    "Smith",
                    "jane.smith",
                    LocalDate.of(1990, Month.FEBRUARY, 15),
                    "Female",
                    "{\"phone\": \"987-654-3210\", \"email\": \"jane.smith@example.com\"}",
                    "{\"insurance_provider\": \"Provider B\", \"policy_number\": \"XYZ789\"}",
                    "456 Elm St, City, Country",
                    "Engineer",
                    "{\"name\": \"John Smith\", \"relationship\": \"Parent\", \"phone\": \"123-456-7890\"}",
                    LocalDateTime.now(),
                    LocalDateTime.now()
            );

            patientRepository.saveAll(List.of(patient1, patient2));

            // Load doctors
            Doctor doctor1 = new Doctor();
            doctor1.setUsername("doctor1");
            doctor1.setPassword("password1");
            doctor1.setFullName("Dr. John Doe");
            doctor1.setEmail("john.doe@example.com");
            doctor1.setPhone("123-456-7890");
            doctor1.setSpecialty("Cardiology");

            Doctor doctor2 = new Doctor();
            doctor2.setUsername("doctor2");
            doctor2.setPassword("password2");
            doctor2.setFullName("Dr. Jane Smith");
            doctor2.setEmail("jane.smith@example.com");
            doctor2.setPhone("987-654-3210");
            doctor2.setSpecialty("Pediatrics");

            Doctor doctor3 = new Doctor();
            doctor3.setUsername("doctor3");
            doctor3.setPassword("password3");
            doctor3.setFullName("Dr. Michael Johnson");
            doctor3.setEmail("michael.johnson@example.com");
            doctor3.setPhone("555-555-5555");
            doctor3.setSpecialty("Orthopedics");

            doctorRepository.saveAll(List.of(doctor1, doctor2, doctor3));

            // Load appointments
            Appointment appointment1 = new Appointment();
            appointment1.setDoctorId(1L);
            appointment1.setPatientId(2L);
            appointment1.setAppointmentDate(LocalDateTime.now().plusDays(1));
            appointment1.setAppointmentReason("Regular checkup");
            appointment1.setSummary("Regular checkup, no issues found");
            appointment1.setFollowUp(false);
            appointment1.setCreatedAt(LocalDateTime.now());
            appointment1.setUpdatedAt(LocalDateTime.now());

            Appointment appointment2 = new Appointment();
            appointment2.setDoctorId(3L);
            appointment2.setPatientId(2L);
            appointment2.setAppointmentDate(LocalDateTime.now().plusDays(2));
            appointment2.setAppointmentReason("Follow-up for flu");
            appointment2.setSummary("Patient has recovered well");
            appointment2.setFollowUp(false);
            appointment2.setCreatedAt(LocalDateTime.now());
            appointment2.setUpdatedAt(LocalDateTime.now());

            appointmentRepository.saveAll(List.of(appointment1, appointment2));

        };
    };
}
