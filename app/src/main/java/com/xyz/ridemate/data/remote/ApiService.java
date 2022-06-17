package com.xyz.ridemate.data.remote;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @FormUrlEncoded
    @POST("api/v1/auth/login")
    Call<JsonObject> login(@Field("email") String email,
                           @Field("password") String password);

}
