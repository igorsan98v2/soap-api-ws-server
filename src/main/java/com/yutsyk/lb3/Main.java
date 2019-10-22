package com.yutsyk.lb3;
import com.yutsyk.lb3.repo.EnterpriseRepo;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = EnterpriseRepo.class)
public class    Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}