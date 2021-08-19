package com.com.blogCRUD.service;

import com.com.blogCRUD.controller.dto.CMRespDto;
import com.com.blogCRUD.controller.dto.LoginDto;
import com.com.blogCRUD.model.User;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("/login")
    Call<CMRespDto<User>> login(@Body LoginDto loginDto);

    Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://192.168.25.29:8080")
            .build();

    UserService service = retrofit.create(UserService.class);
}
