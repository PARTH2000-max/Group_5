package com.example.raj2.parth;

public class rating {

    int car_id;

    String company , model, year, variant, color, kmdriven, price, rating;

    public rating(int car_id, String company, String model, String year, String variant, String color, String kmdriven, String price, String rating) {
        this.car_id = car_id;
        this.company = company;
        this.model = model;
        this.year = year;
        this.variant = variant;
        this.color = color;
        this.kmdriven = kmdriven;
        this.price = price;
        this.rating = rating;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKmdriven() {
        return kmdriven;
    }

    public void setKmdriven(String kmdriven) {
        this.kmdriven = kmdriven;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
