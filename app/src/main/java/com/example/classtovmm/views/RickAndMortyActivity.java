package com.example.classtovmm.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.classtovmm.R;
import com.example.classtovmm.view_models.CharacteViewModel;

public class RickAndMortyActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rick_and_morty);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        CharacteViewModel characteViewModel = viewModelProvider.get(CharacteViewModel.class);
        characteViewModel.getcharacter(2).observe(this,new );
    }
}