package com.example.uchesapplication.ui.aboutsoftware;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutsoftwareViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public AboutsoftwareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("UGO, UCHECHI CHIOMA. 17CJ022547.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}