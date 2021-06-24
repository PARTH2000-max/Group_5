package com.example.raj2.parth;

public class LoginResponse {

    user user;

    String error,message;

    public LoginResponse(user user, String error, String message) {
        this.user = user;
        this.error = error;
        this.message = message;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
