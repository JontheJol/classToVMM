package com.example.classtovmm.view_models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.classtovmm.models.Character;
import com.example.classtovmm.repository.RickAndMortyRepository;

public class CharacteViewModel extends ViewModel {
    private MutableLiveData<Character> character;
    private RickAndMortyRepository rickAndMortyRepository;
    public CharacteViewModel(RickAndMortyRepository rickAndMortyRepository){
        this.rickAndMortyRepository = rickAndMortyRepository;
    }
    public LiveData<Character> getcharacter (String id){
        if (character == null){
            character = new MutableLiveData<>();
            loadcharacter(id);
        }
        return character;
    }

    private  void  loadcharacter(String id){
        character =

    }
}
