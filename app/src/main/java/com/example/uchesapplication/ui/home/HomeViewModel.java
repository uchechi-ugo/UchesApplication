package com.example.uchesapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to my application");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
/*
The Federation Account Allocation Committee (FAAC) disbursed the sum of N496.39bn to the three tiers of
government in April 2017 from the revenue generated in March 2017.
The amount disbursed comprised of N322.19bn from the Statutory Account; N66.97bn from exchange gain;
N22.59bn from Excess Petroleum Product Tax (PPT) Account; N78.65bn from Valued Added Tax (VAT) while the
sum of N6.33bn was refunded to the Federal Government from the Nigerian National Petroleum Corporation
(NNPC).
Federal government received a total of N195.57bn from the N496.39bn shared. States received a total of
N127.99bn and Local governments received N95.99bn. The sum of N35.75bn was shared among the oil producing
states as 13% derivation fund and N22.26bn transferred to the Excess Petroleum Product Tax (PPT) Account.
Revenue generating agencies such as Nigeria Customs Service (NCS), Federal Inland Revenue Service (FIRS) and
Department of Petroleum Resources (DPR) received N3.84bn, N5.13bn and N3.61bn respectively as cost of
revenue collections.
Further breakdown of revenue allocation distribution to the Federal Government of Nigeria (FGN) revealed that
the sum of N164.64bn was disbursed to the FGN consolidated revenue account; N3.49bn shared as share of
derivation and ecology; N1.75bn as stabilization fund; N5.88bn for the development of natural resources; and
N4.21bn to the Federal Capital Territory (FCT) Abuja. */