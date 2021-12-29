package uz.inlab.spring.springdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student max = new Student(
                    "Muzaffar",
                    "max@alpha.com",
                    LocalDate.of(2000, Month.JANUARY, 1),
                    26
            );
            Student botir = new Student(
                    "Botir",
                    "botir@alpha.com",
                    LocalDate.of(2000, Month.JANUARY, 1),
                    26
            );

            repository.saveAll(
                    List.of(max, botir)
            );
        };
    }

    ;
}
