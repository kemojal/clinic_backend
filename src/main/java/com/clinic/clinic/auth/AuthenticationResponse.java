package com.clinic.clinic.auth;

public class AuthenticationResponse {
    private String token;
    private Object userDetails;

    public AuthenticationResponse(String token) {
        this.token = token;
        this.userDetails = userDetails;
    }

    // getters and setters


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(Object userDetails) {
        this.userDetails = userDetails;
    }
}

