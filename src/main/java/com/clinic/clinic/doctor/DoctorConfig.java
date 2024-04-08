package com.clinic.clinic.doctor;



import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class DoctorConfig {
    @Bean
    CommandLineRunner commandLineRunner(DoctorRepository repository){
        return args ->{

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

            repository.saveAll(
                    List.of(
                            doctor1, doctor2, doctor3
                    )
            );

        };
    }


}
