package com.alexandria.alexandria;

import com.alexandria.alexandria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlexandriaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlexandriaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
