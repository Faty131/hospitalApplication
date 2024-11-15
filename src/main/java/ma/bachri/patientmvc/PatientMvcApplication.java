package ma.bachri.patientmvc;

import ma.bachri.patientmvc.entities.Patient;
import ma.bachri.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save
                    (new Patient(null,"youssef",new Date(),false,12));
            patientRepository.save
                    (new Patient(null,"Fatima",new Date(),true,11));
            patientRepository.save
                    (new Patient(null,"Aziza",new Date(),true,110));
            patientRepository.save
                    (new Patient(null,"Saad",new Date(),false,600));
            patientRepository.save
                    (new Patient(null,"Aicha",new Date(),true,558));
            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };

    }

}
