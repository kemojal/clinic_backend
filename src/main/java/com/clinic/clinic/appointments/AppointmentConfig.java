//package com.clinic.clinic.appointments;
//
//import com.clinic.clinic.appointments.Appointment;
//import com.clinic.clinic.appointments.AppointmentRepository;
//import com.clinic.clinic.doctor.Doctor;
//import com.clinic.clinic.patient.Patient;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Configuration
//public class AppointmentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(AppointmentRepository repository){
//        return args ->{
//
//
//
//            Appointment appointment1 = new Appointment();
//            appointment1.setDoctorId(1L);
//            appointment1.setPatientId(2L);
//            appointment1.setAppointmentDate(LocalDateTime.now().plusDays(1));
//            appointment1.setAppointmentReason("Regular checkup");
//            appointment1.setSummary("Regular checkup, no issues found");
//            appointment1.setFollowUp(false);
//            appointment1.setCreatedAt(LocalDateTime.now());
//            appointment1.setUpdatedAt(LocalDateTime.now());
//
//            Appointment appointment2 = new Appointment();
//            appointment2.setDoctorId(3L);;
//            appointment2.setPatientId(2L);
//            appointment2.setAppointmentDate(LocalDateTime.now().plusDays(2));
//            appointment2.setAppointmentReason("Follow-up for flu");
//            appointment2.setSummary("Patient has recovered well");
//            appointment2.setFollowUp(false);
//            appointment2.setCreatedAt(LocalDateTime.now());
//            appointment2.setUpdatedAt(LocalDateTime.now());
//
//            repository.saveAll(
//                    List.of(
//                            appointment1, appointment2
//                    )
//            );
//
//        };
//    }
//}
