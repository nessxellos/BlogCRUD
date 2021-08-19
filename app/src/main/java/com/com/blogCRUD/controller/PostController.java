package com.com.blogCRUD.controller;

import android.util.Log;

import com.com.blogCRUD.controller.dto.PostUpdateDto;
import com.com.blogCRUD.model.Post;
import com.com.blogCRUD.service.PostService;
import com.com.blogCRUD.controller.dto.CMRespDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

// VIEW 와 통신하는 중개자
public class PostController {

    private static final String TAG = "PostController";
    private PostService postService = PostService.service;

    public Call<CMRespDto<List<Post>>> findAll(){
        return postService.findAll();
    }

    public Call<CMRespDto<Post>> findById(int postId){
        return postService.findById(postId);
    }


    public Call<CMRespDto> deleteById(int postId){
        return postService.deleteById(postId);
    }

    public Call<CMRespDto<Post>> update(int postId, PostUpdateDto postUpdateDto){
        return postService.update(postId, postUpdateDto);
    }

    // test
    public void initPost(){
        Log.d(TAG, "initPost: ");
        postService.initPost().enqueue(new Callback<CMRespDto<List<Post>>>() {
            @Override
            public void onResponse(Call<CMRespDto<List<Post>>> call, Response<CMRespDto<List<Post>>> response) {
                CMRespDto<List<Post>> cm =  response.body();
                Log.d(TAG, "onResponse: title : "+cm.getData().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<CMRespDto<List<Post>>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });

    }
}
