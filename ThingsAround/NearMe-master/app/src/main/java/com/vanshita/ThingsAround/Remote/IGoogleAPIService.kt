package com.gopal.ThingsAround.Remote

import com.gopal.ThingsAround.Model.MyPlaces
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface IGoogleAPIService {
    @GET
    fun getNearbyPlaces(@Url url: String):Call<MyPlaces>
}