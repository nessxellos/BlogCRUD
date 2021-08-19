package com.com.blogCRUD.controller;

import com.com.blogCRUD.controller.dto.CMRespDto;
import com.com.blogCRUD.controller.dto.LoginDto;
import com.com.blogCRUD.model.User;
import com.com.blogCRUD.service.UserService;

import retrofit2.Call;

public class AuthController {
    private static final String TAG = "AuthController";
    private UserService userService = UserService.service;

    public Call<CMRespDto<User>> login(LoginDto loginDto){
        return userService.login(loginDto);
    }
}
