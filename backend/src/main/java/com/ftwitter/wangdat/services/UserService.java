package com.ftwitter.wangdat.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.ftwitter.wangdat.models.Role;
import com.ftwitter.wangdat.models.User;
import com.ftwitter.wangdat.repositories.RoleRepository;
import com.ftwitter.wangdat.repositories.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
@AllArgsConstructor
@Setter
@Getter
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public User registerUser(User user) {
        Set<Role> roles = user.getAuthorities();

        roles.add(roleRepository.findByAuthority("USER"));
        user.setAuthorities(roles);

        return userRepository.save(user);
    }

}
