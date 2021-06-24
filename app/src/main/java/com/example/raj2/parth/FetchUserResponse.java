package com.example.raj2.parth;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchUserResponse {

    @SerializedName("users")
    List<user> userList;

    String error;

    public FetchUserResponse(List<user> userList, String error) {
        this.userList = userList;
        this.error = error;
    }

    public List<user> getUserList() {
        return userList;
    }

    public void setUserList(List<user> userList) {
        this.userList = userList;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
