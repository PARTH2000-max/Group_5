package com.example.raj2.parth;


import retrofit2.Call;
import retrofit2.http.GET;

public interface api {

    @GET("fetchusers.php")
    Call<FetchUserResponse> fetchusers();

    @GET("fetchcar.php")
    Call<FetchCarResponse> fetchcars();

    @GET("fetchrating.php")

    Call<FecthRatingResponse> fetchrating();
}
