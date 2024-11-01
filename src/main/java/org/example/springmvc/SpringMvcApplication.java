package org.example.springmvc;

import org.example.springmvc.entities.*;
import org.example.springmvc.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository ;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
 @Override
    public void run(String... args) throws Exception{
       /* patientRepository.save(new Patient(null,"oussama","hajjiri", new Date(),false));
     patientRepository.save(new Patient(null,"hakim","ziyech", new Date(),false));
     patientRepository.save(new Patient(null,"othman","chligi", new Date(),true));
     patientRepository.save(new Patient(null,"hicham","lamrini", new Date(),false));
*/
 }
}
