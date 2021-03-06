package com.androidtutz.ahmedkhozam.tmdbclient.service;

import com.androidtutz.ahmedkhozam.tmdbclient.model.MovieDBResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MovieDataService {


    @GET("movie/popular")
    Call<MovieDBResponse> getPopularMovies(@Query("api_key") String apiKey);


}
