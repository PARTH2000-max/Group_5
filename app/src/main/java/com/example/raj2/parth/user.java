package com.example.raj2.parth;

public class user {

    int id;

    String username,email,con_number;

    public user(int id, String username, String email, String con_number) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.con_number = con_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCon_number() {
        return con_number;
    }

    public void setCon_number(String con_number) {
        this.con_number = con_number;
    }
}
