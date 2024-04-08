//package com.clinic.clinic.patient;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class PatientConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(PatientRepository repository) {
//        return args -> {
//
//            Patient patient1 = new Patient(
//                    "John",
//                    "Doe",
//                    "john.doe",
//                    LocalDate.of(1980, Month.JANUARY, 1),
//                    "Male",
//                    "{\"phone\": \"123-456-7890\", \"email\": \"john.doe@example.com\"}",
//                    "{\"insurance_provider\": \"Provider A\", \"policy_number\": \"ABC123\"}",
//                    "123 Main St, City, Country",
//                    "Doctor",
//                    "{\"name\": \"Jane Doe\", \"relationship\": \"Spouse\", \"phone\": \"987-654-3210\"}",
//                    LocalDateTime.now(),
//                    LocalDateTime.now()
//            );
//
//            Patient patient2 = new Patient(
//                    "Jane",
//                    "Smith",
//                    "jane.smith",
//                    LocalDate.of(1990, Month.FEBRUARY, 15),
//                    "Female",
//                    "{\"phone\": \"987-654-3210\", \"email\": \"jane.smith@example.com\"}",
//                    "{\"insurance_provider\": \"Provider B\", \"policy_number\": \"XYZ789\"}",
//                    "456 Elm St, City, Country",
//                    "Engineer",
//                    "{\"name\": \"John Smith\", \"relationship\": \"Parent\", \"phone\": \"123-456-7890\"}",
//                    LocalDateTime.now(),
//                    LocalDateTime.now()
//            );
//
//            repository.saveAll(
//                    List.of(patient1, patient2)
//            );
//
//        };
//    }
//}
