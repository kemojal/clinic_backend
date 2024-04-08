//package com.clinic.clinic.patient;
//
//
//import com.clinic.clinic.patient.Patient;
//import com.clinic.clinic.patient.PatientRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class PatientConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(PatientRepository repository){
//        return args ->{
//
//            Patient patient1 = new Patient();
//            patient1.setFirstName("John");
//            patient1.setLastName("Doe");
//            patient1.setDateOfBirth(LocalDate.of(1990, 5, 15));
//            patient1.setSex("Male");
//            patient1.setContactInfo("{\"email\": \"john.doe@example.com\", \"phone\": \"123-456-7890\"}");
//            patient1.setInsuranceInfo("{\"provider\": \"XYZ Insurance\", \"policy_number\": \"ABC123\"}");
//            patient1.setAddress("123 Main St, City, Country");
//            patient1.setOccupation("Software Engineer");
//            patient1.setEmergencyContact("{\"name\": \"Jane Doe\", \"relationship\": \"Spouse\", \"phone\": \"987-654-3210\"}");
//
//            Patient patient2 = new Patient();
//            patient2.setFirstName("Jane");
//            patient2.setLastName("Smith");
//            patient2.setDateOfBirth(LocalDate.of(1985, 8, 25));
//            patient2.setSex("Female");
//            patient2.setContactInfo("{\"email\": \"jane.smith@example.com\", \"phone\": \"987-654-3210\"}");
//            patient2.setInsuranceInfo("{\"provider\": \"ABC Insurance\", \"policy_number\": \"XYZ456\"}");
//            patient2.setAddress("456 Elm St, City, Country");
//            patient2.setOccupation("Teacher");
//            patient2.setEmergencyContact("{\"name\": \"John Smith\", \"relationship\": \"Spouse\", \"phone\": \"123-456-7890\"}");
//
//            Patient patient3 = new Patient();
//            patient3.setFirstName("Alice");
//            patient3.setLastName("Johnson");
//            patient3.setDateOfBirth(LocalDate.of(1975, 10, 10));
//            patient3.setSex("Female");
//            patient3.setContactInfo("{\"email\": \"alice.johnson@example.com\", \"phone\": \"555-555-5555\"}");
//            patient3.setInsuranceInfo("{\"provider\": \"DEF Insurance\", \"policy_number\": \"MNO789\"}");
//            patient3.setAddress("789 Oak St, City, Country");
//            patient3.setOccupation("Doctor");
//            patient3.setEmergencyContact("{\"name\": \"Bob Johnson\", \"relationship\": \"Sibling\", \"phone\": \"444-444-4444\"}");
//
//
//            repository.saveAll(
//                    List.of(
//                            patient1, patient2, patient3
//                    )
//            );
//
//        };
//    }
//
//
//}
