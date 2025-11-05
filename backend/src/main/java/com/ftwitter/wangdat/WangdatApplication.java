package com.ftwitter.wangdat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ftwitter.wangdat.models.Role;
import com.ftwitter.wangdat.repositories.RoleRepository;
import com.ftwitter.wangdat.services.UserService;

@SpringBootApplication
public class WangdatApplication {
    public static void main(String[] args) {
        SpringApplication.run(WangdatApplication.class, args);
    }

    @Bean
    CommandLineRunner run(RoleRepository roleRepository, UserService userService) {
        return args -> {
            Role role = roleRepository.save(new Role(null, "USER"));
        };
    }
}
