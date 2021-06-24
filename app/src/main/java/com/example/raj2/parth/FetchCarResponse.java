package com.example.raj2.parth;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchCarResponse {

    @SerializedName("cars")
    List<car> carList;

    String error;

    public FetchCarResponse(List<car> carList, String error) {
        this.carList = carList;
        this.error = error;
    }

    public List<car> getCarList() {
        return carList;
    }

    public void setCarList(List<car> carList) {
        this.carList = carList;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
