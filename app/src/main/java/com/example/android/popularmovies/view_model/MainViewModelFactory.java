package com.example.android.popularmovies.view_model;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;


public class MainViewModelFactory implements ViewModelProvider.Factory {

    private String mApiKey;

    public MainViewModelFactory(String apiKey) {
        mApiKey = apiKey;
    }


    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainViewModel(mApiKey);
    }
}