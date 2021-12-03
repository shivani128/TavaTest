package com.example.tavatest;
import com.example.tavatest.com.example.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
interface APIInterface {

    @GET("api/users?")
    Call<Example> doGetUserList(@Query("offset") String offset, @Query("limit") String limit);

}
