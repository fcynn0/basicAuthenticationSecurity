package com.fcynn.basicauthenticationsecurity.dto;

import com.fcynn.basicauthenticationsecurity.model.Role;
import lombok.Builder;

import java.util.Set;

@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Set<Role> authorities

) {
}
