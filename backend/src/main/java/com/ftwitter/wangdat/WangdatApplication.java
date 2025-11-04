package com.ftwitter.wangdat;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ftwitter.wangdat.models.Role;
import com.ftwitter.wangdat.models.User;
import com.ftwitter.wangdat.repositories.RoleRepository;
import com.ftwitter.wangdat.repositories.UserRepository;

@SpringBootApplication
public class WangdatApplication {
  public static void main(String[] args) {
    SpringApplication.run(WangdatApplication.class, args);
  }

  @Bean
  CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository) {
    return args -> {
      Role role = roleRepository.save(new Role(null, "USER"));

      Set<Role> authorities = new HashSet<>();

      authorities.add(roleRepository.findById(role.getRoleId()).get());

      userRepository.save(User
          .builder()
          .username("dat")
          .email("tranquangdat23122004@gmail.com")
          .phone("0355836590")
          .authorities(authorities)
          .build());
    };
  }
}
