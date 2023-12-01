package com.example.classtovmm.repository;


import androidx.lifecycle.MutableLiveData;

import com.example.classtovmm.request.RickAndMortyRequest;
import com.example.classtovmm.retrofit.RetroFitRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RickAndMortyRepository {
    public Retrofit retrofit;
    void setRetrofit(){
        retrofit = RetroFitRequest.getRetrofit();
    }
    public MutableLiveData<Character> getCharacter(String id){
        setRetrofit();
        RickAndMortyRequest rickAndMortyRequest= retrofit.create(RickAndMortyRequest.class);
        Call<Character> characterCall = rickAndMortyRequest.getCharacters(id);
        MutableLiveData<Character> characterLiveData= new MutableLiveData<>();
        characterCall.enqueue(new Callback<Character>() {
            @Override
            public void onResponse(Call<Character> call, Response<Character> response) {
                if(response.isSuccessful()){
                    Character chara = response.body();
                    characterLiveData.setValue(chara);
                }
            }

            @Override
            public void onFailure(Call<Character> call, Throwable t) {

            }
        });
        return characterLiveData;
    }
}
