package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam= new Student(
                     1L,
                     "Mariam",
                     21,
                     LocalDate.of(2000, Month.JANUARY,5),
                     "mariam.jamal@gamil.com"
                );
            Student marcello= new Student(
                    2L,
                    "Marcello",
                    22,
                    LocalDate.of(1999, Month.FEBRUARY,1),
                    "marcellino22@gamil.com"
                    );
            repository.saveAll(
                    List.of(mariam,marcello)
            );
        };

    }
}
