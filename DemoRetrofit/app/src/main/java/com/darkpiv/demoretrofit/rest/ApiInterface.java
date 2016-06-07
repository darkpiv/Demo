package com.darkpiv.demoretrofit.rest;
/**
 * Created by darkpiv-PC on 6/6/2016.
 */

import com.darkpiv.demoretrofit.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("movie/popular")
    Call<Movie> getTopRatedMovies(@Query("api_key") String apiKey);


}



