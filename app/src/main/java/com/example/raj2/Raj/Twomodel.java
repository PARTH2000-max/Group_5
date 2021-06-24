package com.example.raj2.Raj;

public class Twomodel {

    public String getCar_name() {
        return Car_name;
    }

    public void setCar_name(String car_name) {
        Car_name = car_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRatting() {
        return Ratting;
    }

    public void setRatting(String ratting) {
        Ratting = ratting;
    }

    public String getDate_of_Register() {
        return Date_of_Register;
    }

    public void setDate_of_Register(String date_of_Register) {
        Date_of_Register = date_of_Register;
    }

    public Twomodel(String car_name, String model, String price, String ratting, String date_of_Register) {
        Car_name = car_name;
        this.model = model;
        this.price = price;
        Ratting = ratting;
        Date_of_Register = date_of_Register;
    }

    String Car_name;
    String model;
    String price;
    String Ratting;
    String Date_of_Register;

}