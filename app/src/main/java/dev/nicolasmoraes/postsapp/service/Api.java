package dev.nicolasmoraes.postsapp.service;

import java.util.ArrayList;

import dev.nicolasmoraes.postsapp.model.Posts;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("posts")
    Call<ArrayList<Posts>> getPosts();
}
