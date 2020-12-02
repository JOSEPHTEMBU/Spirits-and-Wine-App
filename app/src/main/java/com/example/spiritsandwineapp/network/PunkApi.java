package com.example.spiritsandwineapp.network;

import com.example.spiritsandwineapp.models.Brew;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PunkApi {
    @GET("beers")
    Call<ArrayList<Brew>> getBeers(

    );
}
