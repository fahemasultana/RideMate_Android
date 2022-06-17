package com.xyz.ridemate.signUp.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.JsonObject;
import com.xyz.ridemate.data.remote.ApiClient;
import com.xyz.ridemate.data.remote.ApiService;

import org.json.JSONObject;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainViewModel extends ViewModel {

    private ApiClient apiClient = new ApiClient();
    private MutableLiveData<String> loginResponseLiveData = new MutableLiveData<>();

    public void login(String email, String password) {

        apiClient.service.login(email, password).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.code() < 300)
                    loginResponseLiveData.setValue(response.body().get("message").toString());
                else {
                    try {
                        loginResponseLiveData.setValue(response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                loginResponseLiveData.setValue("Network error");
            }
        });

    }

    public LiveData<String> getLoginResponseLiveData() {
        return loginResponseLiveData;
    }
}
