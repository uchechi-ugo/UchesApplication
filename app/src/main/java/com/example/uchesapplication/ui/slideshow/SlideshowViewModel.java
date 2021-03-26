package com.example.uchesapplication.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("The Federal Accounts Allocation Committee (FAAC) of Nigeria disbursed the amounts shown in the given data in the year 2017."
                +"\n This data shows the cumulative average of the money disbursed (in billions of Naira) over the entire year on a monthly basis"
                +"\n The money disbursed comprises of money from the Statutory Account, the exchange gain, Excess Petroleum Product Tax (PPT) Account, and many other sources."
                +"\n The Federal Government receives the largest share, the States receive the larger share, and finally the Local governments.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}