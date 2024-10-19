package com.fcynn.basicauthenticationsecurity.service;

import com.fcynn.basicauthenticationsecurity.dto.CreateUserRequest;
import com.fcynn.basicauthenticationsecurity.model.User;
import com.fcynn.basicauthenticationsecurity.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public Optional<User> getByUsername(String username){
        return this.userRepository.findByUsername(username);
    }

    public User createUser(CreateUserRequest createUserRequest){
        User newUser=User.builder()
                .name(createUserRequest.name())
                .username(createUserRequest.username())
                .password(passwordEncoder.encode(createUserRequest.password()))
                .authorities(createUserRequest.authorities())
                .accountNonExpired(true)
                .credentialsNonExpired(true)
                .isEnabled(true)
                .accountNonLocked(true)

            .build();
        return this.userRepository.save(newUser);
    }

}
