package com.example.raj2.parth;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FecthRatingResponse {

    @SerializedName("rating")
    List<rating> ratingList;

    String error;

    public FecthRatingResponse(List<rating> ratingList, String error) {
        this.ratingList = ratingList;
        this.error = error;
    }

    public List<rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<rating> ratingList) {
        this.ratingList = ratingList;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
