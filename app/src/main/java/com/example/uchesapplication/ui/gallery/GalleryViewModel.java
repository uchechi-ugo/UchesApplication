package com.example.uchesapplication.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("FAAC data for the 36 states in 2017 (Nigeria)");
    }

    public LiveData<String> getText() {
        return mText;
    }
}