package com.alp.JWTSecurity.model;

public class JwtUser {
    private String userName;
    private long id;

    public JwtUser(String userName, long id, String role) {
        this.userName = userName;
        this.id = id;
        this.role = role;
    }
    public JwtUser() {

    }

    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}

