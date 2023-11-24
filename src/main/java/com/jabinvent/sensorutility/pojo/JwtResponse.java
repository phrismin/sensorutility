package com.jabinvent.sensorutility.pojo;

import com.jabinvent.sensorutility.entity.Role;

import java.util.Set;

public class JwtResponse {
    private static final String TYPE_TOKEN = "Bearer";
    private String token;
    private Long id;
    private String username;
    private Set<Role> roles;

    public JwtResponse(String token, Long id, String username, Set<Role> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.roles = roles;
    }
}
