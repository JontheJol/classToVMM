package com.example.classtovmm.request;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RickAndMortyRequest {
    @GET("character")
    Call<Character> getCharacters(@Path("id") String id);
}
