package com.jabinvent.sensorutility.dto;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
