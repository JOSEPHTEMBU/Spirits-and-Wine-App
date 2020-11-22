package com.example.spiritsandwineapp.network;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenBreweryDBApi{
    @GET("breweries/search")
    Call<List<AutocompleteBrewery>> getBrewery(
            @Query("brewType") String brewType
    );

}




