package com.fcynn.basicauthenticationsecurity;

import com.fcynn.basicauthenticationsecurity.dto.CreateUserRequest;
import com.fcynn.basicauthenticationsecurity.model.Role;
import com.fcynn.basicauthenticationsecurity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor

public class BasicAuthenticationSecurityApplication implements CommandLineRunner {
    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(BasicAuthenticationSecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createDummyData();

    }
    private void createDummyData(){
        CreateUserRequest request= CreateUserRequest.builder()
                .name("Emin")
                .username("emin")
                .password("pass")
                .authorities(Set.of(Role.ROLE_USER))

                .build();
        userService.createUser(request);

        CreateUserRequest request2= CreateUserRequest.builder()
                .name("FSK")
                .username("fsk")
                .password("pass")
                .authorities(Set.of(Role.ROLE_FSK))

                .build();
        userService.createUser(request2);

        CreateUserRequest request3= CreateUserRequest.builder()
                .name("Admin")
                .username("admin")
                .password("pass")
                .authorities(Set.of(Role.ROLE_ADMIN))

                .build();
        userService.createUser(request3);
    }

}
